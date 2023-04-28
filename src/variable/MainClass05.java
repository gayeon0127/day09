package variable;

class TestClass05{
	static int num;
	static { // static 변수 초기화 
		num=1000;
	}
	public void test() {
		System.out.println("mum : " + num);
	}
	
	int n1=100;
	public void test02() {
		System.out.println("n1 : " +n1);
		// static void의 경우 에러 발생 - 발생시점이 다르기 때문에
		// => 두개 모두 static으로 변경 시 오류 미발생
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println(TestClass06.KOREA);
	}
}
