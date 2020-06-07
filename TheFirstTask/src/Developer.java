public class Developer {
    public static void main(String[] args) {
        User tester = new User(7,"Developer");
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
}
class User {
    private long id;
    private Vacancy vacancy;

    String getVacancy() {
        return vacancy.getVacancy();
    }

    public User(long id,String vacancyMy) {
        this.id = id;
        this.vacancy = new Vacancy(vacancyMy);
    }

    long getId() {
        return id;
    }

}
class Vacancy {

    private String vacancy;

    public Vacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    String getVacancy() {
        return vacancy;
    }
}
