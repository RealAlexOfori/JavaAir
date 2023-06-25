import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private String flightNo;
    private String destination;
    private String departure;
    private String departureTime;
    private double currentWeight = 0;
    private int capacity;

    private double totalWeightAllowance;

    public Flight(String flightNo, String destination, String departure, String departureTime,
                  double totalWeightAllowance,int capacity){
        this.pilots = new ArrayList<Pilot>();
        this.crewMembers = new ArrayList<CrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.flightNo = flightNo;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.totalWeightAllowance = totalWeightAllowance;
        this.capacity = capacity;
    }

    public int getAvailableSeats(){
        return this.capacity - this.passengers.size();
    }

    public void bookPassenger(Passenger passenger){
       if (getAvailableSeats() > 0){
           this.passengers.add(passenger);
       }
    }
}
