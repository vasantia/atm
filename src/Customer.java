import java.util.Scanner;

/**
 * Created by vasantia on 6/15/16.
 */
public class Customer {
    private String name;
    private String option;
    private double balance;
    private double withdrawalAmount;
    private Scanner scanner = new Scanner(System.in);

//    public Customer(String name, double balance){
//        this.name = name;
//        this.option = option;
//        this.balance = balance;
//        this.withdrawalAmount = withdrawalAmount;
//    }

    public String getName(){
        return this.name;
    }
    public String getOption(){
        return this.option;
    }
    public double getBalance() {
        return this.balance;
    }
    public double getWithdrawalAmount(){
        return this.withdrawalAmount;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setOption(String option){
        this.option = option;
    }
    public void setWithdrawalAmount(double withdrawalAmount){
        this.withdrawalAmount = withdrawalAmount;
    }
    public void chooseName() throws Exception{
        String name = null;

        System.out.println("What is your name?");

        name = scanner.nextLine();
        //while (name == null)
            //continue;
            //name = scanner.nextLine();
    }
    public void selectOption() throws Exception {
        String option = null;

        while (option == null) {
            System.out.println("Hello, " + name + "." + " Select option: [Balance, Withdrawal or Cancel]");
            option = scanner.nextLine();

            if (option.equalsIgnoreCase("Balance")) {
                System.out.println("Your balance is $" + balance);
            }
            else if (option.equalsIgnoreCase("Cancel")){
                System.out.println("Thank you and please come again.");
            }
            else if (option.equalsIgnoreCase("Withdrawal")) {
                System.out.println("How much would you like to withdraw?");
                    withdrawalAmount = scanner.nextDouble();
                        if(withdrawalAmount>100) {
                            throw new Exception("Cannot withdraw more than $100.");
                        }
                        else {
                            System.out.println("Please take your money.");
                        }
            }
            else {
                option = null;
            }
        }

        this.option = option;
    }
}