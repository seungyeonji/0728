import java.util.Scanner;

public class SwitchDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신은 어느 계절을 좋아하시나요?(spring/summer/fall/winter): ");
		String season = sc.nextLine();
		
		
		//삼항연산자
		String flowers = (season.equals("spring")) ? "진달래, 개나리" : 
								(season.equals("summer")) ? "장미, 아카시아" :
										(season.equals("fall")) ? "코스모스, 백합" :
												(season.equals("winter")) ? "동백, 매화" : "그런 계절은 없습니다";
		System.out.println(flowers);
		
		
		
		//if else 방식
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
		
		
		//switch 방식
		//equals 메소드 몰라도 됨, 가독성 if-else보다 좋음, if는 break가 없기 때문에 참인값 찾아도 끝까지 계속 물어봄
		//switch는 바로 찾아가기 때문에 속도도 더 빠르고 break 있어서 낭비되는 것도 없음 -> if 단점을 switch 가 커버
		//but 치명적인 단점은 변수 타입이 정해져있다는거
		
		switch(season) {
			case "spring" :
				System.out.println("진달래, 개나리");
				break;
			case "summer" :
				System.out.println("장미, 아카시아");
				break;
			case "fall" :
				System.out.println("코스모스, 백합");
				break;
			case "winter" :
				System.out.println("동백, 매화");
				break;
			default :
				System.out.println("그런 계절은 없습니다");
		}
		
	}
}
