class Driver {
	public static void main(String[] args) {
		
		System.out.println();
		BracketValidator bracketValidator = new BracketValidator(); 
		String str = "{[(])}";
		System.out.println(bracketValidator.validate(str) == true ? "TRUE!" : "FALSE!");
		/*
		MyString s = new MyString();
		char[] a = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
		char[] b = s.reverseString(a);
		System.out.println();
		System.out.println(new String(b));
		*/
	}
}