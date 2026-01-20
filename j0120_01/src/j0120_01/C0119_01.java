package j0120_01;

import java.util.Scanner;

public class C0119_01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.>> ");
		String str = scanner.next();
		
		// 7이 몇번 입력되었는지 개수를 출력하시오.
		// count
		
		
		
		// 1459 -> 입력받은 숫자들의 합을 구하시오.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		String str = scanner.next();
//		//(char)(2 + '0')
//		//'2'-'0'
//		int sum = 0;
//		String s_print = "";
//		for(int i=0;i<str.length();i++) {
//			int no = str.charAt(i)-'0';
//			sum += no;
//			if(i==0) s_print = no+"";
//			else s_print += (","+no);  // 1,4,5,9,
//		}
//		System.out.println("입력된 숫자길이 : "+str.length());
//		System.out.println("출력 : "+s_print);
//		System.out.println("결과값 : "+sum);
		
		
		
		
		// 34.1592
//		double num = 34.1592;
//		
//		double num2 = (Math.round(num*100))/100.0;
//		System.out.println(num2);
		
		
		//소수점 반올림:round, 올림:ceil, 버림:floor
//		System.out.println(Math.round(34.95));
//		System.out.println(Math.ceil(34.95));
//		System.out.println(Math.floor(34.95));
		
		
		
		
//		Math.random()   0*10=0+1 <= int(Math.random()*10)+1 < 1*10+1
		
		// 1~5번까지 랜덤숫자를 입력하는데, 중복이 없도록 숫자를 입력하시오.
//		int no1 = 0;
//		int no2 = 0;
//		int no3 = 0;
//		
//		no1 = (int)(Math.random()*10)+1;
//		
//		for(;;) {
//			no2 = (int)(Math.random()*3)+1;
//			no3 = (int)(Math.random()*3)+1;
//			if(no1!=no2 && no1!=no3 && no2!=no3) break;
//		}
//		
//		System.out.println("no1 : "+no1);
//		System.out.println("no2 : "+no2);
//		System.out.println("no3 : "+no3);
		
		
		
		
		
//		// 문자숫자타입을 숫자타입으로 변경
//		int no = '2'-'0';
//		System.out.println(no); //int숫자로 취환
//		
//		// 숫자를 문자로 취환
//		char ch = (char)(2 + '0'); //2+48=50
//		System.out.println(ch);
//		
//		// String타입 -> char타입 변경
//		String str = "123";
//		char str2 = str.charAt(0); // 문자1개 가져옴.
//		
//		// 숫자타입 -> 문자열타입 변경
//		String str3 = 234 + "";
//		
//		// 문자열타입 -> int타입
//		String str4 = "20";
//		int num = Integer.parseInt(str4); //int타입 변경
//		String str5 = "10";
//		int num2 = Integer.parseInt(str5);
//		System.out.println(num+num2);
//		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("[ 학생성적프로그램 ]");
//		System.out.println("1. 학생성적입력");
//		System.out.println("2. 학생성적출력");
//		System.out.println("3. 학생성적수정");
//		int choice = scanner.nextInt();
//		if(choice==1) {
//			System.out.println("학생성적입력입니다");
//		}else if(choice==2) {
//			System.out.println("학생성적출력입니다.");
//		}else {
//			System.out.println("학생성적수정입니다.");
//		}
		
//		switch(choice) {
//		case 1:
//			System.out.println("[학생성적입력]");
//			break;
//		case 2:
//			System.out.println("[학생성적출력]");
//			break;
//		case 3:
//			System.out.println("[학생성적수정]");
//			break;
//		default:
//			break;
//		}
		

	}

}
