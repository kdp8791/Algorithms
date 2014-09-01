class MergeSort 
{
	public static void main(String[] args) 
	{
		int[] numbers = {4, 3, 10, 3, 7, 9};
		numbers = mergeSort(numbers);
		for(int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
	}
	
	private static int[] mergeSort(int[] numbers)
	{
		if(numbers.length > 1)
		{
			int halfSize = (numbers.length)/2;
			int[] firstHalf = new int[halfSize];
			int[] secondHalf = new int[numbers.length-halfSize];
			System.arraycopy(numbers, 0, firstHalf, 0, halfSize);
			System.arraycopy(numbers, firstHalf.length, secondHalf, 0, secondHalf.length);
			mergeSort(firstHalf);
			mergeSort(secondHalf);
			merge(firstHalf, secondHalf, numbers);
		}
		return numbers;
	}
	
	private static void merge(int[] firstHalf, int[] secondHalf, int[] numbers)
	{
		int[] result = new int[firstHalf.length+secondHalf.length];
		int i = 0, j = 0, k = 0;
		
		while(i < firstHalf.length && j < secondHalf.length)
		{
			if(firstHalf[i] < secondHalf[j])
			{
				result[k++] = firstHalf[i++];
			}
			
			else
			{
				result[k++] = secondHalf[j++];	
			}
		}
		
		while(i < firstHalf.length)
		{
			result[k++] = firstHalf[i++];
		}
		
		while(j < secondHalf.length)
		{
			result[k++] = secondHalf[j++];
		}
		
		System.arraycopy(result, 0, numbers, 0, result.length);
	}
}