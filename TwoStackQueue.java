import java.util.*;

class TwoStackQueue 
{
	Stack<Integer> frontStack = new Stack<Integer>();
	Stack<Integer> backStack = new Stack<Integer>();
	
	public void enqueue(Integer value)
	{
		while(!backStack.empty())
		{
			frontStack.push(backStack.pop());
		}
		frontStack.push(value);
	}
	
	public Integer dequeue()
	{
		while(!frontStack.empty())
		{
			backStack.push(frontStack.pop());
		}
		return backStack.pop();
	}
	
	public Integer size()
	{
		return frontStack.size() > backStack.size() ? frontStack.size() : backStack.size();
	}
}