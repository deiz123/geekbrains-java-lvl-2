package lesson1.Competitors;

public class Team {
    String name;

    public Competitor[] getCompetitors() {
        return competitors;
    }

    Competitor[] competitors;

    public Team(String name, Competitor[] competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public void showResults() {
        System.out.println("***********************************************************");
        System.out.println("Results:");
        System.out.println("=========================================");
        for (Competitor c : competitors) {
            c.showResult();
            System.out.println("=========================================");
        }
        System.out.println("***********************************************************");
    }

    public void showInfo() {
        System.out.println("***********************************************************");
        System.out.println("Название команды: " + name);
        System.out.println("=========================================");
        for (Competitor c : competitors) {
            System.out.println("Участник: " + c.getType());
            System.out.println("Имя: " + c.getName());
            System.out.println("Максимальная беговая дистанция: " + c.getMaxRunDistance());
            System.out.println("Максимальная высота прыжка: " + String.valueOf(c.getMaxJumpHeight()));
            System.out.println("Максимальная плавательная дистанция: " + String.valueOf(c.getMaxSwimDistance()));
            System.out.println("=========================================");
        }
        System.out.println("***********************************************************");
    }
}
