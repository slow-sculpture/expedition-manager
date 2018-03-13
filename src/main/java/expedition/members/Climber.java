package expedition.members;

public class Climber extends Person {
    private int heightAchievement;
    private double stamina;
    private boolean oxygeneUser;
    private double overallRating;

    public Climber(String firstName, String lastName, int age, String sex) {
        super(firstName, lastName, age, sex);
    }

    public Climber(String firstName, String lastName, int age, String sex
            , int heightAchievement, double stamina, boolean oxygeneUser
            , double overallRating) {
        super(firstName, lastName, age, sex);
        this.heightAchievement = heightAchievement;
        this.stamina = stamina;
        this.oxygeneUser = oxygeneUser;
        this.overallRating = overallRating;
    }

    public int getHeightAchievement() {
        return heightAchievement;
    }

    public void setHeightAchievement(int heightAchievement) {
        this.heightAchievement = heightAchievement;
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

    public double getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(double overallRating) {
        this.overallRating = overallRating;
    }

    @Override
    public String toString(){
        return String.format("%s / %d / %f / %b / %f"
                , super.toString(), getHeightAchievement(), getStamina()
                , isOxygeneUser(), getOverallRating());
    }
}
