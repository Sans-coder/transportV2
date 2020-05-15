

public class Bicycle extends Transport{

    public Bicycle(){}
    public Bicycle(String id){
        super(id);
    }

    public void drivingMethod(){
        super.drivingMethod();
        System.out.println("驾驶Bicycle!!");
    }
}