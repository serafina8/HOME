#include <stdio.h>

int mainmy01()
{
	char ch;
	printf("���ڸ� �ϳ� �Է��ϼ���: ");
	scanf_s(" %c", &ch, sizeof(ch));
	if (ch >= 'A' && ch <= 'Z')
	{
		printf("%c�� �빮���Դϴ�\n", ch);
		printf("�ҹ��ڴ� %c�Դϴ�\n", ch + 32);
	}
	else if (ch >= 'a' && ch <= 'z')
	{
		printf("%c�� �ҹ����Դϴ�\n", ch);
		printf("�빮�ڴ� %c�Դϴ�\n", ch - 32);
	}
	else if (ch >= '0' && ch <= '9')
		printf("%c�� �����Դϴ�\n", ch);
	else
		printf("%c�� ��Ÿ�����Դϴ�\n", ch);
	return 0;
}

