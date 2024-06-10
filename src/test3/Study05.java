package test3;

public class Study05 {

	public static void main(String[] args) {
		
		A aa = new A();
		aa.a();
		
//		for(int i = 0; i < 100; i++) {
//			System.out.println(i);
//		}
		
	}

}

class A {
	
	int i = 1;
	
	void a() {
		if(i <= 100) {
			System.out.println("a()" + i);
			b();
		}
	}
	
	void b() {
		i++;
		a();
	}
	
}