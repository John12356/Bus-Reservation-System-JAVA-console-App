package busRes;
import java.util.*;
import java.text.*;

public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter name of the passenger: ");
			passengerName=s.next();
			System.out.println("Enter bus No: ");
			busNo=s.nextInt();
			System.out.println("Enter the booking date (dd-mm-yyyy)");
			String ipDate=s.next();
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
//		s.close();
			
			try {
				date=dateFormat.parse(ipDate);
			}catch(ParseException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public boolean isAvailable(ArrayList<Bus> buses,ArrayList<Booking> bookings) {
		int capacity=0,booked=0;
		for(Bus bus:buses) {
			if(bus.busNo==busNo) {
				capacity=bus.getSeats();
			}
		}
		for(Booking booking:bookings) {
			if(booking.busNo==busNo && booking.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity ? true:false;
	}
}
