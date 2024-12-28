import java.util.ArrayList;

public class Student extends Person{
    private static int id_gen = 1;
    private int studentID;
    private ArrayList<Integer> grades;

    public Student() {
        this.grades = new ArrayList<>();
        this.studentID = id_gen++;
    }

    private Student(String name, String surname, int age, boolean gender, int studentID, ArrayList<Integer> grades){
        super(name,surname,age,gender);
        this.grades = grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double calculateGpa(){
        int res = 0;
        for(int grade : grades){
            res += grade;
        }
        return (double) res / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + " my gpa: " + calculateGpa();
    }
}
