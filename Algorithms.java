import java.util.Stack;
import java.util.Iterator;

class Algorithms 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(12);
		stack.push(22);
		stack.push(3);
		stack.push(27);
		stack.push(18);
		stack.push(82);
		stack.push(16);
		stack.push(12);
		stack.push(33);
		stack.push(19);
		stack.push(28);
		System.out.println("\n" + getLargest(stack));
	}
	
	public static Integer getLargest(Stack myStack)
	{
		Integer largest = null;
		Iterator<Integer> iterator = myStack.iterator();
		while(iterator.hasNext())
		{
			Integer tmp = iterator.next();
			if(largest == null || tmp > largest)
			{
				largest = tmp;
			}
		}
		return largest;
	}
}