
public class Practice2 {
	public static void main(String[] args) {
		
		int count = 0;
		int line = 1;
		//대문자 + 32 = 소문자, 홀수줄 대문자, 짝수줄 소문자
		
		for(int i=65; i<=90; i++) {
			if(line%2==0) System.out.printf("%c\t", i+32);		//짝수면 소문자로
			else System.out.printf("%c\t", i);						//홀수면 대문자로
		
//		for(int i=65; i<=90; i++) {
//			
//			if(line%2==0) {
//				System.out.print((char)(i+32) + "\t");
//			}else {
//				char ch = (char)i;
//				System.out.print(ch + "\t");
//			}
			
			count++;
			
			if(count%5==0) {
				System.out.println();
				line++;

		}
			
		}
	}
}

