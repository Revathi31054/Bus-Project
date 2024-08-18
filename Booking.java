import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
String passengerName;
int busno;
Date date;
 Booking() {
	 Scanner Scanner = new Scanner(System.in);
	System.out.println("Enter name of passenger: ");
	passengerName =Scanner.next();
	System.out.println("Enter Bus no: ");
	busno =Scanner.nextInt();
	System.out.println("Enter date dd-mm--yyyy");
	String dateInput = Scanner.next();
	SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
	try {
		date =dateFormat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
 public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus>buses) {
	 int capacity =0;
	 for(Bus bus:buses) {
		 if(bus.getBusNo()==busno)
			 capacity =bus.getcapacity();
	 }
	 int booked =0;
	 for (Booking b:bookings) {
		 if(b.busno == busno && b.date.equals(date)) {
			 booked++;
		 }
	 }
	 return booked<capacity?true:false;
 }
}

