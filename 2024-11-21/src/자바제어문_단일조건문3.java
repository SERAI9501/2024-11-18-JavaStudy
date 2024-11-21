/*
 *  알파벳 입력받아서 
 *   => 대문자 / 소문자 / 알파벳이 아닌 경우
 *   
 *   대문자라면 => if(대문자 조건)
 *   소문자라면 => if(소문자 조건)
 *   알파벳이아니라면 if(대문자,소문자가 아니라면)
 *   
 *   
 */
import java.util.Scanner;
//임포트는 라이브러리
public class 자바제어문_단일조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("문자입력:");
		char ch=scan.next().charAt(0);//charAt은 문자 위치 0번은 가장 앞에 글자를 가져온다는 의미이다.
		//System.out.println("ch="+ch);
		/*
		 *  기본 : 비교연산자
		 *        논리연산자 ==> 부정연산자
		 *        
		 *        && => 어디에서 어디까지 ==> 사이에 있다면
		 *        || => 범위에 없는 경우
		 *        예)
		 *        0~100
		 *        a>=0 && a<=100 ==> 처리
		 *        
		 *        a<0 || a>100 ==> 다시 입력을 요청하는 경우
		 *        
		 *        연산자
		 *          오라클 / javascript / 파이썬 = 모든 프로그래밍 언어는 제어문까지가 기본이기때문에 나온다.
		 *          
		 */
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"는(은) 대문자입니다");
		if(ch>='a' && ch<='z')
			System.out.println(ch+"는(은) 소문자입니다");
		if(!((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')))
			System.out.println(ch+"는(은) 알파벳이 아닙니다");
	}

}
