
public class SwitchDemo {
	public static void main(String[] args) {
		int su = 234;
		
		//삼항연산자
		System.out.println((su%2 ==0)? "짝수" : "홀수");
		
		
		//if문
		if(su % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
		//switch문			*break 꼭 써주기(흐름에 따라 달라질수도 있음)
		switch(su % 2) {
			case 0 :
				System.out.println("짝수");
				break;
			case 1 :
				System.out.println("홀수");
				break;
		}
		
		//default 들어간 switch문		*default를 꼭 써야하는건 아님
		switch(su % 2) {
		case 0 :
			System.out.println("짝수");
			break;
		default :
			System.out.println("홀수");
		}
		
		
	}
}
