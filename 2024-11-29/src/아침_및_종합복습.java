import java.util.Arrays;
import java.util.Scanner;
public class 아침_및_종합복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(          ) : 문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
		//(          ):문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
		//(            ):두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
		//(            ):지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
		//(            ):문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.
		//(         ):문자열의 길이를 반환한다.	
		//(          ):문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.
		//(          ):정규표현식을 지정한 문자로 바꿔서 출력한다.
		//(           ):지정한 문자로 문자열을 나눌수 있다.(배열로 반환)				
		//(        ):문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)
		//(                 ):문자열에 대문자를 소문자로 변환한다.
		//(                 ):문자열에 소문자를 대문자로 변환한다.				
		//(          ):문자열에 공백을 없에준다.
		//(            ):지정한 개체의 원시 값을 반환
		//(              ):두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.
		//(                  ):지정한 index번째에 문자를 반환한다.
		//1. 대소문자가 있는 문자열을 입력받아서 대문자는 소문자로 소문자는 대문자 변경
		//2. 문자열을 입력받아서 역순으로 출력하는 프로그램 작성
//-------------------------------------------------------------------------------------------------------
		//1. 구구단 중 원하는 단수 입력 받아 결과를 출력하기
		//2. 1~100사이 정수 중에서 8의 배수 출력하기
//		int a=1;
//		for(a=1;a<=100;a++)
//		{
//			if(a%8==0)
//			{
//				System.out.print(a+" ");
//			}
//		int a1=1;
//		while(a1<=100) 
//		{
//			if(a1%8==0)
//			{
//				System.out.print(a1+" ");
//
//			}
//			a1++;
//		}
//	3.  1~100사이 정수 중에서 4의 배수이거나 7의 배수인 정수를 출력하기
//		int a=1;
//		for(a=1;a<=100;a++)
//		{
//			if(a%4==0 || a%7==0)
//			{
//				System.out.print(a+" ");
//			}
//		}a++;
// 4. 1~100사이 정수중에서 일의 자리 수가 3 또는 6 또는 9인 정수를 출력하기
//5. 사용자에게 문자열을 입력받아 모음의 개수를 출력하기 (a, e, i, o, u)
//6. 사용자에게 1 ~ 9사이의 정수를 입력받아 2자리의 자연수 중 각 자리수의 합이 입력값과 동일한 수 출력하기
//7. 10부터 20까지 순서대로 출력
//8. 10부터 20까지 역순으로 출력
//문자열을 입력을 받아서 => 꺼꾸로 출력
//9. 사용자가 입력한 5개의 정수 중 가장 큰 값을 출력하기
//		Scanner scan=new Scanner(System.in);
		
//10. 사용자에게 문자열 3개를 입력받아 길이값의 합을 출력하고, 가장 긴 문자열을 출력하기
//-------------------------------------------------------------------------------------------------------
//1)	100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D, 60점 이하면 F를 출력하라 (switch~case 사용)
//2)	 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 (switch~case 사용)
//3)	 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
//4번 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 (for 사용)
//6번 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
//7번 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
//8)	 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
//9)	 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)	
		
//-------------------------------------------------------------------------------------------------------
//1.  int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)
//		(int x>10 || x<20)

			
//2. char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성

		
//3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성

		
//4. char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성

			
//5.  두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오


//6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.

//7.  5~16까지의 합을 구하시오
//		int a=0;
//		for(int i=5;i<=16;i++)
//		{
//			a+=i;
//		}System.out.println(a);

//		
//8. 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.
//		int a=0;
//		for(int i=3;i<=4462;i++)
//		{
//			if(i%2==0)
//				a+=i;
//		}System.out.print(a);

		
//9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
//		int a=0;
//		for(int i=0;i<=6;i++)
//		{
//			if(i%2==0 || i%3==0)
//				a+=i;
//		}System.out.println(a);

		
//10. 1~100까지의 정수 중 4의 배수의 합계를 구하라.
//		int k=0;
//		for(int i=1;i<=100;i++)
//		{
//			if(i%4==0)
//				k+=i;
//		}System.out.println(k);

	
//11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성
//		int c=0;
//		Scanner scan=new Scanner(System.in);
//		for(int i=0;i<10;i++)
//		{
//			System.out.print("정수 입력:");
//			int b=scan.nextInt();
//		 	if(c%2==0)
//		 		c++;
//			
//		}System.out.println(c);

		
//12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램

//		
//13.다음 결과를 출력하는 프로그램 5행 10열
		//**********
		//**********
		//**********
		//**********
		//**********

		
