package entities;

public class Employee {
    private String name;
    private Integer hours;
    private Integer valuePerHour;

    public Employee() {
    }

    public Employee(String name, Integer valuePerHour, Integer hours) {
        this.name = name;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Integer valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double payment(){
        return hours * valuePerHour;
    }
}
