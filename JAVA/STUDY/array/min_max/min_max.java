package array.min_max;

public class min_max {

	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) { //1번인덱스부터 비교시작 i=1;
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		} // end of for
		
		System.out.println("최대값 : " +  max);
		System.out.println("최소값 : " +  min);
	} // end of main
} // end of class
