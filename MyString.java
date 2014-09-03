class MyString 
{
	public char[] reverseString(char[] original)
	{
		int length = original.length-1;
		char c;
		for(int i = 0; i < original.length/2; i++)
		{
			c = original[i];
			original[i] = original[length-i];
			original[length-i] = c;
		}
		return original;
	}
}