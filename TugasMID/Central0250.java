//Faizah Nurilmi Syukur 13020210250
interface A { 
	void aaa();
}
 
interface B extends A {
	void aaa();
}
	
class Central0250 implements A, B {
	public void aaa() {
		System.out.println("aaa");
	}

	public static void main(String arg[]) {
		System.out.println("main");
		Central0250 obj = new Central0250();
		obj.aaa();
	}
}