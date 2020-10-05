#include <stdio.h>
#define ROWS 3
#define COLS 5

int main_p449_two_dimen_array2()
{
	int a[ROWS][COLS] = {
		{87, 98, 80, 76, 3},
		{99, 89, 90, 90, 0},
		{65, 68, 50, 49, 0}
	};

	int i;
	for (i = 0; i < ROWS; i++)
	{
		double final_scores = a[i][0] * 0.3 + a[i][1] * 0.4 +
			a[i][2] * 0.2 + a[i][3] * 0.1 - a[i][4];
		printf("학생 #%i의 최종성적=%7.2f\n", i+1, final_scores);
	}
	return 0;
}