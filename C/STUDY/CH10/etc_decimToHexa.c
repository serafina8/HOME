#include <stdio.h>
#include <stdlib.h>

int main_decimToHexa()
{
	int i, k = 0, m, n, dec;
	char c_hex[] = "0123456789ABCDEF";
	char hex[10] = { 0 };

	printf("10진수를 입력하세요 \n");
	scanf_s("%d", &dec);
	printf("십진수: %d, 16진수: ", dec);

	while (1)
	{
		m = dec / 16;            // 16으로 나눈 몫
		n = dec % 16;   // 나머지
		hex[k++] = c_hex[n];
		if (m <= 0) break;
		dec = m;
	}

	for (i = k - 1; i >= 0; i--)
		printf("%c", hex[i]);
	printf("\n");

	return 0;
}
