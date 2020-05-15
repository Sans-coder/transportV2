

public class Ship extends Transport{


    public Ship(){}
    public Ship(String id){
        super(id);
    }

    public void drivingMethod(){
        super.drivingMethod();
        System.out.println("驾驶Ship!!");
    }
}