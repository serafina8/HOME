#include <stdio.h>

int mainmy03()
{
	int villa[4][2];
	// get the number of residents
	printf("\n가구원수 입력받기 :\n");
	for (int i = 0; i < 4; i++)
		for (int j = 0; j < 2; j++)
		{
			printf("%2d층 %d호 인구수 ", i + 1, j + 1);
			scanf_s("%d", &villa[i][j]);
		}
	//print by floor
	printf("\n각층별 거주자수 :\n");
	int total = 0;
	for (int i = 0; i < 4; i++)
	{
		int floor_sum = 0;
		for (int j = 0; j < 2; j++)
		{
			floor_sum += villa[i][j];
		}
		printf("%2d층 인구수 %2d\n", i + 1, floor_sum);
		total += floor_sum;
	}
	
	//print the total
	printf("\n빌라전체 거주자수 :\n");
	printf(" 총: %3d\n", total);
	return 0;
}

