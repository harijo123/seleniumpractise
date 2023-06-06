package org.launch;

public class Same1 {

	public void method1() {
//<<<<<<< HEAD
		System.out.println("mayiladuthurai");
		System.out.println("praveen");

	}
	public void employee() {
		System.out.println("harijo");
	}

//=======
	
	public void method2() {
		System.out.println("praveen kumar");
	}
//>>>>>>> 5d1af6e48f542aa2572b62653b5ed9343b2a440f
	public static void main(String[] args) {
		Same1 s = new Same1();
		s.method1();
		s.method2();

	}
}
