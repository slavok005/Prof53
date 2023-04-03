package lessen2.lesson2;

public class LoanTester {
    public static void main(String[] args) {
    // если работник ленивый он одобрит кредит если доход заемщика больше 20_000
    // если работник не ленивый но добрый то он одобрит кредит если доход больше 25_000 и
    //      возраст меньше 60
    // если работник не ленивый и злой то одобрит кредит если доход больше 28_000
    //      и клиенту меньше 50 лет

    LoanTaker misha = new LoanTaker("Misha", 21_000, 73);
    LoanIssuer dina = new LoanIssuer("Dina", true, false);
        System.out.println(dina.toIssue(misha));
    // foma не ленивый и злой
    // alex 26_000 30
    }

}
