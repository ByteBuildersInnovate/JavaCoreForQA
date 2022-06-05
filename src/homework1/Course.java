package homework1;

public class Course {
    String result;
    private float swimming;
    private float bikeRide;
    private float run;

    public Course(float swimming, float bikeRide, float run) {
        this.run = run;
        this.swimming = swimming;
        this.bikeRide = bikeRide;
    }

    public String doIt(Team team) {
        result = "Команда: " + team.getName() + " " + '\n' + "Ready: 1, 2, 3 ... Go!" + '\n';
        for (Person person: team.getPeoples()) {
            result += "Участник: " + person.getName() + " " + '\n';
            float value = person.getOvercameAnObstacle();
            testSwimming(value);
            testBikeRider(value);
            testRun(value);
        }
        return result;
    }
    private void testSwimming(float value) {
        if (value > swimming) result += "Плавание завершил" + '\n';
    }
    private void testBikeRider(float value) {
        if(value > bikeRide + swimming) result += "Велозаезд завершил" + '\n';
    }
    private void testRun(float value) {
        if(value == swimming + bikeRide + run) result += "Бег завершил." + '\n' + "Финишировал!!!" + '\n';
    }
}
