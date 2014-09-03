import java.util.Stack;
import java.util.Iterator;

class GetLargest 
{
	Stack<Integer> largest = new Stack<Integer>();
	Stack<Integer> stack = new Stack<Integer>();
	
	public void push(Integer value)
	{
		stack.push(value);
		if(value >= largest.peek())
		{
			largest.push(value);
		}
	}
	
	public Integer pop()
	{
		Integer value = stack.pop();
		if(value == largest.peek())
		{
			largest.pop();
		}
		return value;
	}
	
	public Integer getLargest()
	{
		return largest.peek();
	}
}