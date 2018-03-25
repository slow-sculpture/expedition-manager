package expedition.members;

public class Sherpa extends Person {
    private double stamina;
    private int capacity;
    private boolean yakOwner;
    private int yakCapacity;

    public Sherpa() {
    }

    public Sherpa(String firstName, String lastName, int age, String sex) {
        super(firstName, lastName, age, sex);
    }

    public double getStamina() {
        return stamina;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isYakOwner() {
        return yakOwner;
    }

    public void setYakOwner(boolean yakOwner) {
        this.yakOwner = yakOwner;
    }

    public int getYakCapacity() {
        return yakCapacity;
    }

    public void setYakCapacity(int yakCapacity) {
        this.yakCapacity = yakCapacity;
    }
}
