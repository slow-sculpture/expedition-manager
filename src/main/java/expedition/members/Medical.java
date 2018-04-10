package expedition.members;

public class Medical extends Person{
    private String specialization;


    public Medical(String firstName, String lastName, int age, String sex, String specialization) {
        super(firstName, lastName, age, sex);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String getDescription(){
        return String.format("%s / specialization: %s"
                , super.getDescription(), getSpecialization());
    }
}
