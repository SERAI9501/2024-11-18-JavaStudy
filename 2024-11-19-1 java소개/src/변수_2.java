/*
 * 초기값 => 데이터를 저장하는 방법
 * 
 * 자바에서 사용하는 표현법
 * 1.정수
 * byte/short/int => 숫자 사용 (범위만 초과하지 않는다)
 * 숫자표현
 * 10=>10진법
 * ***012=>8진법
 * 날짜 / 시간
 *  2024-09-20
 *         ===8진법 =>error 앞에 0을 붙이면 8진법으로 인식해서 오류가 난다
 *  0x12=>16진법
 * long표현
 *  10L,10l
 *  -------
 *  실수형
 *  10.5=>double
 *  10.5f=>10.5F
 *  
 *  문자형
 *  한글자만 저장이 가능
 *  ***'A' ""=>문자열 => 여러개문자 사용이 가능 "ABCD.."
 *  
 *  논리형
 *  true / false
 *  데이터 저장 방법
 *  1)명시적 초기화
 *   int = 10;
 *  2)입력을 받아서 초기화
 *  3)난수발생
 *  
 *  변수 선언
 *  선언과 동시에 값을 저장
 *  데이터형 변수명=값(사용빈도가 많다)
 *  
 *  선언
 *  데이터형  변수명
 *  값을 저장
 *  변수명=값
 *  
 *  ***변수 선언만 하고 사용하면 =>error발생
 *  
 *  
 */
public class 변수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(07);
		//int a;
		//System.out.println(a);
		byte byteVal=127;//-128~127
		/*
		 * 
		 * =======
		 * 	 127 ->byteVal
		 * =======
		 * 
		 */
		short shortVal=32767;//-32768~32767
		/*
		 * =======
		 * 32767 ==>별칭 => chortVal
		 * ======= 2byte
		 * 
		 */
		int intVal=21400000;
		/*
		 * int
		 * 4vyte 메모리 공간을 만들어라 명령
		 * =>21400000을 저장해라...
		 * =>이 메모리를 사용한다면 intVal를 이용한다.
		 * =>수정이 가능
		 */
		long longVal=3000000000l;//long 표현
		/*
		 * 8byte 메모리 공간을 만들어라
		 * =>30000000000명령
		 * =>사용시에는 longVal
		 * =>변수
		 * 1)저장
		 * 2)값읽기
		 * 3)수정
		 */
		longVal=100l;
		System.out.println(longVal);
		//큰데이터 형에는 작은 값을 저장이 가능
		long a=100;//100L
		System.out.println(a);
		int b='A';
		System.out.println(b);
		char c=65;
		System.out.println(c);
		// 'A' =65 'a'=97 '0'=48 각 문자마다 정수값이 부여되어 있다 아스키 코드라고 한다.
		//System.out.println((int)'홍');
		boolean boo=false;
		System.out.println(boo);//조건문에 사용 : 제어문
		float f=10.5f;
		System.out.println(f);
		double d=10.5f;
		// 왼쪽에 있는 데이터형이 크거나 같아야 저장이 가능하다.
		/*
		 * 데이터는 선언된 데이터형을 따라 간다
		 * byte=byte
		 * short=short,byte
		 * int=int,short,byte,char
		 * 
		 * long=int.ahort,byte,char,long
		 * float=int.ahort,byte,char,long,float
		 * double=int.ahort,byte,char,long,float.double
		 * 자동 형변환
		 * (int) 'A' => 65
		 * (char)65 => A
		 * 
		 *
		 */
		//10/(bouble)3 = 3.333333
		System.out.println(10/3);
		System.out.println(10/(double)3);
		
		//***int/long/double/char/boolean
	}
	

}
