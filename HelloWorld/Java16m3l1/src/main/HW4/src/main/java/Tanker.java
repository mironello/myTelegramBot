import java.util.Objects;

class Tanker{
    private String serialNumber;

    public String getSerialNumber(){
        return serialNumber;
    }

    public void setSerialNumber( String serialNumber){
        this.serialNumber = serialNumber;
    }
    protected String getFuelType(){
        return "A500";
    }

    public void refuel(int amount){
        System.out.println("Add " + amount + " of " + getFuelType() +
                ", tanker serial number is " + getSerialNumber());
    }



//    @Override
//    public int hashCode(){
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
//        result = prime * result + id; result = prime * result +
//                ((lastName == null) ? 0 : lastName.hashCode()); return result;
//    }
}

