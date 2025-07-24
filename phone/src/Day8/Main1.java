package Day8;

//Main.java
public class Main1 {
 public static void main(String[] args) {
     // Create user
     User ram = new User("Ram");

     // Create ATMs at different locations
     ATM atm1 = new ATM("Pune");
     ATM atm2 = new ATM("Mumbai");
     ATM atm3 = new ATM("Delhi");

     // Perform withdrawals using association
     atm1.withdraw(ram, 10000);
     atm2.withdraw(ram, 25000);
     atm3.withdraw(ram, 47000);
 }
}

