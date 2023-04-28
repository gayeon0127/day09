package set_get;

/*
 * this
 * class의 자기 자신의 주소를 저장하고 있는 변수
 * 메소드의 0번째 매개변수로 자동으로 생성됨
 */

class TestClass{
	int num=100;
	public void test() {
		int age;
		System.out.println("this : " + this);
		this.num = 200;
	}
	public void test2() {
		int num = 100;
		System.out.println(num);
		// 가까운 곳의 num 실행
		System.out.println(this.num);
		// 바깥에 있는 num 
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		TestClass t = new TestClass();
		System.out.println(t);
		t.test();
		t.test2();
	}
}
