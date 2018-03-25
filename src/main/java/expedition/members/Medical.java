package expedition.members;

public class Medical extends Person{
    private String specialization;


    public Medical() {
    }

    public Medical(String firstName, String lastName, int age, String sex) {
        super(firstName, lastName, age, sex);
    }
}
