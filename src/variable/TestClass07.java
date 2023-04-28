package variable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TestClass07 {
	int age;
	String name;
	
	public HashMap<String,Integer> input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		name = scan.next();
		System.out.println("나이 입력 : ");
		age=scan.nextInt();
		
		HashMap<String, Integer> i = new HashMap<>();
		i.put(name, age);
		return i;
	}
	
	public HashMap<String, Integer> setAge(HashMap<String, Integer> i) {
		age=age-1;
		i.put(name, age);
		return i;
	}
	
	
	public void display(HashMap<String, Integer> i) {
		Set<String> key = i.keySet();
		Collection<Integer> value = i.values();
		Iterator<String> keyIt = key.iterator();
		Iterator<Integer> valueIt = value.iterator();
		
		while(keyIt.hasNext()) {
			name = keyIt.next();
			age = valueIt.next();
			System.out.println("이름 : " +name);
			System.out.println("만 나이 : "+age);
		}
		
	}
	
	/*
	 * 입력, 출력, 나이 만으로 연산하는 각각의 기능을 만드시오
	 * 변수는 인스턴스 변수로 변경하여 사용하세요
	 */
}
