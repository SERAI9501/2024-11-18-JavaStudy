//수정 => 다시저장
public class 변수_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		System.out.println(a);
		
		a=200;
		System.out.println(a);
	//같은 블럭 안에서는 같은 변수명을 사용할 수 없다.
	/*
	 * 학생 1명
	 * 국어점수 : 90점
	 * 수학점수 : 90점
	 * 영어점수 : 90점
	 * 총점 : 270점
	 * 평균 : 90.0
	 * 학점 : A
	 * 등수 : 2
	 */
	
	int kor,eng,math;
	kor=eng=math=90;
	int total=270;
	double avg=90.0;
	char score='A';
	int rank=2;
	System.out.println("국어점수"+kor);
	System.out.println("영어점수"+eng);
	System.out.println("수학점수"+math);
	System.out.println("총점"+total);
	System.out.println("평균"+avg);
	System.out.println("학점"+score);
	System.out.println("등수"+rank);
	
	/*
	 * 문자열 결합
	 * 문자열 => ""
	 * 3+""+4 34
	 * 3+"7"+7=377
	 * 7+7+"3"+7+7=14377
	 * 
	 * 논리형 boolean는 반드시 true / false만 사용가능
	 * 								소문자만 가능
	 * 								True(Python)
	 * 						=>비교연산자
	 * 						boolean b=6>7 => true
	 * 						if(boolean)
	 * 						로그인 / 아이디중복체크 / 검색어 / 장바구니 / 있다 없다를 나타낼때 사용한다.
	 * byte 네트워크 전송 , 파일 전송 
	 * short => c언어 호환 => 사용 빈도가 없다
	 * 일반 정수 : int
	 * 일반 실수 : double
	 * 문자 : 값 설정 '문자한개'
	 * 한글은 한 글자당 2byte
	 * 실수 => double=> 데이터형중에 가장 큰 데이터형
	 * 		boolean은 숫자가 아니다
	 */
	}

}
