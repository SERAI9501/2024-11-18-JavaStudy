import java.util.Scanner;
public class 제어문_반복문_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1;
		Scanner scan=new Scanner(System.in);
		while(true) // 무한루프 => 항상 종료시점 지정
		{
			System.out.print("1~100사이의 정수입력:");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력입니다!!");
				continue;//처음 화면으로 이동
			}
			
			if(com>user) {
				System.out.println("입력한 수보다 큰수를 입력하세요");
			}
			else if(com<user)
			{
				System.out.println("입력한 수보다 작은수를 입력하세요");
			}
			else
			{
				System.out.println("정답입니다");
				break;//프로그램 종료
			}
		}
	}

}
