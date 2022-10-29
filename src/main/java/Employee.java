public class Employee {
    //the class contains data about the employee

    private String nameAndLastName;
    private int age;
    private String email;
    private String employment;
    private String telephoneNumber;

    public Employee(String nameAndLastName, int age, String email, String employment, String telephoneNumber) {
        this.nameAndLastName = nameAndLastName;
        this.age = age;
        this.email = email;
        this.employment = employment;
        this.telephoneNumber = telephoneNumber;
    }

    public String getNameAndLastName() {
        return nameAndLastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getEmployment() {
        return employment;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }


}
