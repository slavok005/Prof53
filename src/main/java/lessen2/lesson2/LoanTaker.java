package lessen2.lesson2;

public class LoanTaker {
    // кредитополучатель
    private String name;
    private double yearlyIncome; // готовой доход
    private int age; // полных лет

    public LoanTaker(String name, double yearlyIncome, int age) {
        this.name = name;
        this.yearlyIncome = yearlyIncome;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }
