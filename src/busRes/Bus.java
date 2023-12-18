package busRes;

public class Bus {
	int busNo;
	boolean Ac;
	int seats;
	
	Bus(int busNo,boolean Ac,int seats){
		this.busNo=busNo;
		this.Ac=Ac;
		this.seats=seats;
	}
	
	//accessors
	public int getBusNo() {
		return busNo;
	}
	public boolean isAc() {
		return Ac;
	}
	public int getSeats() {
		return seats;
	}
	//mutators
	public void setAc(boolean x) {
		Ac=x;
	}
	public void setSeats(int seat) {
		seats=seat;
	}
	
	public void displayBus() {
		System.out.println("Bus NO:"+busNo+" Ac:"+Ac+" Total Seats:"+seats);
	}
	
}
