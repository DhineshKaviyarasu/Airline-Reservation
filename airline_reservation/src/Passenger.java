import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private String contactInfo;
    private List<Flight> bookedflights;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Flight> getBookedflights() {
        return bookedflights;
    }

    public void setBookedflights(List<Flight> bookedflights) {
        this.bookedflights = bookedflights;
    }

    public Passenger(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.bookedflights = new ArrayList<>();
    }
    public void bookFlight(Flight flight){
        bookedflights.add(flight);
        System.out.println(name+"has booked a flight: "+flight.getFlight_num());
    }
    public void printPassengerDetails(){
        System.out.println("Passenger Name:"+name);
        System.out.println("Contact Info: "+contactInfo);
        System.out.println("Booked flights:");
        for (Flight flight:bookedflights){
            System.out.println("- "+flight.getFlight_num());
        }
    }

}
