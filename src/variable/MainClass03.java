package variable;

class TestClass03{
	int num;
	// instance변수 - 객체 생성시 사용가능
	public void test01(){
		num=1000;
		// 지역변수
		System.out.println("test01 : "+num);
	}
	public void test02() {
		System.out.println("test02 : " + num);
	}
	/*
	 * 인스턴스와 지역변수는 유지기간이 다름
	 * 지역변수 ; 1회성
	 * 인스턴스 ; 여러군데의 메소드에서 사용
	 */
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.test01();
		t.test02();
		
		System.out.println(TestClass04.num);
		// 클래스 변수
	}
}
