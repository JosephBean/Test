package test2;

public class Study04 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.print();	// 기본 접근 제한자
		b.print();	// 공유 접근 제한자
//		c.print();	// 사적인 접근 제한자 <<- 해당 클래스에서만 사용 가능함
	}

}


class A {
	void print() {}
}

class B {
	public void print() {}
}

class C {
	private void print() {}
}