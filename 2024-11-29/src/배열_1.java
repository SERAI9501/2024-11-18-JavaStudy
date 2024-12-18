/*
 *  1. 데이터를 관리하기 쉽게 데이터 묶어서 사용
 *    ------------------------------
 *    1) 같은 데이터형을 모아서 관리 => 배열
 *    2) 다른 데이터를 모아서 관리 => 구조체 / 클래스
 *                              |      | 사용자 정의 데이터
 *                              | 자바에서는 사용하지 않는다
 *  2. 관련된 명령문을 묶어서 사용 => 재사용
 *     --------- 연산자,제어문 => 메소드
 *  ================================ + 묶음 (클래스)
 *    => 클래스 : 객체지향의 특성 (캡슐화 , 상속 , 다형성)
 *    => 클래스의 종류 : 종단 클래스 / 추상 클래스 / 인터페이스
 *                   내부 클래스
 *   84page            
 *     배열 : 일차원 배열 / 이차원 배열 / 다차원 배열 / 가변 배열
 *           웹 => 일차원 배열
 *      | => Collection => 10장 (데이터를 모우는 웹 프로그램 핵심)
 *        => 자바 => 웹에서 사용하는 자바
 *     배열 (Array)
 *       1) 장점
 *          = 인덱스 기반 => 0번부터 시작 ~ 
 *                       ----------- 순차적 : for
 *            **데이터를 빠르게 접근이 가능
 *          = 연속적으로 메모리 저장 => 메모리 크기가 동일
 *          ** 메모리 관리 효율적이다
 *          ** CPU cache를 통해서 배열에 있는 데이터에 접근하는 시간을 단축
 *       2) 단점
 *          = 고정된 크기 (사용전에 미리 크기 정해야 된다)
 *            *** 가변형 => ArrayList
 *          = 삽입(데이터 추가) , 삭제 => 사용할 수 없다.
 *          = 추가 / 삭제 ==> 새로운 배열을 만들어서 사용
 *        **같은 유형의 변수를 여러개 담는 고정된 크기의 데이터 구조
 *          ----------- long (int,char...
 *          ----------- 선언시에 큰 데이터형을 선언 => 작은 데이터형을 첨부
 *       ------------------------------------------------------
 *       배열의 중요성
 *       
 *       ***3명의 학생의 국어,영어,수학점를 입력받아서 총점 , 평균 , 학점을 구한다
 *       
 *          메모리 연속적으로 배치
 *          
 *                              
 */
import java.util.Scanner;
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int kor1,kor2,kor3;
		int eng1,eng2,eng3;
		int math1,math2,math3;
		int tatal1,tatal2,tatal3;
		double avg1,avg2,avg3;
		// 배열 => 한개 변수명을 이용한다 => 제어
		// 클래스 => 인터페이스
	

	
		}
	}