//14. 다음 결과를 출력하는 프로그램
		//1 1 1 1 1 
		//2 2 2 2 2
		//3 3 3 3 3 
		//4 4 4 4 4  
		//5 5 5 5 5


//15. 다음 결과를 출력하는 프로그램
//1 1 1 1 1 
//2 2 2 2 2
//3 3 3 3 3
//4 4 4 4 4
//5 5 5 5 5 
		//-------------------------------------------------------------------------------------------------------
		
//for-each 구문
// 1~10까지난수 발생 => 배열[10] => 중복이 없이 저장
//정수 => 0~9 사이의 난수 발생 => 50번 빈도수 구한다
//		int[] a1=new int [10];
//		for(int i=1;i<=100;i++)
//		{
//			int num=(int)(Math.random()*10);
//			System.out.print(num+" ");
//			a1[num]++;
//		}
//		System.out.println();
//		for(int i=0;i<a1.length;i++)
//		{
//			System.out.println("a1"+"["+i+"]="+a1[i]);
//		}
//		
		//-------------------------------------------------------------------------------------------------------
//	1.	5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성
//		int[] kor=new int[5];
//		int[] rank=new int[5];
//		for(int i=0;i<kor.length;i++)
//		{
//			kor[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(kor));
//		for(int j=0)
		
//2.	    10개의 임의의 정수를 받아서 최대값,최소값(난수)  구하는 프로그램 작성
//			int[] arr=new int[10];
//			int max=0;
//			int min=100;
//			for(int i=0;i<arr.length;i++)
//			{
//				arr[i]=(int)(Math.random()*100)+1;
//			}
//			System.out.println(Arrays.toString(arr));
//			for(int i:arr)//최대값 , 최소값 => 결과값 추출
//			{
//				if(max<i)
//					max=i;
//				if(min>i)
//					min=i;
//			}
//			System.out.println("최대값:"+max);
//			System.out.println("최소값:"+min);
//3.		100 개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오
				
				
//4.		10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.
//		int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++)//초기화
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[1]);//두번째 값을 출력
//5.		위 문제 배열 중에서 최대값의 인덱스를 출력하시오. 
//		int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++)//초기화
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[1]);
//		System.out.println(arr[]);
//6.		10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오.
//		int sum=0;
//		double avg=0.0;
//		int[] arr=new int[10];//여기까지 변수 선언
//		for(int i=0;i<arr.length;i++)//초기화 =>난수
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		for(int i:arr)
//		{
//			sum+=i;
//		}
//		avg=sum/10.0;
//				System.out.println("총합"+sum);
//				System.out.println("평균"+avg);
		
//7.		10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오
//		int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//			if(i==2)
//			{
//				i++;
//			}
//		}System.out.println(Arrays.toString(arr));

//8.		5개의 난수를 배열에 저장한 후에 인덱스번호 두개를 받아서 값을 교환하는 프로그램을 작성하시오
//		int[] arr=new int[5];
//		int temp=0;
		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}System.out.println(Arrays.toString(arr));
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		
//9.		char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력하시오
		//1. char 방만들기
		//2. 각 방에다가 A~Z까지 넣기
//		char[] ch=new char['Z'-('A'-1)];
//		System.out.println(Arrays.toString(ch));
//		for(char i=0;i<ch.length;i++)
//		{
//		ch[i]=(char)('A'+i);
//			System.out.println(Arrays.toString(ch)+" ");
//		}
		
//10.		위문제를 역순으로 출력하시오
//		char[] ch=new char[A-Z];
//		for(char i=0;i<ch.length-1;i++)
//		{
//			System.out.println();
//		}
//11.		정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하시오\
//		int[] arr=new int[10];
//		int a=0;
//		Scanner scan=new Scanner(System.in);
//			for(int i=0;i<arr.length;i++)
//			{
//				System.out.print("정수입력:");
//				int b=scan.nextInt();
//			}
//		System.out.println(Arrays.toString(arr));
				
//12.		10개의 정수를 입력받아서 짝수의 최대값,홀수의 최대값을 출력하는 프로그램을 작성하시오
//		int[] arr=new int[10];
//		int max,min=0;
//		for(int i=0;i<arr.length;i++)
//		{
//		arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//13.		 3명의 학생에 대한 국어,영어,수학 점수를 입력받아서 저장후에 총점,평균,등수를 구하고 국어점수 총점,영어점수 총점,수학점수의 총점을 구해서 출력하는 프로그램을 작성하시오

		
		
		
	}

}
