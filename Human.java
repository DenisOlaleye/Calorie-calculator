
public class Human 
{
//	declaring class fields
	private double BMR = 0;			//basal metabolic rate - amount of energie expanded while at rest
	private int height;			// in centimeters
	private int weight;		//in kilograms
	private int age;			// in years
	private char sex;		// 'M' - Men, 'W' - woman
	private double physicalActivityCoeff; 		// physical activity coefficient 
	
//	creating setMethods()
	public void setHeight(int h)
	{
		height = h;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public void setWeight(int w)
	{
		weight = w;
	}
	public void setSex(char s)
	{
		sex = s;
	}
	/*Сидячий образ жизни – 1,2;
	  Умеренная активность (легкие физические нагрузки либо занятия 1-3 раз в неделю) – 1,375;
	  Средняя активность (занятия 3-5 раз в неделю) – 1,55;
	  Активные люди (интенсивные нагрузки, занятия 6-7 раз в неделю) – 1,725;
	  Спортсмены и люди, выполняющие сходные нагрузки (6-7 раз в неделю) – 1,9.*/
	
	public void setPAC(double pac)
	{
		System.out.print("Rate level of your phisycal activity from 1 - 5 (1- sedentary lifestyle, 5 - professional athlete) >>");
		physicalActivityCoeff = pac;
	}
	
//	creating getMethods()
	public int getHeight()
	{
		return height;
	}
	public int getWeight()
	{
		return weight;
	}
	public int getAge()
	{
		return age;
	}
	public char getSex()
	{
		return sex;
	}
	public double getPAC()
	{
		return physicalActivityCoeff;
	}
	public double getBMR(char sex, int weight, int height, int age)
	{
		if (sex == 'M')
		{
			BMR = (10 * weight) + (6.25 * height) - (5 * age) + 5; //чоловіча
		}
		else if (sex == 'W')
		{
			BMR = (10 * weight) + (6.25 * height) - (5 * age) - 161; //жіноча
		}
		else
		{
			System.out.println("Wrong answer!");
		}
			return BMR;
	}

}
