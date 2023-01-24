//Yes it is my own work, sadly I don't have friends in the course yet as I'm the only one in my circle doing this part time course
//and I'm the only one who pursued computer science as my degree among my friends
//I am willing to get penalized but this is honestly my own work
//my name: ROXY CHARISSE ABASTILLAS LIBOR

//import scanner
import java.util.EnumSet;
import java. util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public enum Zodiac{
	//declare constants of enum type
	Aries("ARI","March 21","April 19"),
	Taurus("TAU","April 20","May20"),
	Gemini("GEM", "May 21","June 20"),
	Cancer("CAN","June 21","July 22"),
	Leo("LEO","July 23","August 22"),
	Virgo("VIR","August 23", "September 22"),
	Libra("LIB","September 23","October 22"),
	Scorpio("SCO","October 23","November 21"),
	Sagittarius("SAG","November 22","December 21"),
	Capricorn("CAP","December 22","January 19"),
	Aquarius("AQU","January 20","February 18"),
	Pisces("PIS","February 19","March 20");
	
	//instance fields
	private final String abbreviation;
	private final String StartingDate;
	private final String EndingDate;
	
	//enum constructor
	Zodiac(String abbreviation, String StartingDate, String EndingDate){
		this.abbreviation = abbreviation;
		this.StartingDate = StartingDate;
		this.EndingDate = EndingDate
	}
	
	//accessors
	public String getAbbreviation(){
		return abbreviation;
	}
	
	public String getStartingDate(){
		return StartingDate;
	}
	
	public String getEndingDate(){
		return EndingDate;
	}
}// end enum Zodiac

public class Set{
	
	Set uSet = new Set()
	
	ArrayList<Zodiac> universal = new ArrayList<Zodiac>();
	for(Zodiac zodiac : Zodiac.value()){
			universal.add(zodiac);
	}
	
	private String set;
	
	//constructors
	Set(){
	}
	
	//!!!!need to deep copy
	Set(Set otherSet){
		this.set = otherSet;
	}
	
	
	//methods
	public boolean isEmpty(){
		if(a.size()==0)
			return true;
		else
			return false
	
	}
	
	public int cardinality(){
		return a.size();
	}

	public 	boolean belongTo(Zodiac element){
		int belong = 0;
		for(Zodiac set : a){
			if(set.equals(element))
				belong = belong + 1;		
		}
		
		if(belong>0)
			return true;
		else
			return false;
	}
	
	public void addElement(Zodiac element){
		a.add(element);
	}
	
	public boolean subset(Set otherSet){
		int belong = 0;
		for(Zodiac set : a){
			if(set.equals(otherSet.getAnElement))
				belong = belong + 1;		
		}
		
		if(belong>0)
			return true;
		else
			return false;
	}
	
	public void union(Set otherSet){
		Set uSet = new Set();
		for(Zodiac uset : a){
			if(!uset.equals(otherSet.getAnElement))
				uSet.add(otherSet.getAnElement);
			else if(uset.equals(otherSet.getAnElement))
				uSet.add(otherSet.getAnElement);	
		}
		System.out.println("Given sets");
		System.out.println( "A = " + Arrays.toString(otherSet.toArray()) );
		System.out.println( "B = " + Arrays.toString(a.toArray()) );
		System.out.println( Arrays.toString(uSet.toArray()) );
	}
	
	public void intersection(Set otherSet){
		Set uSet = new Set();
		for(Zodiac uset : a){
			if(uset.equals(otherSet.getAnElement))
				uSet.add(otherSet.getAnElement);	
		}
		System.out.println("Given sets");
		System.out.println( "A = " + Arrays.toString(otherSet.toArray()) );
		System.out.println( "B = " + Arrays.toString(a.toArray()) );
		System.out.println( Arrays.toString(uSet.toArray()) );
	}
	
	public void difference(Set otherSet){
		Set uSet = new Set();
		for(Set uset : a){
			if(!uset.equals(universal.getAnElement))
				uSet.add(universal.getAnElement);	
		}
		System.out.println("Given sets");
		System.out.println( "A = " + Arrays.toString(universal.toArray()) );
		System.out.println( "B = " + Arrays.toString(a.toArray()) );
		System.out.println( Arrays.toString(uSet.toArray()) );
	}
	
	public Set complement(){
		Set uSet = new Set();
		for(Set uset : a){
			if(uset.equals(universal.getAnElement))
				uSet.add(universal.getAnElement);	
		}
		System.out.println("Given sets");
		System.out.println( "A = " + Arrays.toString(universal.toArray()) );
		System.out.println( "B = " + Arrays.toString(a.toArray()) );
		System.out.println( Arrays.toString(uSet.toArray()) );
		
		
		
	}
	
	public boolean equality(Set otherSet){
		int equal = 0;
		for(Set set : a){
			if(!set.equals(getAbbreviation()))
				equal = equal + 1;	
		}
		if(equal>0)
			return false;
		else
			return true;
	}
	
	
	// get an array of all the cards
	private Zodiac[]zodiac=Zodiac.values();
	
