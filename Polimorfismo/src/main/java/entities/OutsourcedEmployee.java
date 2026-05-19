package entities;

public class OutsourcedEmployee extends Employee {
    private Double AdditionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Integer valuePerHour,double additionalCharge) {
        super(name,hours,valuePerHour);
        AdditionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return AdditionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        AdditionalCharge = additionalCharge;
    }

    @Override
    public payment(){
        return super.payment() + AdditionalCharge;
    }
}
