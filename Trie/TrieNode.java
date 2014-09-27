import java.util.LinkedList;
class TrieNode 
{
	char letter;
	int letterCount;
	boolean endOfWord;
	LinkedList<TrieNode> children;
	
	public TrieNode(char letter)
	{
		this.letter = letter;
		this.letterCount = 0;
		this.endOfWord = false;
		this.children = new LinkedList<TrieNode>();
	}
	
	public TrieNode hasChild(char letter)
	{
		if(this.children != null)
		{
			for(TrieNode tmp : this.children)
			{
				if(tmp.letter == letter)
				{
					return tmp;
				}
			}
		}
		
		return null;
	}
}