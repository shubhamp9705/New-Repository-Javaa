package pack;

public class mainclass {

	public static void main(String[] args) {
		
		inter1 z = new class1();
		inter2 a = z.test();
		inter3 b = a.demo();
		b.methodofinter3();
		
		
		z.test().demo().methodofinter3();
	}

}
