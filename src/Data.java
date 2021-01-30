
public class Data 
{
    private String billdate;
    private int accnumber;
    private String name;
    private String address;
    
    private double arrears;
    private double previousmeter;
    private double currentmeter;
    private double totalunit;
    private double currentcharge;
    private double totalbill;


    public Data(String billdate,int accnumber, String name,  String address, double arrears, double previousmeter, double currentmeter, double totalunit, double currentcharge, double totalbill) {
       
        this.billdate = billdate;
        this.accnumber = accnumber;
        this.name = name;
        this.address = address;
        this.arrears = arrears;
        this.previousmeter = previousmeter;
        this.currentmeter = currentmeter;
        this.totalunit = totalunit;
        this.currentcharge = currentcharge;
        this.totalbill = totalbill;
    }

    public String getbilldate() {
        return billdate;
    }
    
    
    public int getaccnumber(){
    return accnumber;
    }

    public String getname() {
        return name;
    }


    public String getaddress() {
        return address;
    }

    public double getarrears() {
        return arrears;
    }

    public double getpreviousmeter() {
        return previousmeter;
    }

    public double getcurrentmeter() {
        return currentmeter;
    }

    public double gettotalunit() {
        return totalunit;
    }

    public double getcurrentcharge() {
        return currentcharge;
    }
    
    public double gettotalbill() {
        return totalbill;
    }
    
    
    
    
}
