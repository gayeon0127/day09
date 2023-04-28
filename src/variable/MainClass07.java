package variable;

import java.util.HashMap;

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		HashMap<String, Integer> i = t.input();
		i=t.setAge(i);
		t.display(i);
		
	}
}
