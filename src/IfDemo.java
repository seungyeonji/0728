import java.util.Scanner;



public class IfDemo {
	public static void main(String[] args) {
		
		//if문
//		int jumsu = 59;
		
		//경우의수 1가지
//		if(jumsu >= 60) {	 		
//			System.out.println("축하합니다. 합격입니다!");
//		}
		
		
		//경우의수 2가지
//		if(jumsu >= 60) {	 		//조건이 참일때
//			System.out.println("축하합니다. 합격입니다!");
//		}else {						//조건이 거짓일때
//			System.out.println("유감입니다. 다음에 다시 응시해주세요!");
//		}
		
		//경우의수 3가지 이상
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 어느 계절을 좋아하시나요?(spring/summer/fall/winter): ");
		String season = sc.nextLine();
		
		if(season.equals("spring")){ 	//season이 알고 있는 값이 spring과 같니?
			System.out.println("진달래, 개나리");
		}else if(season.equals("summer")) { 	//season이 알고 있는 값이 summer와 일치합니까?
			System.out.println("장미, 아카시아");
		}else if(season.equals("fall")) {
			System.out.println("코스모스, 백합");
		}else if(season.equals("winter")){
			System.out.println("동백, 매화");
		}else {
			System.out.println("그런 계절은 없습니다");
		}
		
		//season은 string이기 때문에 16진수 주소를 가지기 때문에 == 로 비교하면 안됨 ex. season == "spring"  (x)
		// -> string 문자열 비교하려면 equals 메소드 써야함
		
		

	}
}
