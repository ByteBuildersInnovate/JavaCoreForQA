package homework1;

public class RunClass {

    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("Русский", 200.5f);
        person[1] = new Person("Немец", 226.305f);
        person[2] = new Person("Француз", 210.5f);
        person[3] = new Person("Чукча", 226.305f);
        Team team = new Team("DreamTeam", person);

        Course course = new Course(3.86f, 180.25f, 42.195f);
        String result = course.doIt(team);
        System.out.println(result);
    }
}
