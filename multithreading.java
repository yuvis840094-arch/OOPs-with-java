// public class multithreading {
//     public static void main(String[] args) {
//         Counter ctr = new Counter();
//         Mythread obj = new Mythread(ctr);
//         Thread thread1= new Thread(obj);
//         Thread thread2= new Thread(obj);
//         Thread thread3= new Thread(obj);
//         Thread thread4= new Thread(obj); 
        
//         thread1.start();
//         thread2.start();
//         thread3.start();
//         thread4.start();
//         try{
//             thread1.join();
//             thread2.join();
//             thread3.join();
//             thread4.join();
//         }
//         catch(InterruptedException e){
//             System.out.println(e);

//         }
//         System.out.println(ctr.count);
        
//     }
// }
// class Counter{
//     int count = 0;
//     synchronized void increment(){ //synchrronised
//         count++;
//     }
// }
// class Mythread implements Runnable{
//     Counter ct;

//     Mythread(Counter ctr){
//         this.ct = ctr;
//     }

//     public void run(){
//         for(int i=0; i<100;i++){

//             ct.increment();
//         }
//     }

// }


public class multithreading {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        WithdrawThread wd = new WithdrawThread(obj, 700);
        DepositThread dp = new DepositThread(obj, 500);

        Thread thread1 = new Thread(wd);
        Thread thread2 = new Thread(dp);

        thread1.start();
        thread2.start();

        System.out.println("Final balance: " + obj.balance);
    }
}
class BankAccount{
    int balance = 500;
    synchronized void withdraw(int amount){  //synchronized is used to avoid race condition 
        while (balance < amount){
            System.out.println("Insufficient balance. Current balance: " + balance);
            try {
                wait(); //waits for deposit to be made
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
    }
    synchronized void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }
}

class WithdrawThread implements Runnable{
    BankAccount account;
    int amount;

    WithdrawThread(BankAccount account, int amount){ // parameterized constructor
        this.account = account;
        this.amount = amount;
    }

    public void run(){
        account.withdraw(amount);
    }
}

class DepositThread implements Runnable{
    BankAccount ba;
    int amount;

    DepositThread(BankAccount obj, int amount){
        this.ba = obj;
        this.amount = amount;
    }

    public void run(){
        ba.deposit(amount);
    }
}
