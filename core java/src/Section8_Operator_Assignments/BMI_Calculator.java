package Section8_Operator_Assignments;

public class BMI_Calculator {
// BMI =weight in kg / (height * height)
	
	public static void main(String[] args) {
		
		double height = 5.8;
		double weight = 58;
		
		double heightInMeter = height * 0.4536;
		
		double bmi = weight / (heightInMeter * heightInMeter);
		
		System.out.println("BMI: " + bmi);

		
	}

}
