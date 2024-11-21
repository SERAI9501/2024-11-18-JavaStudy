
public class 연산자_문제풀이 {
import java.util.Scanner;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("정수입력:");
		int month=scan.nextInt();
//		if(num%11==0)
	//		System.out.println("10의자리와 1의자리가같습니다.");
		//if(num%11!=0)
			//System.out.println("10의자리와 1의자리가다릅니다.");
		if(month>=3 && month<=5)
			System.out.println("봄입니다");
		if(month>=6 && month<=8)
			System.out.println("여름입니다");
		if(month>=9 && month<=11)
			System.out.println("가을입니다");
		if(month==1||month==2||month==3)
			System.out.println("rudnf입니다");
		
		
		
	}

}
