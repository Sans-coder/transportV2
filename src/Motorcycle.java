


public class Motorcycle extends Transport {

    public Motorcycle(){}
    public Motorcycle(String id){
        super(id);
    }

    public void drivingMethod(){
        super.drivingMethod();
        System.out.println("驾驶MOtorcycle!!");
    }
}