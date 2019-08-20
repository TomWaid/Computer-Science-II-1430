// ConsoleApplication15.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <string>
#include <iostream>
#include <fstream>
#include <sstream>
#include "CarLot.h"

using namespace std;
struct RepairList {
	int repairCode;
	string repairPart[7];

};
int main()
{
	fstream carFile("Cars.txt");
	fstream detailFile("RepairsKey.txt");
	string carText, detailText, carListofErrors, carNumCntrErrors, carNameList, detailNameList;

	int numsOfCar = 0;
	int carListRepair;
	int RepairSize = 0;
	int *getRepairofEachCar;
	int detailCodes;
	CarLot CarsList;
	RepairList ErrorsList;

	if (detailFile.is_open()) {
		while (getline(detailFile, detailText)) {
			stringstream numStr(detailText);
			numStr >> detailCodes;
			ErrorsList.repairCode = detailCodes;
			stringstream details(detailText);
			string detailWords;
			while (getline(details, detailText)) {
				details >> detailWords;

				detailWords = detailWords.assign(detailText, 2, 14);
				ErrorsList.repairPart[ErrorsList.repairCode] = detailWords;

			}


		}


	}
	if (carFile.is_open()) {
		while (getline(carFile, carText)) {
			numsOfCar++;
			CarLot(numsOfCar);
			stringstream names(carText);
			names >> carNameList;
			CarsList.setCarModel(carNameList);
			cout << endl;
			cout << "Car name" << CarsList.getCarModel() << endl;
			stringstream ss(carText);
			string carWords;
			RepairSize = 0;

			while (getline(ss, carWords, ' ')) {
				ss >> carWords;


				if (carWords == "1" || carWords == "2" || carWords == "3" || carWords == "4" || carWords == "5") {
					RepairSize++;
					CarsList.setRepairSize(RepairSize);
					cout << "Repair # " << CarsList.getRepairSize() << "," << endl;
					stringstream intError(carWords);
					intError >> carListRepair;
					getRepairofEachCar = new int[RepairSize];





					for (int i = 0; i < RepairSize; i++) {
						getRepairofEachCar[i] = carListRepair;
					}
					CarsList.setRepair(getRepairofEachCar);

					try {
						if (CarsList.getRepair() == 1)
							throw 1;
						if (CarsList.getRepair() == 2)
							throw 2;
						if (CarsList.getRepair() == 3)
							throw 3;
						if (CarsList.getRepair() == 4)
							throw 4;
						if (CarsList.getRepair() == 5)
							throw 5;
					}
					catch (int j) {
						if (j == 0) {
							cout << ErrorsList.repairPart[0];
						}
						else if (j == 1) {
							cout << ErrorsList.repairPart[1];
						}
						else if (j == 2) {
							cout << ErrorsList.repairPart[2];
						}
						else if (j == 3) {
							cout << ErrorsList.repairPart[3];
						}
						else if (j == 4) {
							cout << ErrorsList.repairPart[4];
						}
						else if (j == 5) {
							cout << ErrorsList.repairPart[5];
						}
					}

				}
				else if (carWords == "0") {
					RepairSize = 0;
					CarsList.setRepairSize(RepairSize);
					try {
						if (RepairSize == 0) {
							throw 0;
						}
					}
					catch (int i) {
						if (i == 0) {
							cout << " Car is in good shape" << endl;
						}
					}
				}
			}


		}
	}


	carFile.close();
	detailFile.close();


	system("pause");
	return 0;

}


