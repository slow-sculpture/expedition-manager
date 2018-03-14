package expedition.members;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;


    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Person(String firstName, String lastName, int age, String sex){
        this(firstName,lastName);
        this.age=age;
        this.sex=sex;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String getDescription(){
        return String.format("%s %s / age: %d / sex: %s"
                , getFirstName(),getLastName(),getAge(),getSex());
    }
}
