import java.util.*;
public class ATM_MACHINE{
    // ATM MACHINE
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        user_bank_accounts UBA = new user_bank_accounts();
        int x = 1;
        while(x>0)
        {
            System.out.println("\n");
            System.out.println("click 1 for withdraw ");
            System.out.println("click 2 for Deposit ");
            System.out.println("click 3 for Check balance");
            System.out.println("click 4 for Exit ");
            System.out.println("Select any one of the case that you want to perform");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    UBA.withdrawing();
                    break;
                case 2:
                    UBA.depositing();
                    break;
                case 3:
                    UBA.checkBalance();
                    break;
                default:
                System.out.println("Thanks for using the ATM(Automatic teller machine)");
                    x = 0;
                    break;
            }
            
        }
        
    }
}

interface ATM{
    // this function is used for withdraw the money
     void withdrawing();
    // this function is used for deposit he money / amount
     void depositing();
    // this function is used for check the account balance / amount
     void checkBalance();

}

class user_bank_accounts extends ATM_MACHINE implements ATM{
    Scanner sc = new Scanner(System.in);
    int account_balance = 100000; // current account balanc
    
    public void withdrawing(){
        // limit for withdraw the money in one time
        int max_withdraw = 20000;
        System.out.println("Enter amount for withdraw");
        int amount = sc.nextInt();
        // Withdraw amount should be less than or equal to max_withdraw 
        if((amount > 0) && (amount <= 20000))
        {
            account_balance = account_balance - amount;
            // account balance after withdraw the money should be greater or equal to zero
            if(account_balance >= 0)
            {
                System.out.println("Please collect the money.." + "\n");
            }
            else{
                System.out.println(" Transcation fails due to Insufficient Balance " + "\n");
            }
        }
        // Because you can not withdraw the money more than 20000
        else{
            System.out.println("Transcation fails due to limit exceeded!.." + "\n");
        }
    }
    
     public void depositing(){
        System.out.println("Enter amount to be deposited");
        int deposit_amount = sc.nextInt();
        account_balance += deposit_amount;
        System.out.println(" Your money has been successfuly deposited" + "\n");
    }
     
     public void checkBalance(){
        // Total Balance
        System.out.println("Account Balance : " + account_balance + "\n");
    }
    
}