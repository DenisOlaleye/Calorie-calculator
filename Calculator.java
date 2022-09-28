import java.util.Scanner;

public class Calculator 
{
	public static void main (String [] args)
	{
		double BMR = 0;			//basal metabolic rate - amount of energie expanded while at rest
		int height;			// in centimeters
		int age;			// in years
		int weight;		//in kilograms
		int sex;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your height >> ");
		height = input.nextInt();
		System.out.print("Enter your weight >> ");
		weight = input.nextInt();
		System.out.print("Enter your age >> ");
		age = input.nextInt();
		System.out.print("Enter '1' if you are a male and '0' if you are a woman >> ");
		sex = input.nextInt();
input.close();

		if (sex == 1)
		{
			BMR = 66.5 + (13.76 * weight) + (5.003 * height) - (6.755 * age);
		}
		else  
		{
			BMR = 655 + (9.563 * weight) + (1.85 * height) - (4.676 * age);
		}
	
		
		System.out.println(BMR);
		
		
//		66.5+(13.76*weight)+(5.003*height)-(6.755 * age) чоловіча формула
//		655+(9.563*weight)+(1.85*height)-(4,676 * age) жіноча формула
		
//		(10 * weight) + (6.25 * height) - (5 * age) + 5; чоловіча
//		(10 * weight) + (6.25 * height) - (5 * age) - 161; жіноча
		
		
		
	}
}
