package busRes;
import java.util.Scanner;
import java.util.ArrayList;

public class BusController {

	public static void main(String[] args) throws Exception{
		Scanner s=new Scanner(System.in);
		
		ArrayList<Bus> buses=new ArrayList<>();
		ArrayList<Booking> bookings=new ArrayList<>();
		
		buses.add(new Bus(1,true,1));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,20));
		buses.add(new Bus(4,false,35));
		
		for(Bus b: buses) {
			b.displayBus();
		}
		int userChoice=1;
		while(userChoice==1) {
//			System.out.println();
			System.out.println("Enter 1 to book and enter 2 to exit..");
			userChoice=s.nextInt();
			if(userChoice==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(buses,bookings)) {
					bookings.add(booking);
					System.out.println("Booked successfully...");
				}
				else System.out.println("No seats available..check for another bus...");
			}
		}
		s.close();
		

	}

}
