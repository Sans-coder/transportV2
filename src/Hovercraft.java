
public class Hovercraft extends Transport{

    public Hovercraft(){}
    public Hovercraft(String id){
        super(id);
    }

    public void drivingMethod(){
        super.drivingMethod();
        System.out.println("驾驶Hovercraft!!!");
    }

}