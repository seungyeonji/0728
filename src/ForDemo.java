
public class ForDemo {
	public static void main(String[] args) {
//		for(int su = 1 ; su <=10 ; su++) {
//			System.out.print(su + "\t");
//		}
		
//		for(int su = 10 ; su > 0 ; su--) {
//			System.out.print(su + "\t");
//		}
		
		//1부터 20까지 중 3의배수만 출력 : 3 6 9 12 15 18
//		for(int i = 1; i <= 20; i++) {
//			if(i % 3 == 0) System.out.print(i + "\t");
//		}
		
		//20부터 180까지 숫자를 출력하되, 7의 배수를 출력하되 한줄에 다섯개씩만
		int count = 0;			//개수니까 count 만들어줌
		
		for(int i = 20; i<=180 ; i++) {
			if(i % 7 == 0) {
				System.out.print(i + "\t");
				count++;		//count 1씩 증가
				if(count%5==0) System.out.println();		//5의 배수마다 엔터 출력
			}
		}
	}
}

