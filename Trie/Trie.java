public class Trie 
{	
	TrieNode root;
	
	public Trie()
	{
		root = new TrieNode(' ');
	}
	
	
	public boolean add(String word)
	{
		TrieNode currentNode = root;
		if(find(word))
		{
			return false;
		}
		for(char c : word.toCharArray())
		{
			TrieNode child = currentNode.hasChild(c);
			if(child == null)
			{
				currentNode.children.add(new TrieNode(c));
				currentNode = currentNode.hasChild(c);
			}
			else
			{
				currentNode = child;
			}
			currentNode.letterCount++;
		}
		currentNode.endOfWord = true;
		return true;
	}
	
	
	public boolean delete(String word)
	{
		TrieNode currentNode = root;
		if(!find(word))
		{
			return false;
		}
		
		for(char c : word.toCharArray())
		{
			TrieNode child = currentNode.hasChild(c);
			if(child.letterCount == 1)
			{
				currentNode.children.remove(c);
				return true;
			}
			else
			{
				child.letterCount--;
				currentNode = child;
			}
		}
		currentNode.endOfWord = false;
		return true;
	}
	
	
	public boolean find(String word)
	{
		TrieNode currentNode = root;
		for(char c : word.toCharArray())
		{
			currentNode = currentNode.hasChild(c);
			if(currentNode == null)
			{
				return false;
			}
		}
		return currentNode.endOfWord ? true : false;
	}
}