package array.lotto;

import java.util.Arrays;

public class LottoArr {
	public static void main(String[] args) {
		//45개의 정수값 배열요소에 저장
		int[] ball = new int[45]; 
		for(int i = 0; i < ball.length; i++)
			ball[i] = i+1;
		
		
		int tmp = 0;
		int j = 0; //임의의 값을 얻어서 저장할 변수
		//0번째부터 5번째 요소 6개만, i번째 요소와 임의의 요소를 바꾼다
		for(int i= 0; i < 6; i++)
		{
			j = (int)(Math.random()*45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			System.out.println(Arrays.toString(ball));
		}
		for(int i = 0; i < 6; i++)
		System.out.printf("ball[%d] = %d%n", i, ball[i]);
	}
}
