import java.util.Scanner;

public class marathon 
{
	
	public static void formatTable(double t) 
	{
		int h, m, s;
		h= (int)t/3600;
		m= (int)t/60;
		s= (int)t;
	}
	
	public static void printMarathon(float pace)
	{
	    
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String name;
		double distance;
		int minutes;
		int seconds;
		int hours;
		// input data 
		
		System.out.print("What's up, what's your name?");
		name = in.next();
		System.out.print("Alright " + name + " how many miles did you run?!");
		distance = in.nextDouble();
		System.out.print("Nice, how many hours did that take you to run that?");
		hours = in.nextInt();
		System.out.print("Minutes?");
		minutes = in.nextInt();
		System.out.print("Seconds?");
		seconds = in.nextInt();
		
		int timeInSeconds = 3600 * hours + 60 * minutes + seconds;
		double pace = timeInSeconds / distance;
		
		
		//output
		
		System.out.printf("Hi " + name + " Your pace is: %d : %02d", m, s);
		System.out.printf("At this rate, your marathon time would be: %d : %02d : %02d" h, m, s);	
		
	}

}
