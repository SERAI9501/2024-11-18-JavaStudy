import java.util.Scanner;
public class 제어문_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. 구구단 중 원하는 단수 입력 받아 결과를 출력하기
		Scanner scan=new Scanner(System.in);
//		System.out.print("2~9단까지 입력:");
//		int dan=scan.nextInt();
//		int i=1;
//		while(i<=9)
//		{
//			System.out.println(dan+"*"+i+"="+dan*i);
//			i++;
//		}
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("단 입력:")
//		int dan=scan.nextInt();
//		int i=1;
//		while(i<=9)
//		{
//			System.out.println(dan+"*"+i+"="+dan*i);
//			i++;
//		}
//		for(int i=1;i<=9;i++)
//		{
//			System.out.println(dan+"*"+i+"="+dan*i);
//		}
		
//2. 1~100사이 정수 중에서 8의 배수 출력하기
//		int i=1;
//		while(i<=100)
//		{
//			if(i%8==0)
//				System.out.println(i);
//			i++;
//		}
		
//		int i=1;
//		while(i<=100)
//		{
//			if(i%8==0)
//				System.out.print(i+" ");
//			i++;
//		}
		
//3.  1~100사이 정수 중에서 4의 배수이거나 7의 배수인 정수를 출력하기
//		int i=1;
//		while(i<=100)
//		{
//			if(i%4==0)
//				System.out.println("4의배수:"+i);
//			if(i%7==0)
//				System.out.println("7의배수:"+i);
//          if(i%4==0 || i%7==0)
//				System.out.println(i);
//			i++;
//		}
		
//		int i=1;
//		while(i<=100)
//		{
//			
//          if(i%4==0 || i%7==0)
//				System.out.print(i+" ");
//			i++;
//		}
		
//4. 1~100사이 정수중에서 일의 자리 수가 3 또는 6 또는 9인 정수를 출력하기
//		int i=1;
//		while(i<=100)
//		{
//			
//			i++;
//		}
		
		int i=1;
		while(i<=100)
		{
			if(i%10==3|| i%10==6|| i%10==9)
				System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
//5. 사용자에게 문자열을 입력받아 모음의 개수를 출력하기 (a, e, i, o, u)
//		int j=0;
//		int a=0,e=0,k=0,o=0,u=0;
//		System.out.println("문자열 입력:");
//		String str=scan.nextLine();
//		while(j<str.length())
//		{
//			char c=str.charAt(j);
//			if(c=='a')
//				a++;
//			else if(c=='e')
//				e++;
//			else if(c=='i')
//					k++;
//			else if(c=='o')
//					o++;
//			else if(c=='u')
//				u++;
//			j++;
//					
//		}
		
	
//6. 사용자에게 1 ~ 9사이의 정수를 입력받아 2자리의 자연수 중 각 자리수의 합이 입력값과 동일한 수 출력하기
//		입출력예) 6 => 15 24 33 42 51 60 
//		Scanner scan=new Scanner(System.in);
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		if(a==b)
//----------------------------------------
//		System.out.print("정수 입력(1~9):");
//		int num=scan.nextInt();
//		i=10;
//		while(i<=99)
//		{
//			int a=i/10;
//			int b=i%10;
//			if(a+b==num)
//				System.out.print(i+" ");
//			i++;
//		}
		
		
//7. 10부터 20까지 순서대로 출력 
//		int i=10;
//		while(i<=20)
//		{
//			System.out.print(i+" ");
//			i++;
//		}
		i=10;
		while(i<=20)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();

//8. 10부터 20까지 역순으로 출력
//		int i=20;
//		while(i>=10)
//		{
//			System.out.print(i+" ");
//			i--;
//		}
		
		i=20;
		while(i>=10)
		{
			System.out.print(i+" ");
			i--;
		}
		System.out.println();
//문자열을 입력을 받아서 => 꺼꾸로 출력
//이미지를 꺼꾸로 출력하는 프로그램을 작성 => byte[]
//		System.out.print("문자열 입력:");
//		String str=scan.nextLine();
//		i=str.length()-1;
//		while(i>=0)
//		{
//			System.out.print(str.charAt(i));
//			i--;
//		}

//9. 사용자가 입력한 5개의 정수 중 가장 큰 값을 출력하기
//		Scanner scan=new Scanner(System.in);
//		System.out.print("5개의 정수 입력:");
//		int sum=0,i=1;
//		while(i<=5) 
//		{
//			int a1=scan.nextInt();
//				if(sum<=a1)
//				sum=a1;
//				System.out.println(sum);
//			i++;
//		}
		
//		i=1;
//		int max=0;
//		while(i<=5)
//		{
//			int num=(int)(Math.random()*100)+1;
//			System.out.print(num+" ");
//			if(max<num)
//				max=num;
//			i++;
//		}
//		System.out.println("최대값:"+max);
		
		
//10. 사용자에게 문자열 3개를 입력받아 길이값의 합을 출력하고, 가장 긴 문자열을 출력하기
//		String
		i=1;
		int sum=0;
		String strMax="";
		int Max=0;
		while(i<=3)
		{
			System.out.print("문자열 입력:");
			String str=scan.nextLine();
			sum+=str.length();
			if(Max<str.length())
			{
				strMax=str;
			}
				
			i++;
		}
		System.out.println("총 문자열 길이:"+sum);
		System.out.println("긴 문자열 출력:"+strMax);

	


	}

}
