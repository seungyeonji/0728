
public class SwitchDemo2 {
	public static void main(String[] args) {

		int rand = (int)(Math.random()*10 + 1);
		System.out.println("rand = " + rand);
		
		switch(rand) {
			case 1:
				System.out.println("Bananas");
				break;
			case 2:
				System.out.println("Oranges");
				break;
			case 3:
				System.out.println("Peach");
			case 4:
				System.out.println("Apples");
			case 5:
				System.out.println("Plums");
				break;
			case 6:
				System.out.println("Pineapples");
				break;
			case 7:
			//	System.out.println("");
				break;
			default:			//default가 맨위로 가도 되고 ,case를 꼭 순서대로 안써도 됨 		*근데 default가 중간에 끼어있으면 무조건 break; 써줘야됨
				System.out.println("Nuts");
		}
		
	}
}
