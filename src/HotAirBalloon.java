


public class HotAirBalloon extends Transport{


    public HotAirBalloon(){}
    public HotAirBalloon(String id){
        super(id);
    }

    public void drivingMethod(){
        super.drivingMethod();
        System.out.println("驾驶HotAirBalloon!!");
    }
}