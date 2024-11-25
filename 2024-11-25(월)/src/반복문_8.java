// 10개의 정수를 추출해서 최대값,최소값을 구하는 프로그램
//1~100사이에
// 
public class 반복문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=1,min=100,count=0;
		for(int i=1;i<=10;i++) {
			int num=(int)(Math.random()*100)+1;
			System.out.print(num+" ");
			if(max<num)
				max=num;
			if(min>num)
				min=num;
			if(num%3==0)
				count++;
		}
		System.out.println();
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		System.out.println("3의배수 갯수:"+count);
	}

}
