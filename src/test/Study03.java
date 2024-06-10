package test;

import test1.Study01;

public class Study03 extends Study01 {

	public static void main(String[] a) {
		System.out.println("동작!!");
		
//		Study01 s1 = new Study01();
//		s1.c();
//		s1.c("");
//		c("");  // static을 부모 메소드에 넣고 쓴다.
	}
	void print() { c("");}
	
}
