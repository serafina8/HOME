#include <stdio.h>

int mainmy03()
{
	int villa[4][2];
	// get the number of residents
	printf("\n�������� �Է¹ޱ� :\n");
	for (int i = 0; i < 4; i++)
		for (int j = 0; j < 2; j++)
		{
			printf("%2d�� %dȣ �α��� ", i + 1, j + 1);
			scanf_s("%d", &villa[i][j]);
		}
	//print by floor
	printf("\n������ �����ڼ� :\n");
	int total = 0;
	for (int i = 0; i < 4; i++)
	{
		int floor_sum = 0;
		for (int j = 0; j < 2; j++)
		{
			floor_sum += villa[i][j];
		}
		printf("%2d�� �α��� %2d\n", i + 1, floor_sum);
		total += floor_sum;
	}
	
	//print the total
	printf("\n������ü �����ڼ� :\n");
	printf(" ��: %3d\n", total);
	return 0;
}

