import java.util.Scanner;
import java.util.GregorianCalendar;

public class OpDemo {
	public static void main(String[] args) {
		//나머지 연산자
//		System.out.println(5 / 2);		//int 나누기 int 는 정수
//		System.out.println(5 % 2);
		
		//Shift Operator
//		System.out.println(32767 << 5); 	// 곱하기
//		System.out.println(32767 >> 5); 	// 나누기
//		System.out.println(-32676 >> 5); 	// 음수가 계속 음수 -> 음수 유지
//		System.out.println(-32676 >>> 5); 	// unsigned right shift : sign비트가 0이든 1이든 0을 채우기 때문에 무조건 양수
		
		
//		System.out.println(true && true); 	// true
//		System.out.println(true & true); 	// true
//		System.out.println(true & false); 	//false
		// & 써서 비트고 && 논리연산자가 아님
		
//		int a = 5;
//		int b = 10;
//		int x = 15;
//		if(a > x && ++b < x) {
//			System.out.println("참");
//		}
//		else{
//			System.out.println("거짓");
//		}
//		
//		System.out.println("b = " + b);
		// b값 출력해볼때 & 쓰는거랑 && 쓰는거랑 b값이 다르게 나옴 -> && 쓰면 앞에가 거짓이면 ++b를 안하고 거짓이라 출력
		// &쓰면 앞에가 거짓이라 해도 오른쪽꺼(++b)까지 계산함
		// && 오른쪽을 할까 말까 결정하는 연산자
		// |랑 ||도 똑같음 -> ||는 앞에꺼 결정되면 뒤에꺼 안함
		
		
//		if(4 > 5) {
//			System.out.println("참");
//		}
//		else {
//			System.out.println("거짓");
//		}
		
		// 위에꺼는 if문 = if statement
		// 조건문(문장)이랑 연산자 중 연산자가 훨씬 빠름 -> 삼항연산자 사용
		
		//삼항 연산자 : (조건)이 참이면 물음표 뒤 출력, 거짓이면 : 뒤 출력 -> if문보다 빠르다
//		System.out.println((4 > 5) ? "참" : "거짓");
		
		
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 한개를 입력하세요 : ");
//		int su = sc.nextInt();
		
		//if문
//		if(su % 2 == 0) System.out.println("짝수");
//		else System.out.println("홀수");
		
		//삼항연산자
//		System.out.println((su % 2 == 0) ? "짝수" : "홀수");
		
		
		//윤년인지 아닌지 출력
//		System.out.print("연도를 입력하세요 : ");
//		int year = sc.nextInt();
		
		//조건문
//		if((year % 400 == 0) || (year % 4 ==0 && year % 100 != 0)) {
//			System.out.println("당신이 입력하신 " + year + "는 윤년입니다");
//		}else {
//			System.out.println("당신이 입력하신 " + year + "는 윤년이 아닙니다");
//		}
//		
		//삼항연산자
//		System.out.print("당신이 입력하신 "  + year + "년은 ");
//		System.out.println((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? "윤년입니다" : "윤년이 아닙니다");

		//isLeapYear 사용
//		GregorianCalendar gc = new GregorianCalendar();
//		boolean flag = gc.isLeapYear(year);
//		System.out.println("당신이 입력하신 " + year + "년도는 "  + ((flag) ? "윤년입니다" : "윤년이 아닙니다"));
		
		
		
		
		//할당연산자(R->L)
//		int age = 26;
//		age++; 	//age = age + 1 (1씩증가)
		
		//복합연산자
//		age += 5;	//age = age + 5;
		
		
		//나열연산자
//		int a = 5;
//		int b = 10;
//		int x = 15; 	//세줄이면 cpu가 일을 세번함
		
//		int a = 5, b = 10, x = 15;		//그래서 ,(나열연산자)를 사용

		
		
		//삼항연산자 주의할점
		double year = (true) ? 2022 : 3.14;	//3.14가 실수기 때문에 double
		//컴파일러는 참거짓 결과값을 먼저 형비교하기 때문에 형을 맞춰줘야함
		
		
	}
}
