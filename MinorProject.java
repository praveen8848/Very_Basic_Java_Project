import java.util.Scanner;

public class MinorProject {
    public static void main(String[] args) {
       ATM obj = new ATM();
       obj.checkpin();  
        
    }
}

class ATM{
    float Balance;
    public void checkpin(){
        System.out.println("Welcome...");
        System.out.println();
        System.out.print("Enter your ATM  Pin : ");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        System.out.println("Press 1 to continue with Your Pin:   " + pin);
        int confirm = sc.nextInt();
        if(confirm == 1){
            if( pin >= 1000 && pin <= 9999){
                Menu();
            }
            else{
                System.out.println("Your Pin is Wrong.");
                System.out.println();
                System.out.println("Please Enter a valid Pin.");
                checkpin();
            }
        }

    }

    public void checkbalance(){
        System.out.println("Here is your Balance.");
        System.out.println("Balance:  " + Balance);
        System.out.println();
        Menu();
    }
    public void withdrawmoney(){
        System.out.print("Enter the Amount you want to withdraw: ");
        Scanner scd = new Scanner(System.in);
        float amount = scd.nextFloat();
        if(amount>Balance){
            System.out.println("Invalid amount.");
            System.out.println();
            Menu();
    
        }
        else{
            Balance = Balance-amount;
            System.out.println("Amount Withdrawn.");
            System.out.println();
            checkbalance();
        }
    }
    public void depositMoney(){
        System.out.println("Enter the Amount you want to deposit.");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat(); 
        Balance = Balance + amount;
        System.out.println();
        Menu();
    }


    public void Menu(){
        System.out.println("1. Check Balance.");
        System.out.println("2. Withdraw Money.");
        System.out.println("3. Deposit money.");
        System.out.println("4. Exit.");
        
        System.out.println("Please Enter number between 1 to 4 to perform operations mentioned above.");
        Scanner sc = new  Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1 -> checkbalance();
            case 2 -> withdrawmoney();
            case 3 -> depositMoney();
            default -> {
                break;
            }
        }
    }
}
