/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author RATHRAVI
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account[] obj = {new MortgageAccount("Tom",100000),
        new CheckingAccount("Jon",200),
        new CheckingAccount("terry",1000)
        };
        for(int i=0;i<obj.length;i++){
        System.out.println(obj[i].deposit(1000));
        System.out.println(obj[i].withdraw(500));
        System.out.println(obj[i].withdraw(1000));
        System.out.println(obj[i].withdraw(2000));
        }
    }
    
}
abstract class Account {
    private long balance;
    private String holderName;
    Account(String name){
        this.holderName = name;
    }
    public void finalTransaction(String message, long amount){
        System.out.println(holderName + ": " + message + " " + amount);
        balance += amount;
        System.out.println(balance);
    }
    public long getBalance(){
        return balance;
    }
    abstract boolean deposit(long amount);
    abstract boolean withdraw(long amount);
//    public Account(String holderName){
//        this.holderName = holderName;
//    }
}

class MortgageAccount extends Account {
//    String Name;
    Long borrow;
    public boolean deposit(long amount){
        finalTransaction("Mortgage Payment",amount);
        return true;
    }
    public boolean withdraw(long amount){
        return false;
    }
    public MortgageAccount(String hName, long borrowedAmt){
        
        super(hName);
        borrow = borrowedAmt;
        //log????
    }
}

class CheckingAccount extends Account {
    String Name;
    Long overdraft;
    public boolean deposit(long amount){
        finalTransaction("Checking Deposit",amount);
        return true;
    }
    public boolean withdraw(long amount){
        long bal = getBalance();
        if(bal+overdraft >= amount){
            finalTransaction("Checking Withdrawal",-1*amount);
            return true;
        }else{
            return false;
        }
        
    }
    public CheckingAccount(String hName, long OverdraftAmt){
        super(hName);
        overdraft = OverdraftAmt;
    }
}