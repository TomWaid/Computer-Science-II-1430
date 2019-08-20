#include "stdafx.h"
#include "Student.h"
#include <iostream>

using namespace std;

Student::Student() {}

Student::~Student() {}

Student::Student(int tempID) {
	studentID = tempID;
	studentGrade = rand() % (100 - 70 + 1) + 70;
}

int Student::operator + (const Student &next) {
	return studentGrade + next.studentGrade;
}

int operator + (const int& first, const Student& next) {
	return first + next.studentGrade;
}

void print(Student temp) {
	cout << "Student " << temp.studentID << ": ";
	cout << "Grade " << temp.studentGrade << endl;
}

int avgOf2(Student a, Student b) {
	int total = a.studentGrade + b.studentGrade;
	int average = total / 2;
	return average;
}

int avgOf3(Student a, Student b, Student c) {
	int total = a.studentGrade + b.studentGrade + c.studentGrade;
	int average = total / 3;
	return average;
}

int avgOf4(Student a, Student b, Student c, Student d) {
	int total = a.studentGrade + b.studentGrade + c.studentGrade + d.studentGrade;
	int average = total / 4;
	return average;
}