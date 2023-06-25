public class Passenger {

    private String name;
    private int noOfBags;
    private double bagWeight = 10.50;

    public Passenger(String name, int noOfBags){
//        this.name = name;
        this.noOfBags = noOfBags;
    }

    public String getName(){
        return name;
    }

    public int getNoOfBags(){
        return noOfBags;
    }

    public double getTotalBagWeight(){
        return bagWeight * noOfBags;
    }
}
