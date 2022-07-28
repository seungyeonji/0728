import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		// 출생년도 넣으면 우리나라 나이와 띠 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출생년도 : ");
		int year = sc.nextInt();
		
		//강사님 방법
		
		System.out.println(2022 - year + 1 + "살");
		if(year %12 == 0) System.out.println("원숭이띠입니다");
		if(year %12 == 1) System.out.println("닭띠입니다");
		if(year %12 == 2) System.out.println("개띠입니다");
		if(year %12 == 3) System.out.println("돼지띠입니다");
		if(year %12 == 4) System.out.println("쥐띠입니다");
		if(year %12 == 5) System.out.println("소띠입니다");
		if(year %12 == 6) System.out.println("호랑이띠입니다");
		if(year %12 == 7) System.out.println("토끼띠입니다");
		if(year %12 == 8) System.out.println("용띠입니다");
		if(year %12 == 9) System.out.println("뱀띠입니다");
		if(year %12 == 10) System.out.println("말띠입니다");
		if(year %12 == 11) System.out.println("양띠입니다");
		
		
		
		
//		if(year % 12 == 0) {
//			System.out.println((2022-year + 1) + "살 원숭이띠입니다");
//		}else if(year % 12 == 1) {
//			System.out.println((2022-year + 1) + "살 닭띠입니다");
//		}else if(year % 12 == 2) {
//			System.out.println((2022-year + 1) + "살 개띠입니다");
//		}else if(year % 12 == 3) {
//			System.out.println((2022-year + 1) + "살 돼지띠입니다");
//		}else if(year % 12 == 4) {
//			System.out.println((2022-year + 1) + "살 쥐띠입니다");
//		}else if(year % 12 == 5) {
//			System.out.println((2022-year + 1) + "살 소띠입니다");
//		}else if(year % 12 == 6) {
//			System.out.println((2022-year + 1) + "살 호랑이띠입니다");
//		}else if(year % 12 == 7) {
//			System.out.println((2022-year + 1) + "살 토끼띠입니다");
//		}else if(year % 12 == 8) {
//			System.out.println((2022-year + 1) + "살 용띠입니다");
//		}else if(year % 12 == 9) {
//			System.out.println((2022-year + 1) + "살 뱀띠입니다");
//		}else if(year % 12 == 10) {
//			System.out.println((2022-year + 1) + "살 말띠입니다");
//		}else if(year % 12 == 11) {
//			System.out.println((2022-year + 1) + "살 양띠입니다");
		
			
		
	}
}


