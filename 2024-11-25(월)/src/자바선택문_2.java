//64page 계절
//3,4,5=>봄
//6,7,8=>여름
//9,10,11=>가을
// 12,1,2=>겨울
//=> 난수처리
public class 자바선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//=> 1~12까지 사이의 수를 입의로 추출
		int month=(int)(Math.random()*12)+1;
		switch(month)
		{
		case 3: case 4: case 5://if(month==3||month==4||month==5)
			System.out.println(month+"월은 봄입니다");
			break;
		case 6: case 7: case 8://else if(month==6||month==7||month==8)
			System.out.println(month+"월은 여름입니다");
			break;
		case 9: case 10: case 11://else if(month==9||month==10||month==11)
		 	System.out.println(month+"월은 가을입니다");
		 	break;
		case 12: case 1: case 2://else if(month==12||month==1||month==2)
			System.out.println(month+"월은 겨울입니다");
			break;
			//default => 생략이 가능 : 필요시에만 사용
			//default / else => 다른 값을 입력하거나 잘못된 입력이 들어갔을때 사용한다.
			//아니라면 생략이 가능하다.
			//다중 조건문과 선택문은 동일하다
			
		}
	}

}
