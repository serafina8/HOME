#include <stdio.h>
#include <stdlib.h>

#define SIZE 5

int main422()
{
	int scores[SIZE];
	for (int i = 0; i < SIZE; i++)
		scores[i] = rand() % 100;

	for (int i = 0; i < SIZE; i++)
		printf("scores[%d] = %2d\n", i, scores[i]);
	return 0;
}

