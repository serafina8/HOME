package array.shuffle;

import java.util.Arrays;

public class ArrayShuffle2 {

	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<numArr.length; i++) {
			int n = (int)(Math.random()*10);//0~9(�迭���) �� ������ �� ���� ��´�
			
			// numArr[i]�� numArr[n]�� ���� ���� �ٲ۴�. �� ������ 10�� ����. shuffle
			//i��°�ϰ� �ٲٸ� 10���� �ٲ㵵 ����ϴ�
			int tmp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = tmp;
			
			System.out.println(Arrays.toString(numArr));
		}
		//System.out.println(Arrays.toString(numArr));
	}
}
