import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;


/**
 * Test unit for MyHealthData class
 * @author Jessica Gunawan
 * @version 1.0
 * @since javac 17.0.7
 * @see org.junit.Test
 */

/**
 * MyHealthDataTest2 JUnit test
 */

public class MyHealthDataTest2 {
/**
 * create epsilon
 */
	private static final double EPSILON = 1E-2;
/**
 * right BMI, test success
 */
	@Test
	public void testCalculateBMI() {
		MyHealthData patient2 = new MyHealthData("Bobby", "Wang", "Male", 1996, 2023, 70, 140);
		double calc = patient2.calculateBMI(patient2.getWeight(), patient2.getHeight());
		double expected = 20.09;
		Assert.assertEquals(expected, calc, EPSILON);
	}
/**
 * wrong BMI, test fail
 */
	@Test
	public void testWrongBMI() {
		MyHealthData patient2 = new MyHealthData("Bobby", "Wang", "Male", 1996, 2023, 70, 140);
		double calc = patient2.wrongBMI(patient2.getWeight(), patient2.getHeight());
		double expected = 20.09;
		Assert.assertEquals(expected, calc, EPSILON);
	}

}
