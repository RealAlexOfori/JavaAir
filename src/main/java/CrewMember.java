public class CrewMember extends Passenger {

    private String name;
    private String rank;

    public CrewMember(String name, String rank, int noOfBags){
        super(name, noOfBags);
        this.rank = rank;
//        this.getNoOfBags();
    }

    public String getName(){
        return name;
    }

    public String getRank(){
        return rank;
    }

    public String getInstruction(){
        return "Fasten your seat belts";
    }
}
