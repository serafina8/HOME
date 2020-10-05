#include <stdio.h>

//Name of array in C gives the address(except in sizeof operator)
//of the first elemet.
//Applying the Address-of operator before the array name gives
//the address of the whole array. Adding 1 to this address gives
//the address plus the sizeof whole array.


int main_arryQ_02()
{
	int arr[5];
	printf("%u %u %u", arr, arr + 1, &arr + 1);
	return 0;
}