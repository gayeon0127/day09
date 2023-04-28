package variable;
class TestClass06{
	private int num=100;
	// 내부접근가능, 외부접근불가능
	// 내부의 메소드를 통해 변경 및 연산 진행
	public void test() {
		num =1111;
	}
	public void test2() {
		System.out.println(num);
	}
	public static final String KOREA = "대한민국";
}

public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		t.test();
		t.test2();
	}
}
