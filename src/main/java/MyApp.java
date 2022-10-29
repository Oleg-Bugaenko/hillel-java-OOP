import packege.one.SameName;

public class MyApp {
    public static void main(String[] args) {
        //creation of an employee class object
        Employee employee = new Employee("Alex Bauman", 28, "alex_bauman@jmail.com", "manager", "+38(095)0946789");


        //work with classes that have the same name and are distributed in different packages
        SameName sameNameOne = new SameName();
        packege.two.SameName sameNameTwo = new packege.two.SameName();

        //working with the method Car
        Car car = new Car();
        car.start();


    }
}
