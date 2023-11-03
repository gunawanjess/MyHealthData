/**
 * 
 * @author Jessica Gunawan
 * @version 1.0
 * @since javac 17.0.7
 * @see MyHealthDataBase
 */
public class MyHealthData extends MyHealthDataBase
{

/**
 * This system maintains important health information about a patient.
 */

	private String fName;
	private String lName;
	private String gender;
	private int birthYear;
	private int currentYear;
	private double height;
	private double weight;
	private int age;


    /**
     * INCLUDE CONSTRUCTOR  
     * @param fName
     * @param lName
     * @param gender
     * @param birthYear
     * @param currentYear
     * @param height
     * @param weight
     */
	public MyHealthData(String fName, String lName, String gender, int birthYear, int currentYear, double height, double weight) {
	this.setFName(fName);
	this.setLName(lName);
	this.setGender(gender);
	this.setBirthYear(birthYear);
	this.setCurrentYear(currentYear);
	this.setHeight(height);
	this.setWeight(weight);
	}

    /**
     * get fName
     * @return fName
     */
	public String getFName() {
		return fName;
	}
	/**
	 * set fName
	 * @param fName
	 */
	public void setFName(String fName) {
		this.fName = fName;
	}
	/**
	 * get lName
	 * @return lName
	 */
	public String getLName() {
		return lName;
	}
	/**
	 * set lName
	 * @param lName
	 */
	public void setLName(String lName) {
		this.lName = lName;
	}
	/**
	 * get gender
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * set gender
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * get birth year
	 * @return birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}
	/**
	 * set birth year
	 * @param birthYear
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	/**
	 * get current year
	 * @return currentYear
	 */
	public int getCurrentYear() {
		return currentYear;
	}
	/**
	 * set current year
	 * @param currentYear
	 */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	/**
	 * get age
	 * @return currentYear - birthYear
	 */
	public int getAge() {
		return age = currentYear - birthYear;
	}
	/**
	 * get height
	 * @return height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * set height
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * get weight
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * set weight
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * calculate max heart rate
	 * @return 220 - age
	 */
	public int calculateMaxHeartRate() {
		return 220 - age;
	}
	/**
	 * target min heart rate
	 * @return 0.5 * calculate max heart rate
	 */
	public int targetMinHeartRate() {
	    return (int) (0.5 * calculateMaxHeartRate());
	}
	/**
	 * target max heart rate
	 * @return 0.5 * calculate max heart rate
	 */
	public int targetMaxHeartRate() {
	    return (int) (0.85 * calculateMaxHeartRate());
	}

  /**
   *  DISPLAY ALL THE PATIENT'S HEALTH DATA.
   */

    public void displayMyHealthData() 
    { 

 /**
   *  USE System.out.printf TO SHOW ALL HEALTH DATA.
   */

    System.out.printf("First Name: %s\n", getFName());
    System.out.printf("Last Name: %s\n", getLName());
    System.out.printf("Gender: %s\n", getGender());
    System.out.printf("Birth year: %s\n", getBirthYear());
    System.out.printf("Height: %s\n", getHeight());
    System.out.printf("Weight: %s\n", getWeight());
    System.out.printf("Age (years): %s\n", getAge());
    System.out.printf("Max heart rate: %s\n", calculateMaxHeartRate());
    System.out.printf("Target Min heart rate: %s\n", targetMinHeartRate());
    System.out.printf("Target Max heart rate: %s\n", targetMaxHeartRate());
    System.out.printf("BMI: %.2f\n", calculateBMI(getWeight(), getHeight()));

/**
 * bmi values
 */
       System.out.println("BMI VALUES");
       System.out.println("Underweight: less than 18.5");
       System.out.println("Normal:      between 18.5 and 24.9");
       System.out.println("Overweight:  between 25 and 29.9");
       System.out.println("Obese:       30 or greater");   
    } 

}