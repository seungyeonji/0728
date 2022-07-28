
public class Practice2 {
	public static void main(String[] args) {
		
		int count = 0;
		int line = 1;
		//대문자 + 32 = 소문자, 홀수줄 대문자, 짝수줄 소문자
		
		for(int i=65; i<=90; i++) {
			
			if(line%2==0) {
				System.out.print((char)(i+32) + "\t");
			}else {
				char ch = (char)i;
				System.out.print(ch + "\t");
//			System.out.print(i+ "\t");

			}
			count++;
			
			if(count%5==0) {
				System.out.println();
				line++;

				
			
		}
		}}}

