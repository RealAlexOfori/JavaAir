public class Pilot {

    private String name;
    private String rank;
    private String licenceNo;

    public Pilot(String name, String rank, String licenceNo){
        this.name = name;
        this.rank = rank;
        this.licenceNo = licenceNo;
    }

    public String getName(){
        return name;
    }

    public String getRank(){
        return rank;
    }

    public String getLicenceNo(){
        return licenceNo;
    }

    public String getCanFly(){
        return "I believe I can fly";
    }

}
