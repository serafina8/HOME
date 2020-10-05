#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define ROWS 3
#define COLS 5

int main_p447_two_dimen_array()
{
	int s[ROWS][COLS];
	int i, j;
	srand((unsigned)time(0));
	for (i = 0; i < ROWS; i++)
		for (j = 0; j < COLS; j++)
			s[i][j] = rand() % 100;
	for (i = 0; i < ROWS; i++)
	{
		for (j = 0; j < COLS; j++)
			printf("%02d ", s[i][j]);
		printf("\n");
	}
	return 0;
}