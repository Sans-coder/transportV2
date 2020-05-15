import java.sql.Date;

public class Transport {
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public Transport(){}
    public Transport(String id){this.id = id;}

    public void drivingMethod(){
        System.out.print("交通工具：");
    }
}