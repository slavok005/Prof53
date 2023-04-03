public class LoanIssuer {
    // кредитный офицер
    private String name;
    private boolean isLazy; // ленивый
    private boolean isKind; // добрый

public loanIssuer(String name, boolean islazy, boolean isKind ) {
    this
}
if(!isLazy && isKind && taker.getYearlyIncome() > 25_000 && taker.getAge() < 60)
            return true;
    public boolean toIssue(LoanTaker taker)
    {
        // если работник ленивый он одобрит кредит если доход заемщика больше 20_000
        if (isLazy && taker.getYearlyIncome() > 20_000)
            return true;
        // если работник не ленивый но добрый то он одобрит кредит если доход больше 25_000 и
        //      возраст меньше 60
        if(!isLazy && isKind && taker.getYearlyIncome() > 25_000 && taker.getAge() < 60)
            return true;
        // если работник не ленивый и злой то одобрит кредит если доход больше 28_000
        //      и клиенту меньше 50 лет

}
