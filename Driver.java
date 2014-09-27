class Driver {
	public static void main(String[] args) {
		
		Anagrams anagrams = new Anagrams();
		boolean v = anagrams.isValid("abc", "bcad");
		System.out.println(v == true ? "WOO! GOOD!" : "NOOOOO!!!");
		
		/*
		System.out.println();
		BracketValidator bracketValidator = new BracketValidator(); 
		String str = "{[(])}";
		System.out.println(bracketValidator.validate(str) == true ? "TRUE!" : "FALSE!");
		
		MyString s = new MyString();
		char[] a = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
		char[] b = s.reverseString(a);
		System.out.println();
		System.out.println(new String(b));
		*/
	}
}