#include <stdio.h>
#ifndef EMPLOYEE_H
#define EMPLOYEE_H
typedef struct
{
	int number;
	int age;
	int salary;
} Employee;

Employee NewEmployee(int number, int age, int salary);

void PrintEmployee(Employee employee);
#endif
