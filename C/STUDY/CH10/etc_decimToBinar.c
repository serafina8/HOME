// 진법 변환: 10진수를 2진수, 8진수로 변환하기
//​2를 8로 바꾸기만 하면 10진수를 8진수로 변경하는 프로그램이 된다.

#include <stdio.h>

int main_decimToBinar(void)
{
	int dec, q, r, bin[32], k = 0;

	printf("10진수를 입력하세요  \n");
	scanf_s("%d", &dec);
	printf("십진수 %d는 이진수로 ", dec);
	
	while (1)
	{
		q = dec / 2;               // 2로 나눈 몫을 구한다.
		r = dec % 2;    // 나머지를 구한다.
		bin[k++] = r;
		if (q == 0) break;
		dec = q;
	}

	for (int i = k - 1; i >= 0; i--)
		printf("%d", bin[i]);
	printf("입니다\n");
	return 0;
}