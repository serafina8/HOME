#include<stdio.h>
#define SIZE 10

//���翡 �ִ� �ڵ�� �̻���~~~

int main_p440_selection_sort(void)
{
    int data[SIZE] = { 3, 2, 9, 7, 1, 4, 8, 0, 6, 5};
    int temp;

 //�����ϱ� �� ���� ���.
    for (int i = 0; i < 10; i++) {
        printf("%d ", data[i]);
    }
    printf("\n");

    //�Ʒ��� 2�� for���� ���� ���� �ٽ�.
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
   

    printf("���� �� ����\n");  
    for (int i = 0; i < SIZE; i++) {
        printf("%d ", data[i]);
    }
    printf("\n");
    return 0;
}