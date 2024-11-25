/*
 * 무한루프
 * 
 * 컴퓨터 => 난수 : 1~100 사이의 정수 추출
 * =>맞추는 게임 => 힌트 : UP/DOWN
 * 난수 => 58
 * 사용자 입력> 50 => UP 
 * 
 */
import java.util.Scanner;
//반복문 => if
public class 반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1;
		Scanner scan=new Scanner(System.in);
		for(;;)// 무한루프 => while
		{
			System.out.println("1~100사이의 정수 입력:");
			int user=scan.nextInt();
			
			//힌트
			if(com>user) {
				System.out.println("높은 정수 입력");
			}
			else if(com<user)
			{
				System.out.println("작은 정수 입력");
			}
			else {
				System.out.println("정답입니다!!");
				System.exit(0);
				//무한루프는 반드시 종료 조건을 첨부한다
			}
		}
	}

}
