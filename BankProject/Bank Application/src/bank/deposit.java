package bank;

import java.util.Scanner;
class deposit{
    int amt= 0;
    
    public int userInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to be deposited: ");
        amt =sc.nextInt();
        if(amt<=0)
        {
            invalid_transaction depositnegativeError = new invalid_transaction("Invalid Deposit Amount");
            System.out.println(depositnegativeError.getMessage());
            userInput();
           
        }
        else
        {   
            return amt;
        }
        return amt;
        
    }
}


