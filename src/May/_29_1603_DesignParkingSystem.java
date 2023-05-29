package May;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 29: Problem 1603 - Design Parking System
* 
*/

public class _29_1603_DesignParkingSystem {
	
	int [] parks = new int [4];

    public _29_1603_DesignParkingSystem(int big, int medium, int small) {
        parks[1] = big;
        parks[2] = medium;
        parks[3] = small;
    }
    
    public boolean addCar(int carType) {
        if (parks[carType] > 0) {
            parks[carType]--;
            return true;
        }
        return false;
    }
}
