public class Person {
    private String name;
    private String surname;
    private int age;
    private String gender;

    public Person(){

    }
    public Person(String name, String surname, int age, String gender){
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

    public String getGender() {
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

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Hi, I am " + name + " " + surname + " a " + age + " year-old " + gender;
    }
}
