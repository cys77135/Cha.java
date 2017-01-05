#include <stdio.h>
#include "Employee.h"

Employee NewEmployee(int number, int age, int salary)
{
	Employee employee;
	employee.number = number;
	employee.age = age;
	employee.salary = salary;
}

void PrintEmployee(Employee employee);
{
	printf("사원번호: %d\n", employee.number);
	printf("나이: %d\n", employee.age);
	printf("봉급: %d\n\n", employee.salary);
}
