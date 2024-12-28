import javax.swing.*;
import java.util.ArrayList;

public class School{
    private ArrayList<Person> members;

    public School(){
        this.members = new ArrayList<>();
    }
    public void addMember(Person member) {
        this.members.add(member);
    }

    public void sortMembers(String m1, String m2){
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("School Members:\n");
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
}
