package set_get;

import java.util.Scanner;

/*
 * 로그인 프로그램 만들기
 * LoginClass
 * private id,pwd
 * set getter 및 연산 기능 생성
 * 
 * MainClass
 * 보여지는 기능 생성
 *  1. 로그인 
 *  2. 회원가입
 *  3. 종료 
 */

class LoginClass{
	private String id, pwd;
	private String inputId, inputPwd;
	Scanner scan = new Scanner(System.in);
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void loginId() {
		System.out.println("로그인합니다.");
		System.out.println("아이디를 입력하세요 : ");
		inputId = scan.next();
	}
	
	public void loginIdCheck() {
		if(inputId.equals(id)) {
			System.out.println("비밀번호를 입력하세요 : ");
			inputPwd = scan.next();
		} else {
			System.out.println("일치하는 아이디가 없습니다.");
		}
	}
	
	public void loginPwd() {
		if(inputPwd.equals(pwd)) {
			System.out.println("로그인되었습니다.");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
		

	
	public void join() {
		System.out.println("회원가입을 진행합니다.");
		System.out.println("아이디를 입력하세요 : ");
		id = scan.next();
		setId(id);
		id = getId();
		System.out.println("비밀번호를 입력하세요 : ");
		pwd = scan.next();
		setPwd(pwd);
		pwd = getPwd();
		System.out.println("Id : " + id);
		System.out.println("Pwd : " + pwd);
		System.out.println("회원가입되었습니다.");
	}
	
	public void end() {
		System.out.println("종료합니다.");
		System.exit(0);
	}
	
	
}

public class MainClass05 {
	public static void main(String[] args) {
		LoginClass l = new LoginClass();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=================");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			System.out.println("=================");
			System.out.println("번호입력 >>> ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 :
				l.loginId();
				l.loginIdCheck();
				l.loginPwd();
				break;
			case 2 :
				l.join();
				break;
			case 3 :
				l.end();
				break;
			}
		}
		
	}
}
