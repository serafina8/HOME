package array.min_max;

public class min_max {

	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) { //1���ε������� �񱳽��� i=1;
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		} // end of for
		
		System.out.println("�ִ밪 : " +  max);
		System.out.println("�ּҰ� : " +  min);
	} // end of main
} // end of class
