/**
* MyHealthDataBase is a base class to be extended for the Electronic Health Records (EHR) System,
* also known as Assignment 1.  It contains a method to calculate BMI and will contain other methods.
* @author Daniel Cormier
* @version 1.1
* @since Java 1_8.301
* @see MyHealthData
*/

/**
 * abstract superclass MyHealthDataBase
 */
public abstract class MyHealthDataBase
{
	/**
	 * abstract method getHeight()
	 * @return height
	 */
	public abstract double getHeight();

	/**
	 * method calculate BMI 
	 * @param weight
	 * @param height
	 * @return weight * 703 / (getHeight() * getHeight())
	 */
 	public double calculateBMI(double weight, double height)
    {
        return weight * 703 / (getHeight() * getHeight());
    }
 	/**
	 * method wrong BMI 
	 * @param weight
	 * @param height
	 * @return weight * 703 / (getHeight() * getHeight())
	 */
 	public double wrongBMI(double weight, double height)
    {
        return weight * 703 / (getHeight() - getHeight());
    }
}