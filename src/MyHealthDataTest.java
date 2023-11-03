/**
 * 
 * @author Jessica Gunawan
 * @version 1.0
 * @since javac 17.0.7
 * @see MyHealthData, MyHealthDataBase
 */
/*
 * Author: Jessica Gunawan
 * Student ID: 040861167
 * Date: 10/10/2023
 * Professor: Veda Vasavi Erukulla
 * Purpose: display patient's health data
 */

/**
 * main method: MyHealthDataTest display test
 */
public class MyHealthDataTest {

	public static void main(String[] args) {
	/**
	 * patient info
	 * @param fName
	 * @param lName
	 * @param gender
	 * @param birthYear
	 * @param currentYear
	 * @param height
	 * @param weight
	 * @param age
	 */
		
	MyHealthData patient1 = new MyHealthData("Andy", "Lee", "Male", 1995, 2023, 75, 150);
	/**
	 * display data
	 */
	patient1.displayMyHealthData();
	}
}
