#include<stdio.h>
#include"Employee.h"
#include"MenuHandler.h"
int main()
{
	Employee es;
	int i;
	int number,age,salary;
	while(1)
	{
		printf("[메뉴]\n\n");
		printf("\t1. 사원 추가\n");
		printf("\t2. 사원 삭제\n");
		printf("\t3. 전체 사원 출력\n");
		printf("\t4. 끝내기\n\n");
		printf("번호 입력 : ");
		scanf("%d",&i);
		if(i==1)
		{
			printf("사원 번호 : ");
			scanf("%d",&number);
			printf("사원 나이 : ");
			scanf("%d",&age);
			printf("사원 봉급 : ");
			scanf("%d",&salary);
			AddEmployee(NewEmployee(number,age,salary));
		}
		else if(i==2)
		{
			printf("삭제할 사원 번호 : ");
			scanf("%d",&number);
			if(DeleteEmployee(number))
			{
				printf("삭제 성공\n");
			}
			else
			{
				printf("해당 번호의 사원이 없습니다.\n");
			}
		}
		else if(i==3)
		{
			PrintAllEmployee();
		}
		else if(i==4)
		{
			return 0;
		}
	}
	return 0;
}
