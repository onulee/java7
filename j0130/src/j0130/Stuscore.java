package j0130;

public class Stuscore {
	{
		count++;
		no = count;
	}
	Stuscore(){}
	Stuscore(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	static int count;
	private int no;
	String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	

}
