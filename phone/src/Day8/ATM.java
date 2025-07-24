package Day8;

//ATM.java
public class ATM {
 String location;

 // Constructor
 public ATM(String location) {
     this.location = location;
 }

 // Method to simulate withdrawal
 public void withdraw(User user, double amount) {
     System.out.println(user.name + " withdraws " + (int)amount + " rs from ATM " + location);
 }
}
