#pragma once
class Student {

public:
	Student();
	~Student();
	Student(int tempID);
	friend void print(Student temp);
	friend int avgOf2(Student a, Student b);
	friend int avgOf3(Student a, Student b, Student c);
	friend int avgOf4(Student a, Student b, Student c, Student d);
	int operator + (const Student& next);
	friend int operator + (const int& first, const Student& next);

private:
	int studentID;
	int studentGrade;
};
