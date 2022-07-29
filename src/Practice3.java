import java.util.Scanner;
import java.util.*;


public class Practice3 {
	public static void main(String[] args) {
		// 체중과 신장을 입력받아 BMI(체질량지수)를 구하는 프로그램 작성(신장은 m단위)
		// BMI = 체중/신장제곱
		
		//강사님 답		*Client class 따로 만들어줌
//		Scanner sc = new Scanner(System.in);
//		Client jimin = new Client();
//		System.out.print("Name : ");
//		jimin.name = sc.nextLine();
//		
//		System.out.print("Age : ");
//		jimin.age = sc.nextInt();
//		sc.nextLine();		//입력버퍼 클리어(숫자 넣고 글자 넣으면 사이에 항상 임시저장공간(엔터) 날리자)
//		
//		System.out.print("Gender(남성:m/여성:f) : ");
//		String gender = sc.nextLine(); 		//scanner는 char 못받기때문에 String을 일단 nextline으로 받아줌 -> "m"
//		jimin.gender = gender.charAt(0);		//'m' 
//		
//		System.out.print("Weight: ");
//		jimin.weight = sc.nextDouble();
//		
//		System.out.print("Height : ");
//		jimin.height = sc.nextDouble();		//cm 단위
//		
//		double bmi = jimin.weight / ((jimin.height * 0.01) * (jimin.height * 0.01));
//		jimin.bmi = bmi;		//jimin의 bmi를 할당
//		
//		if(bmi >=35) jimin.result = "고도 비만";
//		else if(bmi>=30 && bmi <35) jimin.result = "중도 비만(2단계 비만)";
//		else if(bmi>=25 && bmi <30) jimin.result = "경도 비만(1단계 비만";
//		else if(bmi>=23 && bmi <25) jimin.result = "과체중";
//		else if(bmi>=18.5 && bmi <23) jimin.result = "정상";
//		else jimin.result = "저체중";
//		
//		
//		
//		System.out.println("<<고객 검진 결과>>");
//		System.out.println("이름 : " + jimin.name);
//		System.out.println("나이 : " + jimin.age);
//		System.out.print("성별 : ");
//		System.out.println((jimin.gender == 'm')? "남성" : "여성");	  	//삼항연산자 활용해서 m, f가 아니라 남성, 여성으로 출력
//		System.out.println("신장 : " + jimin.height);
//		System.out.println("체중 : " + jimin.weight);
//		System.out.println("BMI 지수 : " + jimin.bmi);
//		System.out.println("결과 : " + jimin.result);
//		System.out.println("Thank you");
		
		
		
		
		//내 답안
		Scanner sc = new Scanner(System.in);
		
		System.out.print("무게 : " );
		double weight = sc.nextDouble();
		
		System.out.print("신장 : ");
		double height = sc.nextDouble();
		

		double height2 = Math.pow(height/100, 2);
		
		double bmi = weight/height2;
	

		if(bmi>=35) System.out.println("고도 비만");
		if(bmi>=30 && bmi<=34.9) System.out.println("중도 비만(2단계 비만)");
		if(bmi>=25 && bmi<=29.9) System.out.println("경도 비만(1단계 비만)");
		if(bmi>=23 && bmi<=24.9) System.out.println("과체중");
		if(bmi>=18.5 && bmi<=22.9) System.out.println("정상");
		if(bmi<18.5) System.out.println("저체중");

				
	}

}


