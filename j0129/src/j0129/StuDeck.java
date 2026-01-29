package j0129;

import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	
	StuDeck(){
		list.add(new Stuscore("홍길동",100,100,99));
		list.add(new Stuscore("유관순",90,90,95));
		list.add(new Stuscore("이순신",80,80,81));
	}
	
	//객체컬렉션 - 객체담을수 있는 배열
	// add,get,remove,size(),isEmpty()
	ArrayList<Stuscore> list = new ArrayList();
	Scanner scan = new Scanner(System.in);
	String name;
	int no,kor,eng,math,total;
	double avg;
	String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	
	//성적출력
	void stu_output() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],
				title[4],title[5],title[6]);
		System.out.println("-----------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Stuscore s = list.get(i);
//			System.out.println(list.get(i));
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg());
		}//for
		System.out.println();
	}
	
	//성적입력
	void stu_input() {
		System.out.println((Stuscore.count+1)+"번 학생이름을 입력하세요.>> ");
		name = scan.next();
		System.out.println("국어점수를 입력하세요.>> ");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>> ");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>> ");
		math = scan.nextInt();
		// 추가적으로 번호,합계,평균 부여
		list.add(new Stuscore(name,kor,eng,math));
		System.out.println(name+" 학생성적이 추가되었습니다.");
		System.out.println();
	}
	
	//화면출력
	void screen_print() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.성적수정");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
	}

}
