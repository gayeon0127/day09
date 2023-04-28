package set_get;

class TestClass04{
	private String name, addr;
	private int age;
	
	// alt + shift + s
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
}

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
	}
}
