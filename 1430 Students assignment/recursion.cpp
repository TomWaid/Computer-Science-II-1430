// studying_recursion.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include< string>
#include<vector>
using namespace std;
void ScrambleLetters(string remainLetters,  // Remaining letters
	string scramLetters) { // Scrambled letters
	string tmpString; // Temp word combination
	int i = 0;        // Loop index

	if (remainLetters.length() == 0) { // Base case: All letters used
		cout << scramLetters << endl;
	}
	else {                             // Recursive case: move a letter from
									   // remaining to scrambled letters
		for (i = 0; i < remainLetters.length(); ++i) {
			// Move letter to scrambled letters
			tmpString = remainLetters.substr(i, 1);
			remainLetters.erase(i, 1);
			scramLetters = scramLetters + tmpString;

			ScrambleLetters(remainLetters, scramLetters);

			// Put letter back in remaining letters
			remainLetters.insert(i, tmpString);
			scramLetters.erase(scramLetters.length() - 1, 1);
		}
	}
	return;
}
int main()
{
    return 0;
}

