class DuplicateNumber 
{	
	public static int findDuplicate(int[] numbers)
	{
		int sumOfNumbers = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			sumOfNumbers+= numbers[i];
		}
		
		int lengthByInduction = ((numbers.length-1)*(numbers.length-2))/2;
		
		return sumOfNumbers - lengthByInduction;
	}
}