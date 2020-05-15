

public class Airship extends Transport {

    public Airship(){}
    public Airship(String id){
        super(id);
    }

    public void drivingMethod(){
        super.drivingMethod();
        System.out.println("驾驶Airship!!");
    }
}