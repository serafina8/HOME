#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#define CNT 3
#define LENGTH 10


int main_tch_01_array2D()
{
	char name[CNT][LENGTH], temp_name[LENGTH];
	double sj[CNT][6] = { 0,0 }, temp;
	int i, j, i1;
	srand((unsigned)time(0));
	printf("%d명의 성적입력\n", CNT);
	for (i = 0; i < CNT; i++)
	{
		printf("%d번 성명 입력 :", i + 1);
		scanf_s("%s", name[i], sizeof(name[i]));

		for (j = 0; j < 3; j++)
		{
			sj[i][j] = (double)(rand() % 51) + 50.0;
			switch (j)
			{
			case 0: printf("국어 : %.0f\n",  sj[i][j]); break;
			case 1: printf("영어 : %.0f\n",  sj[i][j]); break;
			case 2: printf("수학 : %.0f\n",  sj[i][j]); break;
			}
			sj[i][3] += sj[i][j];
		}
		sj[i][4] = sj[i][3] / 3.0;
		sj[i][5] = 1.0;
	}
	for(i=0; i<CNT; i++)
		for (i1 = i + 1; i1 < CNT; i1++)
		{
			if (strcmp(name[i], name[i1]) > 0)
			{
				strcpy_s(temp_name, LENGTH, name[i]);
				strcpy_s(name[i], LENGTH, name[i1]);
				strcpy_s(name[i1], LENGTH, temp_name);
				for (int j = 0; j < 6; j++)
				{
					temp = sj[i][j];
					sj[i][j] = sj[i1][j];
					sj[i1][j] = temp;
				}
			}
		}
	for (i = 0; i < CNT - 1; i++)
	{
		for (i1 = i + 1; i1 < CNT; i1++)
		{
			if (sj[i][3] > sj[i1][3])
				sj[i1][5]++;
			else if (sj[i][3] < sj[i1][3])
				sj[i][5]++;
		}
	}
	printf("  성명     국어   영어   수학   총점   평균  석차\n");
	for (i = 0; i < CNT; i++)
	{
		printf("%7s", name[i]);
		for (j = 0; j < 6; j++)
			if (j == 4)
				printf("%8.1f", sj[i][j]);
			else if (j==5)
				printf("%5.0f", sj[i][j]);
			else
				printf("%7.0f", sj[i][j]);
		printf("\n");
	}

	return 0;
}