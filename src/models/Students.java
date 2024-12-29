package models;
import java.util.ArrayList;

public class Students extends Person {
    static int idCount = 1000;
    int idStudent;
    ArrayList<Integer> grades = new ArrayList<>();

    public Students (String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.idStudent = idCount;
        idCount++;
    }

    public void grades(int grade) {
        this.grades.add(grade);
    }

    public double sumGPA(){
        if (grades.size() == 0){
            return 0;
        };
        int sum = 0;
        for (int grade : grades) {
           sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + " Student ID " + idStudent;
    }
}
