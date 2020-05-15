


public class Submarine extends Transport{

    public Submarine(){}
    public Submarine(String id){
        super(id);
    }

    public void drivingMethod(){
        super.drivingMethod();
        System.out.println("驾驶Submarine!!");
    }
}