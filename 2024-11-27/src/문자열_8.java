//대문자 변환 => toUpperCase()
/*
 *  함수 : function
 *  메소드 : method
 *  ============= 기능상으로는 동일
 *  class 종속이냐 아니냐로 아래 두 가지로 나뉜다.
 *  c/c++/python/ => function (함수)
 *  Java / Kotlin => method
 *  위 말은 자바는 클레스 안에서만 작동한다는 의미 클래스 밖으로 못 벗어난다.
 *  
 *  String data="Hello Java"
 *  data.replace('a','b') => Hello Jbcb
 *  replace(문자,문자)
 *         --- ---
 *         old new
 *  data.replace('Hello','b') => Hello Jbcb
 *  replace(문자열,문자열)
 *          ---- ----
 *          old  new
 */
import java.util.Scanner;
public class 문자열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name="hong GIL DONG";
		//System.out.println(name.toUpperCase());
		//System.out.println(name.toLowerCase());
		// Upper / Lower => 오라클
		// 데이터 관리 => 자바+오라클 => JSP에서 HTML로 변환
		String data="Hello Java";
		System.out.println(data.replace('a','b'));
		System.out.println(data.replace("Java","Oracle"));
		// 오라클 연동
		// 이미지 , 줄거리 , 내용
		// | , & , '' => 오라클에서 첨부할 수 없다
		// & => replace 
		// & => Scanner 
		// || => 문자열 결합 오라클은 이렇게 사용한다.
		// 문자열 => '' 오라클은 이렇게 사용한다.
	}

}
