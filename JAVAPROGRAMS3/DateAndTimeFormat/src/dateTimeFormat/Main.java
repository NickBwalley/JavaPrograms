package dateTimeFormat;
import java.util.Date;
import java.text.*;
public class Main {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString()); 	// prints the current day, date, time and time
		System.out.println(date.getTime());		// prints the number of milliseconds from 1st January 1970
		
		System.out.println(1+date.getMonth());	//prints the current month from zero so you need to add one to it 
		System.out.println(date.getDate()); 
		System.out.println(1900+date.getYear());		//need to add 1900 although its deprecated
		
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/DD  HH-mm-ss");
		//https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		System.out.println(sdf.format(date));
	}

}
