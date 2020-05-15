

public class Automobile extends Transport{

    public Automobile(){}
    public Automobile(String id){
        super(id);
    }

    public void drivingMethod(){
        super.drivingMethod();
        System.out.println("驾驶Automobile!!");
    }
}