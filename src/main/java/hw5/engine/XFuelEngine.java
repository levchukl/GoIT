package hw5.engine;

public class XFuelEngine extends Engine{


    protected String serialNumber;


    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getFuelType(){
        return  "XFuel";
    }
}
