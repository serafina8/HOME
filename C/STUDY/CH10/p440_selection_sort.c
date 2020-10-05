#include<stdio.h>
#define SIZE 10

//교재에 있는 코드는 이상함~~~

int main_p440_selection_sort(void)
{
    int data[SIZE] = { 3, 2, 9, 7, 1, 4, 8, 0, 6, 5};
    int temp;

 //정렬하기 전 상태 출력.
    for (int i = 0; i < 10; i++) {
        printf("%d ", data[i]);
    }
    printf("\n");

    //아래의 2중 for문이 선택 정렬 핵심.
    for (int i = 0; i < SIZE-1; i++) 
    {  
        for (int j = i + 1; j < SIZE; j++) 
        {  
            if (data[i] > data[j]) 
            {  
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
    }
   

    printf("정렬 후 순서\n");  
    for (int i = 0; i < SIZE; i++) {
        printf("%d ", data[i]);
    }
    printf("\n");
    return 0;
}