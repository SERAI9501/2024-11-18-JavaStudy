/*
 * 중복없는 난수 => 3개 (1~9)
 * =====================
 * 사용자 입력
 * 3자리 입력 => 맞추는 프로그램 : 숫자 야구게임
 * 힌트
 *  369
 *  123 => 0S-1B
 *  356 => 1S-1B
 *  ==> 3S
 *  
 */
import java.util.Arrays;
import java.util.Scanner;
public class 배열_생성_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터 중복없는 난수 3자리 발생
		int[] com=new int[3];
		// 사용자 입력
		int[] user=new int[3];
		//초기화
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)//j<=i;를 안한이유는 첫번째것은 비교할 이유가 없다.
			{
				if(com[i]==com[j])
				{
					i--; // 중복이 있기 때문에 난수 다시 발생
					break;
				}
			}
		}
		System.out.println(Arrays.toString(com));
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수를 입력하세요:");
			int input=scan.nextInt();
			
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다!!");
				continue; // 처음부터 다시 실행
			}
			//세자리 정수를 입력
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] ||
				user[1]==user[2] ||
				user[0]==user[2])
			{
				System.out.println("중복된 수는 사용할 수 없습니다!!");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용 할 수 없습니다!!");
				continue;
			}
			//여기까지 오류처리 => 조건문 역할 : 오류를 방지 => if를 사용한다
			
			int s=0,b=0;//힌트 부분 시작
			for(int i=0;i<3;i++)//com
			{
				for(int j=0;j<3;j++)//user
				{
					if(com[i]==user[j])// 같은 수가 있다면
					{
						if(i==j)//같은 자리수인지
							s++;
						else//다른 자리에 있다
							b++;
					}
				}
			}
			System.out.printf("Number:%d,Result:%dS-%db\n",input,s,b);
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}
		// 난수와 사용자 입력 비교
		// 힌트
		// 종료여부 확인 => s=3
	}

}
