#include "stdafx.h"
#include "CarLot.h"

int CarLot::numOfCar = 0;

CarLot::CarLot()
{
	repairs = new int[30];
}


CarLot::~CarLot()
{
	delete[]repairs;
}

void CarLot::setCarModel(string carArray) {
	this-> listOfmodels[numOfCar] = carArray;
}
string CarLot::getCarModel() {

	return this->listOfmodels[numOfCar];
}
void CarLot::setRepairSize(int howManyErrors) {
	this->repairSize[numOfCar] = howManyErrors;
}
int CarLot::getRepairSize() {
	return this->repairSize[numOfCar];
}
void CarLot::setRepair(int* errorDesc) {
	repairs = errorDesc;
}
int CarLot::getRepair() {

	return *repairs;
}


