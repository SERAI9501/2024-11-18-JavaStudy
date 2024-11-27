//제어문 연산자 변수

/*
 * 자바에서 제공하는 제어문
 * =조건문
 *  형식)
 *     단일 조건문 => 독립적으로 처리
 *     if(조건문) 조건문 : true/false
 *                     ========== 부정연산자 / 논리연산자 / 비교연산자
 *     {
 *     		조건이 true일때만 처리 => false일때는 수행하지 않는다
 *     }
 *     선택 조건문 => true/false를 나눠서 처리
 *      ***웹에서 가장 많이 사용되는 조건문
 *      ***조건문 만드는 연습
 *      ***기본 사이트 제작 => JSP(MVC) / Spring / Spring-Boot
 *         => Django 
 *      
 *         
 *     if(조건문) => 로그인인 된 경우
 *     {
 *       조건이 true일때 처리
 *     }
 *     else => 로그인 실패
 *     {
 *      조건이 false일때 처리
 *     }
 *     다중조건문 : 조건을 여러개 사용 => 해당조건만 출력
 *             => 메뉴 / 화면을 찾기
 *      if(조건문) ==> page=1
 *      {
 *       조건이 true일때 처리문장=> 수행종료
 *       main.jsp로 이동...
 *      }        |false 면 다음 조건을 찾는다
 *      else if(조건문)
 *      {
 *        예약화면 등...
 *      }         |false 면 다음 조건을 찾음
 *      else if(조건문)
 *      {
 *        상세보기...
 *      }
 *      else
 *      {
 *        해당조건이 없는 경우에 처리
 *        main.jsp
 *      }
 *  = 선택문
 *    switch(정수/문자/문자열)
 *           => 문자 ==> '' ==> char
 *           => 문자열 ==> "" ==>String
 *           ** 윈도우 / 웹 => 송수신하는 모든 데이터는 String
 *              => 다른 데이터형이 필요할때는 변경 (String)
 *              => Integer.parseInt("10") => 10
 *                 Double.parseDouble("5.0") => 5.0
 *                 Byte / Boolean ==> Wrapper
 *              => char[] => 제어 => String
 *     switch(정수/문자/문자열)
 *     {
 *      case 값1:
 *      수행문장
 *      break;
 *      case 값2:
 *      수행문장
 *      break;
 *      case 값3:
 *      수행문장
 *      break;
 *      default
 *      수행문장
 *     }
 *     => 무조건 break를 사용하는 것은 아니다
 *     => 같은 수행문장을 수행할때는 break를 사용하지 않는다
 *         case 10 : case 9: = jumsu==10 || jumsu==9
 *           score:'A'
 *     =>case에 중복된 데이터는 사용할 수 없다
 *     =>다중 조건문으로 변경이 가능
 *     =>프로그램은 정답이 없다 => 잘 짠 프로그램
 *                          ----------- 1.가독성
 *                                      2.최적화
 *                                      3.유지보수
 *                                      **4.공통모듈 => AOP/인터셉트
 *                                                   ---
 *                                      =>반복을 최대한 제거 
 *         
 *           
 *  = 반복문 => 중복제거
 *    = for : 횟수가 지정된 경우 =>웹 화면 UI
 *         1    2    4
 *    for(초기값'조건식;증가식)
 *    {         3
 *    }
 *    
 *    1=>2=>3=>4=>2=>3=>4
 *    -------------------2번에서 false일때까지 반복
 *    =>가장 많이 사용되는 반복문
 *    =>웹에서는 특별한 경우가 아니면 => 이중 for문 사용하지 않는다
 *    =>웹 : 송수신
 *    	          어떤값을 보낼지 / 어떤값을 받을지
 *              => 엽습 : 네트워크 (웹) 
 *   = while : 횟수가 지정이 안된 상태 => 데이터베이스
 *     >먼저 조건을 검색=> 한번도 실행이 안되는 경우도 있다.
 *      초기값---------1
 *      while(조건문)--2
 *      {          
 *       반복수행문장----3
 *       증가식--------4
 *      }
 *      while
 *      while(true)
 *      {
 *      반복수행문장
 *      =>종료하는 조건은 무조건 작성
 *      =>게임 : ESC종료
 *      }
 *     
 *    =do~while : while문과 동일 => 무호적 ㄴ검색
 *                무조건 한번이상 수행
 *     초기값---------1
 *     do
 *     {
 *      반복 수행문장---2 => 무조건 문장한번 수행
 *      증가식--------3
 *     }while(조건식);-4
 *             | false면 종료
 *   =반복제어문장
 *     =break : 반복을 종룟에 사용
 *              사용빈도가 낮다
 *              for,while,do~while=>무조건 종료
 *              =>switch, 반복문에서 사용
 *     =continue : 특정부분을 제외시에 사용
 *              =>반복문에서만 사용이 가능
 *              for ==>증가식으로 이동
 *               while 조건식으로 이동 =>무한루프가 걸릴 수 있다
 *              
★☆☆☆★
☆★☆★☆
☆☆★☆☆
☆★☆★☆
★☆☆☆★
 */
public class 제어문정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=5;i++)
        {
        	for(int j=1;j<=5;j++)
        			if((i==j)||(6-i==j))
        			{
        				System.out.print("★");
        			}
        			else
        			{
        				System.out.print("☆");
        			}
        	System.out.println();
        			
        }
	}

}
