package variable;

/*
 * 클래스 변수(class Variable)
 * 클래스가 메모리에 올라가는 순간 생성됨
 * 클래스 이름으로 접근 가능
 * 프로그램이 실행되면 static로 만들어진 모든 것들이 생성됨.
 *  => 메모리에 공간을 차지, 소멸시점은 프로그램 종료될 때 공간이 사라짐
 *
 * 객체생성 변수(instance variable)
 * 객체로 생성되어야만 사용가능한 변수
 * 객체로 접근하여 사용
 * new연산을 통해 객체를 생성할 때 변수 또는 메소드가 생성되며,
 * 해당 변수 또는 메소드가 사라지는 시점은 객체가 소멸될 때이다.
 * 객체의 소멸은 특정지역이 종료될 때를 의미함.
 * 
 * 지역 변수 (local variable)
 * 특정 지역에서만 사용가능한 변수
 * 범위 지정은 중괄호  
 * 메소드의 호출이 일어나면 변수가 메모리에 올라가고 
 * 메소드가 종료되면 자동으로 변수 또한 소멸됨
 * 
 *  지역변수 < 인스턴스변수 < 클래스변수
 */

public class MainClass01 {
	public static void main(String[] args) {
		int num=100;
		if(true) {
			num=200;
		}
		System.out.println(num);
	}
}
