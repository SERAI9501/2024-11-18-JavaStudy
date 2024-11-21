/*
 *  대입연산자
 *  ------- = int a=10; => 뒤에서부터 처리
 *            10을 a에 대입
 *  복합대입연산자
 *  ==========
 *    ***+= ==> 여러개 증가
 *    ***-= ==> 여러개 감소
 *          int a=10;
 *          a-=5; => a=a-5
 *          => a=a-5 => a=5
 *          a+=5; a=a+5
 *    *=
 *    /=
 *    %=
 *    |=
 *    ^=
 *    &=
 *    <<=
 *    >>=
 *    
 *    int a=10;
 *    // 5개 증가
 *    a++
 *    a++
 *    a++
 *    a++
 *    a++//이렇게 하면 1개씩 밖에 증가 할 수 밖에 없다. 그래서 밑처럼 만든다.
 *    
 *    a+=5 ==> a=a+5//왼쪽 오른쪽 같은 말이다.
 *    a-=5 ==> a=a-5
 *    
 *    1~100까지 ==> 홀수만 출력
 *    => +2=
 */
public class 연산자_이항연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=10;
	a++;
	a++;
	a++;
	a++;
	a++;
	System.out.println("a"+a);
	
	int b=10;
	b+=5;
	System.out.println("b"+b);
	
	int c=10;
	c=c+5;// 이것을 줄이면 c+=5;
	System.out.println("c"+c);
	
	//여러번 증가할때는 => 복합대입연산자를 사용하자
	//1씩 증감할대는 증감연산자를 사용
	}
	

}
