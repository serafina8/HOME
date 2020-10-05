#include <stdio.h>

int mainmy01()
{
	char ch;
	printf("문자를 하나 입력하세요: ");
	scanf_s(" %c", &ch, sizeof(ch));
	if (ch >= 'A' && ch <= 'Z')
	{
		printf("%c는 대문자입니다\n", ch);
		printf("소문자는 %c입니다\n", ch + 32);
	}
	else if (ch >= 'a' && ch <= 'z')
	{
		printf("%c는 소문자입니다\n", ch);
		printf("대문자는 %c입니다\n", ch - 32);
	}
	else if (ch >= '0' && ch <= '9')
		printf("%c는 숫자입니다\n", ch);
	else
		printf("%c는 기타문자입니다\n", ch);
	return 0;
}

