class Driver {
	public static void main(String[] args) {
		MyString s = new MyString();
		char[] a = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
		char[] b = s.reverseString(a);
		System.out.println();
		System.out.println(new String(b));
	}
}