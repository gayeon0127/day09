package variable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 * 입력 연산 출력 기능 생성
 * 입력 ; 이름 국 영 수 
 * 연산 ; 합을 구하는 기능, 평균을 구하는 기능, 등급을 구하는 기능
 * 								 평균 90이상 A,80이상 B,나머지 C
 * 출력 ; 이름 국 영 수 합 평균 등급
 */

public class TestClass08 {
	
	private String name, grade;
	private int kor, eng, math, sum;
	private double average;
	
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		name = scan.next();
		System.out.println("국어 점수 입력 : ");
		kor=scan.nextInt();
		System.out.println("영어 점수 입력 : ");
		eng=scan.nextInt();
		System.out.println("수학 점수 입력 : ");
		math=scan.nextInt();
	}
	
	public void sum() {
		sum = kor+eng+math;
	}
	
	public void average() {
		average = sum/3;
	}
	
	public void grade() {
		if(average>=80) {
			if(average>=90) {
				grade="A";
			} else {
				grade="B";
			}
		}else {
			grade ="C";
		}
	}
	
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("국어 점수 : " + kor);
		System.out.println("수학 점수 : " + math);
		System.out.println("영어 점수 : " + eng);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		System.out.println("등급 : " + grade);
	}
	
}
