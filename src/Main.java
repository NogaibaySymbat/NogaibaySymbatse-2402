import models.Person;
import models.School;
import models.Students;
import models.Teachers;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        Students students1 = new Students("Harry", "Pother", 21,true);
        Students students2 = new Students("Ron", "Qeasley", 20,true);
        Students students3 = new Students("Hermione", "Granger", 19,false);
        Students students4 = new Students("Luna", "Lovegood", 20,false);
        Students students5 = new Students("Draco", "Malfoy", 19,true);

        students1.grades(78);
        students1.grades(89);
        students1.grades(99);
        students1.grades(51);

        students2.grades(78);
        students2.grades(89);
        students2.grades(75);
        students2.grades(63);
        students2.grades(82);

        students3.grades(100);
        students3.grades(99);
        students3.grades(95);
        students3.grades(98);
        students3.grades(100);
        students3.grades(96);
        students3.grades(97);

        students4.grades(87);
        students4.grades(67);
        students4.grades(79);
        students4.grades(96);
        students4.grades(58);
        students4.grades(83);

        students5.grades(21);
        students5.grades(45);
        students5.grades(0);
        students5.grades(9);
        students5.grades(51);
        students5.grades(43);

        school.addCharacters(students1);
        school.addCharacters(students2);
        school.addCharacters(students3);
        school.addCharacters(students4);
        school.addCharacters(students5);

        Teachers teachers1 = new Teachers("Severus", "Snape", 51,true, "Math", 7, 800000);
        Teachers teachers2 = new Teachers("Albus", "Dumbledore", 71,true, "Philosophy", 25, 1500000);
        Teachers teachers3 = new Teachers("Minerva", "McGonagall", 62,false, "Sociology", 17, 1100000);
        Teachers teachers4 = new Teachers("Bellatrix", "Lestrange", 35,false, "Programming", 3, 570000);
        Teachers teachers5 = new Teachers("Sirius", "Black", 49,true, "Physics", 9, 750000);

        teachers2.giveRaise(10);
        teachers3.giveRaise(10);

        school.addCharacters(teachers1);
        school.addCharacters(teachers2);
        school.addCharacters(teachers3);
        school.addCharacters(teachers4);
        school.addCharacters(teachers5);

        System.out.println("All School Members:");
        System.out.println(school.toString());

        System.out.println("GPA of Harry: " + students1.sumGPA());
        System.out.println("GPA of Ron: " + students2.sumGPA());
        System.out.println("GPA of Hermione: " + students3.sumGPA());
        System.out.println("GPA of Luna: " + students4.sumGPA());
        System.out.println("GPA of Malfoy: " + students5.sumGPA());
    }
}