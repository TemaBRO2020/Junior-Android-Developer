public class Developer {
    public static void main(String[] args) {
        User tester = new User(7,"Developer");
        System.out.println(tester.getId());
        //System.out.println(tester.getVacancy());
        System.out.println(tester.getVacancy());
    }}
class User {
    private long id;
    private Vacancy vacancy;
    String getVacancy(String A) {
        return vacancy.getVacancy(A);
    }

        public User(long id,String vacancyMy) {
            this.id = id;
            this.vacancy = new Vacancy();
            this.vacancy.getVacancy(vacancyMy);
        }

        long getId() {
            return id;
        }
    }
    class Vacancy {
        String getVacancy(String A) {
            return A;
        }
    }

