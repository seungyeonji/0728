import java.util.Scanner;
//import java.util.GregorianCalendar;


public class Practice {
	public static void main(String[] args) {
		//연도, 월 입력받아서 그 월에 가장 마지막 날을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Year : ");
		int year = sc.nextInt();
		
		System.out.print("Month : ");
		int month = sc.nextInt();
		
//		GregorianCalendar gc = new GregorianCalendar();
//		boolean flag = gc.isLeapYear(year);
		
		
		if(month == 2) {	//2월이라면
			if(year % 400 == 0 || year % 4 == 0 && year % 100 !=0){	//윤년이라면
				System.out.println("마지막날은 29일입니다");
			}else {	//윤년이 아니라면
				System.out.println("마지막날은 28일입니다");
			}
		}else if(month !=2) {	//2월이 아니라면
			if(month == 1 || month == 3 || month == 5 || month ==7 || month == 8 || month ==10 || month == 12) {
				System.out.println("마지막 날은 31일입니다");
			}else {
				System.out.println("마지막 날은 30일입니다");
			}
		}
	}
}


