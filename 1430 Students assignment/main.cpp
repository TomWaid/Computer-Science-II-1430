// ConsoleApplication6.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include "Student.h"
using namespace std;

bool test(int numOfStudents, int numPerGroup) {
	if (numOfStudents % numPerGroup != 0) {
		throw "ERROR: CANNOT SPLIT STUDENTS EVENLY INTO GROUPS!";
	}
	else {
		return true;
	}
}

void excHandling(int numOfStudents, int numPerGroup) {
	try {
		test(numOfStudents, numPerGroup);
	}
	catch (char const* errorMessage) {
		cout << errorMessage << endl;
		exit(0);
	}
}
int main() {
	int numOfStudents, numPerGroup;
	cout << "Enter the number of students: " << endl;
	cin >> numOfStudents;
	Student **student = new Student*[numOfStudents - 1];
	for (int i = 0; i < numOfStudents; i++) {
		student[i] = new Student(i + 1);
	}
	cout << "Enter the number of students in each group: " << endl;
	cin >> numPerGroup;
	cout << "------------------------------------------------" << endl;
	excHandling(numOfStudents, numPerGroup);
	for (int i = 0; i < numOfStudents; i++) {
		for (int j = 0; j < numOfStudents; j++) {
			if (numPerGroup == 2) {
				print(*student[j]);
				print(*student[j + 1]);
				cout << "Group Average = ";
				cout << avgOf2(*student[j], *student[j + 1]) << endl;
				cout << endl;
				i += 2;
				j += 1;
			}
			if (numPerGroup == 3) {
				print(*student[j]);
				print(*student[j + 1]);
				print(*student[j + 2]);
				cout << "Group Average = ";
				cout << avgOf3(*student[j], *student[j + 1], *student[j + 2]) << endl;
				cout << endl;
				i += 3;
				j += 2;
			}
			if (numPerGroup == 4) {
				print(*student[j]);
				print(*student[j + 1]);
				print(*student[j + 2]);
				print(*student[j + 3]);
				cout << "Group Average = ";
				cout << avgOf4(*student[j], *student[j + 1], *student[j + 2], *student[j + 3]) << endl;
				cout << endl;
				i += 4;
				j += 3;
			}
		}
	}

	for (int i = 0; i < numOfStudents; i++) {
		delete student[i];
	}
	delete[] student;

	return 0;
}