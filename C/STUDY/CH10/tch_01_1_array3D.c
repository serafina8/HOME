#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#define STUDENTS_C4 2
#define STUDENTS 3
#define NAME_LENGTH 10
#define CLASS 4


int main_tch_01_1_array3D()
{
	char name[STUDENTS][NAME_LENGTH], temp_name[NAME_LENGTH];
	char name_c4[STUDENTS_C4][NAME_LENGTH], temp_name_c4[NAME_LENGTH];
	double sj[CLASS][STUDENTS][6] = { 0,0,0 }, temp_sj;
	int k, i, j, i1;
	srand((unsigned)time(0));
	for (k = 0; k < 4; k++)
	{
		if (k == 3)
		{
			printf("%d반의 %d명의 성적입력 :\n", k + 1, STUDENTS_C4);
			for (i = 0; i < STUDENTS_C4; i++)
			{
				printf("%d번 성명 입력 :", i + 1);
				scanf_s("%s", name_c4[i], sizeof(name_c4[i]));

				for (j = 0; j < 3; j++)
				{
					sj[k][i][j] = (double)(rand() % 51) + 50.0;
					switch (j)
					{
					case 0: printf("국어 : %.0f\n", sj[k][i][j]); break;
					case 1: printf("영어 : %.0f\n", sj[k][i][j]); break;
					case 2: printf("수학 : %.0f\n", sj[k][i][j]); break;
					}
					sj[k][i][3] += sj[k][i][j]; //3과목 성적을 총점에 더하기
				}
				sj[k][i][4] = sj[k][i][3] / 3.0; //평균
				sj[k][i][5] = 1.0; //석차 초기화
			}
			for (i = 0; i < STUDENTS_C4; i++) //이름순 정렬
				for (i1 = i + 1; i1 < STUDENTS_C4; i1++)
				{
					if (strcmp(name_c4[i], name_c4[i1]) > 0)
					{
						strcpy_s(temp_name_c4, NAME_LENGTH, name_c4[i]);
						strcpy_s(name_c4[i], NAME_LENGTH, name_c4[i1]);
						strcpy_s(name_c4[i1], NAME_LENGTH, temp_name_c4);
						for (int j = 0; j < 6; j++)
						{
							temp_sj = sj[k][i][j];
							sj[k][i][j] = sj[k][i1][j];
							sj[k][i1][j] = temp_sj;
						}
					}
				}
			for (i = 0; i < STUDENTS_C4 - 1; i++) //총점으로 석차 정하기
			{
				for (i1 = i + 1; i1 < STUDENTS_C4; i1++)
				{
					if (sj[k][i][3] > sj[k][i1][3])
						sj[k][i1][5]++;
					else if (sj[k][i][3] < sj[k][i1][3])
						sj[k][i][5]++;
				}
			}
			printf("  성명     국어   영어   수학   총점   평균  석차\n");
			for (i = 0; i < STUDENTS_C4; i++)
			{
				printf("%7s", name_c4[i]);
				for (j = 0; j < 6; j++)
					if (j == 4)
						printf("%8.1f", sj[k][i][j]);
					else if (j == 5)
						printf("%5.0f", sj[k][i][j]);
					else
						printf("%7.0f", sj[k][i][j]);
				printf("\n");
			}
		}

		else
		{
			printf("%d반의 %d명의 성적입력 :\n", k + 1, STUDENTS);
			for (i = 0; i < STUDENTS; i++)
			{
				printf("%d번 성명 입력 :", i + 1);
				scanf_s("%s", name[i], sizeof(name[i]));

				for (j = 0; j < 3; j++)
				{
					sj[k][i][j] = (double)(rand() % 51) + 50.0;
					switch (j)
					{
					case 0: printf("국어 : %.0f\n", sj[k][i][j]); break;
					case 1: printf("영어 : %.0f\n", sj[k][i][j]); break;
					case 2: printf("수학 : %.0f\n", sj[k][i][j]); break;
					}
					sj[k][i][3] += sj[k][i][j];
				}
				sj[k][i][4] = sj[k][i][3] / 3.0;
				sj[k][i][5] = 1.0;
			}
			for (i = 0; i < STUDENTS; i++)
				for (i1 = i + 1; i1 < STUDENTS; i1++)
				{
					if (strcmp(name[i], name[i1]) > 0)
					{
						strcpy_s(temp_name, NAME_LENGTH, name[i]);
						strcpy_s(name[i], NAME_LENGTH, name[i1]);
						strcpy_s(name[i1], NAME_LENGTH, temp_name);
						for (int j = 0; j < 6; j++)
						{
							temp_sj = sj[k][i][j];
							sj[k][i][j] = sj[k][i1][j];
							sj[k][i1][j] = temp_sj;
						}
					}
				}
			for (i = 0; i < STUDENTS - 1; i++)
			{
				for (i1 = i + 1; i1 < STUDENTS; i1++)
				{
					if (sj[k][i][3] > sj[k][i1][3])
						sj[k][i1][5]++;
					else if (sj[k][i][3] < sj[k][i1][3])
						sj[k][i][5]++;
				}
			}
			printf("  성명     국어   영어   수학   총점   평균  석차\n");
			for (i = 0; i < STUDENTS; i++)
			{
				printf("%7s", name[i]);
				for (j = 0; j < 6; j++)
					if (j == 4)
						printf("%8.1f", sj[k][i][j]);
					else if (j == 5)
						printf("%5.0f", sj[k][i][j]);
					else
						printf("%7.0f", sj[k][i][j]);
				printf("\n");
			}
		}
	}
	return 0;
}