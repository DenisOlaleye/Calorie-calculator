//Denis Olaleye
//28.09.22



import java.util.Scanner;

public class Calculator 
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		Human human = new Human();
		
		System.out.print("Enter your height >> ");
		human.setHeight(input.nextInt());
		System.out.print("Enter your weight >> ");
		human.setWeight(input.nextInt());
		System.out.print("Enter your age >> ");
		human.setAge(input.nextInt());
		System.out.print("Enter 'M' if you are a male and 'W' if you are a woman >> ");
		human.setSex(input.next().charAt(0));
		input.close();
		
		System.out.println(human.getHeight());
		System.out.println(human.getWeight());
		System.out.println(human.getAge());
		System.out.println(human.getSex());
		System.out.println("Your basal metabolic rate is " +human.getBMR(human.getSex(), human.getWeight(), human.getHeight(), human.getAge()));
	}
}
