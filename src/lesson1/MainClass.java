package lesson1;

import lesson1.Competitors.*;
import lesson1.Obstacles.*;

public class MainClass {
    public static void main(String[] args) {
        Course course = new Course(new Obstacle[]{new Cross(400), new Wall(2), new Water(1)});
        Team team = new Team("DREAM TEAM", new Competitor[]{new Human("Боб"), new Human("Джек"), new Cat("Барсик"), new Dog("Бобик")});
        team.showInfo();
        course.doIt(team);
        team.showResults();
    }
}
