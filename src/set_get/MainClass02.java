package set_get;

class TestClass02{
	private int age;
	
	public void setAge(int age) {
		this.age = age-1;
		// 입력받은 age를 다시 바깥의 age에 입력 
	}
	public void printAge() {
		System.out.println(age);
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		t.setAge(20);
		t.printAge();
	}
}
