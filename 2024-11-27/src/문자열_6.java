/*
 * 문자 자르기
 * ****** X 10000000
 * 
 * substring : 문자열을 자르기
 * | 지정된 위치부터 마지막까지 자르기
 *  Hello Java
 *  0123456789
 *  substring(6) = Java
 * | 중간에서 자르기
 *  substring(1,4) = ell 
 *             --endIndex-1 = 맨 마지막 하나를 제외한다는 의미
 *  공백 제거 : trim()
 * ---------------------------------------------------여기까지 JavaScript 동일
 * 
 */
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String data="Hello.Hello.java";
//		System.out.println(data.substring(data.lastIndexOf(".")+1));
//      원본은 그대로 유지
		
		String data="ID:admin,PWD:1234";
		String id=data.substring(data.indexOf(":")+1,data.indexOf(",")); //,는 제외
		System.out.println(id);
		String pwd=data.substring(data.lastIndexOf(":")+1);
		System.out.println(pwd);
		System.out.println("data="+data);
		
		
		String address="서울 동대문구 회기동 346-14[새주소] 서울 동대문구 경희대로4길 76";
		String addr1=address.substring(address.indexOf("["));
		System.out.println(addr1);
		String addr2=address.substring(address.indexOf("]")+2);
		System.out.println(addr2.trim());
		System.out.println(address);
		//trim() => 좌우의 공백을 제거
		
		String s="Hello Java";
		String ss=s.substring(s.indexOf(" ")+1);
		System.out.println(ss);
		//원본은 그대로 자른것은 다른곳에 저장하는게 좋다.
		
		
	}

}
