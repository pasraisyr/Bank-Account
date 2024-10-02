public class MethodBank {
    

    
    private double balance;

   
    public MethodBank( double balance) {
       
        this.balance = balance;
    }

    
    public void deposit(double amount) {
     
        balance += amount;
    }

    
    public void withdraw(double amount) {
       
        if (balance >= amount) {
            
            balance -= amount;
        } else {
            
            System.out.println("Insufficient balance");
        }
    }

    
    public double getBalance() {
        
        return balance;
    }
}
