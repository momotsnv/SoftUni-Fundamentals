package ObjectAndClasses.Students;

public class Student {

    private String firstName, lastName;
    private double grade;


    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return this.firstName; // better to use this. just to clarify
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
    }
}
