

public class Aircraft extends Transport{

    public Aircraft(){}
    public Aircraft(String id){
        super(id);
    }

    public void drivingMethod(){
        super.drivingMethod();
        System.out.println("驾驶Aircraft!!");
    }
}