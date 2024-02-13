import java.util.Date;

public class Flight {
    private String flight_num;
    private String origin;
    private String destination;
    private Date date;
    private int total_seates;
    private int avaliable_seats;

    public String getFlight_num() {
        return flight_num;
    }

    public void setFlight_num(String flight_num) {
        this.flight_num = flight_num;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotal_seates() {
        return total_seates;
    }

    public void setTotal_seates(int total_seates) {
        this.total_seates = total_seates;
    }

    public int getAvaliable_seats() {
        return avaliable_seats;
    }

    public void setAvaliable_seats(int avaliable_seats) {
        this.avaliable_seats = avaliable_seats;
    }

    public Flight(String flight_num, String origin, String destination, Date date, int total_seates) {
        this.flight_num = flight_num;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.total_seates = total_seates;
    }

    public boolean bookSeat(int numofseats){
        if(numofseats<=avaliable_seats){
            avaliable_seats-=numofseats;
            System.out.println(numofseats+"seat(s) booked sucessfully.");
            return true;
        }
        else{
            System.out.println("No avaliable Seats to book.");
        return false;}
    }
    public void flightdetails(){
        System.out.println("Flight number:"+flight_num);
        System.out.println("Orign:"+origin);
        System.out.println("Destination:"+destination);
        System.out.println("Date:"+date);
        System.out.println("Total Seats:"+total_seates);
        System.out.println("Avaliable Seats:"+avaliable_seats);
    }
}
