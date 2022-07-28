
public class 성적관리프로그램 {
	public static void main(String[] args) {
		Student jimin = new Student();		//학생을 만들어야 멤버변수 사용 가능
		jimin.hakbun = "2022001";
		jimin.name = "한지민";
		jimin.kor = 100;
		jimin.eng = 89;
		jimin.mat = 78;
		
		jimin.tot = jimin.kor + jimin.eng + jimin.mat;
		jimin.avg = jimin.tot/3.;				//3뒤에 . -> 분모분자 타입을 맞춰줌
		
		System.out.println(jimin.tot);
		System.out.println(jimin.avg);
		
		
		//1. 삼항연산자
//		jimin.grade = (jimin.avg>=90 && jimin.avg<=100)? 'A' :
//								(jimin.avg>=80) ? 'B' :
//									(jimin.avg>=70) ? 'C' :
//										(jimin.avg>= 60) ? 'D' : 'F';
//		System.out.println("학점 : " + jimin.grade);
		
		//2. if문
		
//		if(jimin.avg>=90 && jimin.avg<=100) {
//			System.out.println("학점 : A");
//			jimin.grade = 'A';			// 강사님이 위에줄 대신 써준 답변
//		}else if(jimin.avg>=80) {
//			System.out.println("학점 : B");
//		}else if(jimin.avg>=70) {
//			System.out.println("학점 : C");
//		}else if(jimin.avg>=60) {
//			System.out.println("학점 : D");
//		}else {
//			System.out.println("학점 : F");
//		}
		
		
		//3. switch-case
		switch((int)(jimin.avg/10)) {				//avg를 미리 형변환을 해버리고 나서 10으로 나눠주면 다시 소수점 생기게됨
															//그러니까 그냥 avg를 10으로 나눈거를 int로 강제형변환 해줘야됨
															//ex. 89.5점을 switch 변수에 넣기 전에 형변환을 하면 89가 되고 강제형변환시킨 89를 switch 변수에 넣은 뒤 10으로 나눠주면 8.9가 됨
															//switch 변수 자리에는 double 들어갈 수 없음 -> avg를 10으로 나눠준거 자체를 switch 변수자리에 넣어주는데, 그 안에서 강제형변환 시켜주면됨
			case 10 :
				//System.out.println("학점 : A");		//학점:A 가 두번 나오는거 방지하려면 안써주면됨
			case 9 :
				//System.out.println("학점 : A");			//바로 받아서 출력하지말고 jimin.grade 에 넣어줌
				jimin.grade = 'A';
				break;
			case 8 :
				jimin.grade = 'B';
				break;
			case 7 :
				jimin.grade = 'C';
				break;
			case 6 :
				jimin.grade = 'D';
				break;			
			default :
				jimin.grade = 'F';
			}
		
		System.out.println("학점 : " + jimin.grade); 			//중간에서 sysout 하는거보다 jimin.grade에서 받아서 마지막에 출력하면됨
		
	}
}
