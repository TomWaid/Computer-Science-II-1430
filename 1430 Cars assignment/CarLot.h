#pragma once

#include <string>

using namespace std;
class CarLot
{
public:
	CarLot();
	~CarLot();
	void setCarModel(string Model);
	string getCarModel();
	void setRepairSize(int);
	int getRepairSize();
	void setRepair(int*);
	int getRepair();






private:
	string model;
	int repairSize[30];
	int*repairs;
	static int numOfCar;
	string listOfmodels[30];
	string intFile[30];
	int repairOfEacCar[30];


};

