package lesson1.japanese;

public class japaneseEmployee {
    public static void main(String[] args) {
        // Mitsuo Baso     120_000    4
        // Akura Kurosava   100_000   12

        JapaneseEmployee misuo = new JapaneseEmployee("Mitsuo", "Baso",
                120_000, 4);
        JapaneseEmployee akira = new JapaneseEmployee("Akira", "Kurosava",
                100_000, 12);


        System.out.println(misuo.getFirstName() + " " + misuo.calculateSalary());
        System.out.println(akira.getFirstName() + " " + akira.calculateSalary());
        misuo.hello();
        akira.hello();
    }


    public void hello() {
        // если работник работает больше 10 лет преветствовать его
        // Добрый день имя фамилия
        // если меньше то
        // Привет имя
        public void hello ()

        if (years >= 10)
            System.out.println("Добрый день " + firstName + " " + lastName);
        else
            System.out.println("Привет " + firstName);


    }


    public class JapaneseEmployee {
        private String firstName;
        private String lastName;
        private double baseSalary;
        private int years;


        private static int delta = 10_000;

        public int calculateSalary() {
            return (int) baseSalary + delta * years;
        }

        public JapaneseEmployee(String firstName, String lastName, double baseSalary, int years) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.baseSalary = baseSalary;
            this.years = years;
        }

        public String getFirstName() {
            return firstName;
        }
    }