	// this generates random numbers
	private Random random = new Random();
	
	// choose a card at random
	final Zodiac random(){
		return zodiac[random.nextInt(zodiac.length)];
	}
	
	public ArrayList<Zodiac>  generateRandomArrayList(){
		int randomBetweenOneTo12 = ThreadLocalRandom.current().nextInt(1, 12 + 1);
		ArrayList<Zodiac> arr = new ArrayList<Zodiac>(randomBetweenOneTo12);
		
		
		
		for (int counter = 0; counter < arr.size(); counter++) { 		      
          arr.add(random);		
      }
	  
	  return arr;		
	}
	
	public String getEnumFormat(){
		
		String stringenum = "";
		for (int counter = 0; counter < a.size(); counter++) { 		      
          stringenum = stringenum + a.getAbbreviation();
		
		return  stringenum;
	}
	
	//public String toString(){
	//	return String.format(" A = ", x, y);
	//}
}//end class Set

public class Roxy_A1.java{
	public static void displayZodiacInfo(){
		//print all zodiac in enum Zodiac
		for(Zodiac zodiac : Zodiac.values))
			System.out.printf("%-10s%s%-45s%s%n", zodiac, zodiac.getAbbreviation(), zodiac.getStartingDate(), zodiac.getEndingDate());
		
	}
	
	public static Zodiac getAnElement(){
		
	}
	
	public static Set getASet(){
		
	}
	
	public static void displayMenu(){
		system.out.println("Welcome to SIM Set Theory lesson");
		system.out.println("0. Properties of set");
		system.out.println("1. Union example");
		system.out.println("2. Intersection example");
		system.out.println("3. Subset Example");
		system.out.println("4. Difference example");
		system.out.println("5. Complement example");
		system.out.println("6. Sets equality example");
		system.out.println("7. Distributive Law 1 ");
		system.out.println("9. Quit");
		
	}
	
	public static unionExample(){
		ArrayList<Zodiac> arr1 = Set.generateRandomArrayList();
		
		
	}
	
	public static void intersectionExample(){
	
	}
	
	public static void subsetExample(){
		
	}
	
	public static void differenceExample(){
	
	}
	
	public static void complementExample(){
		
	}
	
	public static void equalityExample(){
		
	}
	
	public static void distributiveLaw(){
		
	}
	
	public static void displaySubMenu(){
		System.out.println("Some basic operations in set");
		System.out.println("1. Add an element"):
		System.out.println("2. Check an element");
		System.out.println("3. Cardinality");
		System.out.println("4. Enum format");
		System.out.println("9. Quit");
		
	}
	
	public static void anExample(){
		System.out.println("Here is an example of a set A = {");
		generateRandomArrayList();
		ArrayList<Zodiac> arr = generateRandomArrayList();
		
		for (int counter = 0; counter < arr.size(); counter++) { 		      
          System.out.println(arr.getAbbreviation());		
      }
		System.out.println("}");
		System.out.println("All elements in set are distinct and random order");
	}
	
	public static void anElement(Zodiac z){
		if (belongTo.equals(True))
			System.out.println("Element " + z +"is in set");
		
		else
			System.out.println("Element " + z +"is not in set");
	}

	
		
	public static void main(String[] args){
		displayZodiacInfo();
		
		//input scanner
		//To declare a Scanner class object
		Scanner input = new Scanner (System.in);
			
			while(true){
				displayMenu();
				System.out.print("Your option: ");
				String option = input.nextLine();	
				if (!option.equals("9")) {
					break;
				}
				
				else {
					continue;
					if(option.equals(0)){
						anExample();
						displaySubMenu();
							while (true){
								if (!option.equals("9")) {
									break;
								}
				
								else {
									continue;
										if (option.equals(1)){
											System.out.print("Enter an element: ");
											Zodiac element = input.nextLine();	
											Set.addElement(element);
										}
											
										else if(option.equals(2)){
											System.out.print("Enter an element: ");
											Zodiac element = input.nextLine();
											anExample(element);
										}
											
										else if(option.equals(3)){
											System.out.print("Enter an element: ");
											Zodiac element = input.nextLine();
											System.out.print("Number of elements in a set is" + Set.cardinality(element));
										}
										
										else if(option.equals(4)){
											System.out.print("Notation in enum format: ");
											System.out.print(getEnumFormat());
										}
								}
						}
					
					else if(option.equals(1))
						unionExample();
							
					else if(option.equals(2))
						intersectionExample();	
					
					else if(option.equals(3))
						SubsetExample();	
					
					else if(option.equals(4))
						differenceExample();
					
					else if(option.equals(5))
						complementExample();
					
					else if(option.equals(6))
						equalityExample();
					
					else if(option.equals(7))
						equalityExample();
					
					else if(option.equals(8))
						distributiveLaw();
			}	
	}
	
}//end class Roxy_A1



