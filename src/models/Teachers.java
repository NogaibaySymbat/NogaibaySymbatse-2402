package models;

public class Teachers extends Person{
    String subject;
    int yearsOfExperience;
    int salary;

    public Teachers(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(double raise){
        salary += salary * (raise / 100);
    }

    @Override
    public String toString() {
        return super.toString() + "  " + subject + " " + yearsOfExperience + " " + salary;
    }
}
