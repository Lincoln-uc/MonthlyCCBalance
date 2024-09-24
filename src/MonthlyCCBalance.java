public class MonthlyCCBalance {
    public static void main(String[] args) {
        System.out.println("Your Credit card balance before interest was $5,000");

        double preInterest = 5000;
        double interestRate = 1.17;
        double interestCost1m = preInterest * interestRate;
        double interestCost2m = interestCost1m * interestRate;

        System.out.println("Balance after one month is " + interestCost1m);
        System.out.println("Balance after two months is " + interestCost2m);
    }
}