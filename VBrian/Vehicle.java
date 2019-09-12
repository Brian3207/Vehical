package VBrian;



abstract public class Vehicle 
{
	int passengers;
	int fuelcap;
	int mpg;
	int doors;
	int tireSize;
	double tonage;
	int modelYear;
	int totalMiles;
	int topSpeed;
	int speed;
	int fuelLevel;
	String horn;
	String key;
	String color;
	
	Vehicle (int p, int fC, int m, int d, int tS, int t, int y, int tM, int mph, int s, int fL, String c, String h, String k)
	// Constructor involving all integers
	{
	passengers = p;
	fuelcap = fC;
	mpg = m;
	doors = d;
	tireSize = tS;
	tonage = t;
	modelYear = y;
	totalMiles = tM;
	topSpeed = tS;
	speed = s;
	fuelLevel = fL;
	color = c;
	horn = h;
	key = k;
	}
	
	
	Vehicle (int p, int m, int fC) 
	// Constructor involving passengers (int p) , fuelcap (int fC) , and mpg (int m) 
	{
	passengers = p;
	fuelcap = fC;
	mpg = m;
	doors = 4;
	tireSize = 34;
	tonage = 3500;				
	modelYear = 1964;
	totalMiles = 3400;
	topSpeed = 130;
	speed = 65;
	horn = "Beep";
	key = " Remote ";
	color = "Electric Blue";
	}
	
	Vehicle()
	// Constructors involving all integer totals
	{
	doors = 4;
	tireSize = 34;
	tonage = 3500;
	modelYear = 1964;
	passengers = 4;
	fuelcap = 14;
	mpg = 12;
	totalMiles = 3400;
	topSpeed = 130;
	speed = 65;
	horn = "Beep";
	key = " Remote ";
	color = "Electric Blue";
	}
	
	//Range Method
	int range() {
	return mpg * fuelcap;
	}
	
	
	//Overloaded Range
	int range (int m, int fC)
	{
		mpg = m; fuelcap = fC;
		return m * fC;
	}
	
	//Fuel Needed Method
	double fuelneeded(int tM) 
	{
		return (double) totalMiles * mpg;
	}
	
	//Overloaded Fuel Needed
	double fuelneeded (int tM, int m)
	{
		mpg = m;
		return (double) tM / m; 
	}
	
	//Refillment Method
	double refillneeded( int tM) 
	{
		return tM / range();
	}
	
	// Overloaded Refillment 
	int refillneeded (int tM, int fC, int m)
	{
		mpg = m; fuelcap = fC; 
		return (int) 252 / m / fC+1 ;
	}
	
	
	//Carhorn Method
	public static String carhorn() 
	{
		String carhorn = " honk honk........";
		return carhorn; 
	}
	
	//Accelerating Method
		public static String accelerate()
	{ 
	
		String motion = "Accelerating.....";
		return motion; 
	}
	
	//Brake Method	
		public static String brake()
	{ 
	
		String brake = "Brake Check....";
		return brake; 
	}
	
	//Key Method
		public boolean display(String USEDkey)
	{	
		if (USEDkey == key)
		{
			System.out.println("Engine fires up"); 
			return true;
		}
		
		else
		{	
			System.out.println ("Alarm sounds");
			return false; 
		}
		
	
	}
	
		abstract void getmakemodel();
	
}