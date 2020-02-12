import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
class Hello{

	public static void main (String args[]){
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		//added the two comments to the master branch but end to make a new branch and add them that way
		System.out.println("Hello World");

		System.out.println("Here ye : important announcement");

		System.out.println("Goodbye Boss!");

		System.out.println("Hi Alice & Bob");

		System.out.println("Hi to Charlie");

		System.out.println("Hello Denise");

		System.out.println("Hello Ester");


	}

}
