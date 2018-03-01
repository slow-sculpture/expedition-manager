package expedition.members;

public class Climber extends Person {
    private int highestPoint;
    private double stamina;
    private boolean oxygeneUser;

    public Climber(String firstName, String lastName, int age, String sex) {
        super(firstName, lastName, age, sex);
    }

    public Climber(String firstName, String lastName, int age, String sex, int highestPoint, double conditionPoints, boolean oxygeneUser){
        super(firstName,lastName,age,sex);
        this.highestPoint=highestPoint;
        this.stamina =conditionPoints;
        this.oxygeneUser=oxygeneUser;
    }

    public int getHighestPoint() {
        return highestPoint;
    }

    public void setHighestPoint(int highestPoint) {
        this.highestPoint = highestPoint;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public boolean isOxygeneUser() {
        return oxygeneUser;
    }

    public void setOxygeneUser(boolean oxygeneUser) {
        this.oxygeneUser = oxygeneUser;
    }

    @Override
    public String toString(){
        return String.format("%s / %d / %f / %b"
                , super.toString(),getHighestPoint(),getStamina(),isOxygeneUser());
    }
}
