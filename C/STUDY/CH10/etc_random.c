#include <stdio.h>
#include <stdlib.h>
#include <time.h>


int main_random()
{
	int i;
	float k;
	srand(time(0));
	for (i = 0; i < 5; i++)
	{
		printf("%5d\n", rand());
	}
	for (i = 0; i < 5; i++)
	{
		printf("%5d\n", rand()%100+1);
	}
	for (i = 0; i < 5; i++)
	{
		printf("%7.4f\n", rand()%4500/1000.0);
	}
	return 0;
}