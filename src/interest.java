public class interest {
    void ShowInterest() {
        double amount;
        double interest;
        amount = 1200.00;
        System.out.println("Amount:" + amount);

        interest = 3.0;
        amount = amount * (100 + interest) / 100;
        System.out.println("After 2 years your interest is :" + amount);

    }

    public static void main(String[] args) {
        (new interest()).ShowInterest();
    }
}
