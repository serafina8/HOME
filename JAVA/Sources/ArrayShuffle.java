import java.util.Arrays;

public class ArrayShuffle {

	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*10);//0~9(배열요소) 중 임의의 한 값을 얻는다
			// numArr[0]과 numArr[n]의 값을 서로 바꾼다. 이 과정을 100번 수행. shuffle
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}
