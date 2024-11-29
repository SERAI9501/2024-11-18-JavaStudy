// 1~10까지난수 발생 => 배열[10] => 중복이 없이 저장
public class 배열_생성_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//=> set,cookie 중복 제거
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=(int)(Math.random()*10)+1;
		for(int j=0;j<i;j++)
		{
			if(arr[i]==arr[j])
			{
				i--;
				break;
			}
		}
		}

	}

}
