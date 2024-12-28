public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(){

    }
    public Person(String name, String surname, int age, boolean gender){
        this();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public String findGender(boolean gender){
        if(gender) return "Male";
        else  return "Female";
    }

    @Override
    public String toString() {
        return "Hi, I am " + name + " " + surname + " a " + age + " year-old " + findGender(gender);
    }
}
