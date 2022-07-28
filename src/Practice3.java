import java.util.Scanner;
import java.util.*;


public class Practice3 {
	public static void main(String[] args) {
		// 체중과 신장을 입력받아 BMI(체질량지수)를 구하는 프로그램 작성(신장은 m단위)
		// BMI = 체중/신장제곱
		
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
