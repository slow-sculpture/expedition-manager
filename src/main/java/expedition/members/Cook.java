package expedition.members;

public class Cook extends Person {
    private String cuisine;
    private String specialty;



    public Cook(String firstName, String lastName, int age, String sex, String cuisine, String specialty) {
        super(firstName, lastName, age, sex);
        this.cuisine = cuisine;
        this.specialty = specialty;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String getDescription(){
        return String.format("%s / cuisine: %s / chef's specialty: %s"
                , super.getDescription(), getCuisine(), getSpecialty());
    }
}
