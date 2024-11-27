import java.util.Scanner;
public class 아침_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.  int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)
// int (x>10 && x<20)
		
//2. char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성
// ch==' ' && ch=!'/t'
		
//3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성
//ch=='x' || ch=='X'
		
//4. char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성
//ch>='0' && ch<='9'
		
//5.  두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
//for(int i=1;i<=6;i++)
//{
//	for(int j=1;j<=6;j++)
//	{
//		if(j+i==6)
//			System.out.println("["+i+","+j+']');
//	}
//}
//6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
//		Scanner scan=new Scanner(System.in);
//		System.out.print("첫번째 정수 입력:");
//		int start=scan.nextInt();
//		int gop=1;
//		//오류 처리
//		while(true)
//		{
//			System.out.print("두번째 정수 입력:");
//			int end=scan.nextInt();
//			if(start<end)
//				break;
//			System.out.println();
//		}
//7.  5~16까지의 합을 구하시오
		int sum=0;
	for(int i=5;i<=16;i++)
	{
		sum+=i;
		
	}
	System.out.println("sum="+sum);
	
	}

}
