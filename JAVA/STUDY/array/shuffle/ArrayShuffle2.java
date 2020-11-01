package array.shuffle;

import java.util.Arrays;

public class ArrayShuffle2 {

	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<numArr.length; i++) {
			int n = (int)(Math.random()*10);//0~9(배열요소) 중 임의의 한 값을 얻는다
			
			// numArr[i]과 numArr[n]의 값을 서로 바꾼다. 이 과정을 10번 수행. shuffle
			//i번째하고 바꾸면 10번만 바꿔도 충분하다
			int tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
			
			System.out.println(Arrays.toString(numArr));
		}
		//System.out.println(Arrays.toString(numArr));
	}
}
