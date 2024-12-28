public class Teacher extends Person{
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teacher(){
    }
    public Teacher(String name, String surname, int age, String gender, String subject, int yearsOfExperience , int salary){
        super(name,surname,age,gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }
    public void giveRaise(double percentage){
        if(yearsOfExperience > 10){
            salary += salary * percentage / 100;
        }
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + " my salary: " + salary;
    }
}
