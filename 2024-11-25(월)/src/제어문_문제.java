/*
 * 선택문 / 반복문
 * = 선택문
 * switch(정수/문자/문자열)
 * {
 * case 값: 값 => 정수 1 2 , 문자 => '+' , 문자열=>""
 *  실행 문장
 *  break; => 종료
 *  case 값 :... 순서가 없다 중복된 값은 사용할 수 없다.
 *  default : 생략이 가능 , 필요시에만 사용
 * }
 *  **실행하면 자동으로 case로 부터 시작 break가 있는 곳까지 출력
 *  int no=3;
 *  switch(no)
 *  {
 *  case 1:
 *  문장 1
 *  case 2:
 *  문장2
 *  case 3: => 출력의 시작 위치 => 3,4
 *  문장3
 *  case 4:
 *  문장4
 *  break;=>종료 지점
 *  default:
 *  문장5
 *  }
 *  =>다중조건문을 간결하게 표현
 *  =>범위 지정이 많다 => 다중 조건문
 */
import java.util.Scanner;
// c/c++ => include , c#=> using , python import => from
// => 라이브러리 , 사용자 정의 클래스 (다른 폴더에 있는 경우)
//                             ------- 자바에서는 패키지라고 불린다.
/*
 *  자바의 기본 형식
 *  package 위치 지정 => 한번만 사용이 가능
 *  import ...=> 여러번 사용이 가능
 *  => 모든 프로그램은 main을 한개 이상을 가지고 있어야 한다.
 *  public class ClassName => ClassName.java
 *  {
 *  ================
 *  멤버변수 => 전역변수
 *  ================
 *  생성자 () => 멤버변수 초기화
 *  ================
 *  사용자 정의 메소드
 *  ================
 *  main() => 현재 내가 쓰고있는 곳
 *  ================
 *  }
 *  class ClassName1
 *  {
 *  }
 */
public class 제어문_문제 {
//static public 순서를 바꿔도 괜찮다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1)	100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D, 60점 이하면 F를 출력하라 (switch~case 사용)
		/*Scanner scan=new Scanner(System.in);
		int score=scan.nextInt();
		System.out.print("점수 입력:");
		switch(score/10)
		{
		case 10: case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default :
			System.out.println("F학점");
		}*/  // ctrl+/
		
		//2)	 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 (switch~case 사용)
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int num1=scan.nextInt();
//		System.out.print("정수 입력:");
//		int num2=scan.nextInt();
//		System.out.print("+,-,*,/ 입력:");
//		switch(scan.next())
//{
//		case "+":
//			System.out.printf("%d + %d %d\n",num1,num2,num1+num2);
//			break;
//		case "-":
//			System.out.println(num1+"-"+num2+"="+(num1-num2));
//			break;
//		case "*":
//			System.out.print(num1+"*"+num2+"="+(num1*num2)+"\n");
//			break;
//		case "/":
//			if(num2==0)
//				System.out.println("0으로 나눌 수 없다");
//			else
//				System.out.println(num1+"/"+num2+"="+(num1/num2));
//		}
//}
		
		

		//3)	 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
//		int sum=0;//누적 변수
//		for(int i=2;i<=100;i+=2)
//			sum+=i;
//			System.out.print("2+4+6...100의합:"+sum);
			
		
//		4번 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 (for 사용)
//		for(int i=5;i<=50;i+=5)
//			if(i>45) {	
//				System.out.println(i);
//			}
//			else
//				System.out.print(i+",");
		
//		//5번
//		for(char i='B';i<='N';i+=2)
//			System.out.print(i+" ");
			
		//6번 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int sum=0;
//		int num1=scan.nextInt();
//		for(int i=1;i<=num;i++)
//		{
//			sum+=i;
//			System.out.print("sum"+sum);
//		}
		
		//7번 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
//		for(int i=1;i<=30;i++)
//		{
//			if(i%2==0)
//			{
//				System.out.printf("%02d\t",i);//"%02d\t"이건 정렬할때 사용하는것 명령프롬프트에서도 사용함
//				if(i%3==0)//개를 출력하고 다음 줄에 출력한다
//					System.out.println();
//			}
//				
//		}
		//8)	 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
//		int sum=0;
//		for(int i=1;i<=10;i++)
//		{
//			if(i%2==0)
//				sum-=i;
//			else
//				sum+=i;
//		}
//		System.out.println("sum="+sum);
//		//9)	 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)	
//		for(int i=1;i<=10;i++)
//		{
//			if(i%3!=0)
//				System.out.println(i+" ");
//		}
		/*
		 *  for 반복 횟수가 지정된 경우 주로 for을 사용하는 경향이 있다.
		 *  => 초기식 : 시작점 => 한번만
		 *  => 조건식 : 끝점 => true:반복문장 실행/false:for을 종료
		 *  => 증감식 : 횟수지정=> i++ , i+=2
		 *                          ----- 2씩 증가(복합 대입 연산자)
		 *  사용처 : 목록 출력할때/페이징기법에 많이 쓰인다.
		 *  형식  i=1  i<=10 i++
		 *   for(초기식;조건식;증가식)
		 *     반복 실행 문장
		 */
	}

}
