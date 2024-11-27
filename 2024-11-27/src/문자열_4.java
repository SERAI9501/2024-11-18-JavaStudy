/*
 * 문자열 분리 / 자르기 / 변경 / 찾기
 * = charAt(int index)
 *  Hello Java
 *  0123456789
 *  charAt(6)
 */
//사용자의 입력값을 받아서 => a A가 몇개인지 확인
import java.util.Scanner;
// 사용자의 문자열 입력을 받아서 좌우 대칭 여부 확인
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String data="Hello Java";
		System.out.println("첫번째 문자:"+data.charAt(0));//첫번째 문자 자르기
		System.out.println("첫번째 문자:"+data.charAt(data.length()-1));//마지막 문자 자르기*/
//		Scanner scan=new Scanner(System.in);
//		System.out.print("문자열 입력:");
//		String data=scan.nextLine();
//		int count=0;
//		for(int i=0;i<data.length();i++)
//		{
//			char ch=data.charAt(i);
//			//System.out.println(ch);
//			if(ch=='a' || ch=='A')
//				count++;
//		}
		// 지역변수 => {}변수 => {}이 종료하면 사라지는 변수
//		System.out.println("a나 A의 갯수:"+count);
		
		Scanner scan=new Scanner(System.in);
		String data="";
		while(true)
		{
			System.out.print("문자열 입력:");
			data=scan.nextLine();
			if(data.length()%2==0)
				break;
			else
				System.out.println("문자 갯수가 짝수여야 합니다.");
		}
		boolean bCheck=true;
		int j=data.length()-1;
		for(int i=0;i<data.length()/2;i++)
		{
			char s=data.charAt(i);
			char e=data.charAt(j);
			//System.out.println("start="+s+",end"+e);
			if(s!=e)
			{
				bCheck=false;
				break;
			}
			j--;
		}
		System.out.println("======결과값======");
		if(bCheck==true)
			System.out.println(data+"는(은) 좌우대칭입니다");
		if(bCheck==false)
			System.out.println(data+"는(은) 좌우대칭 아닙니다");
		
	}

}
