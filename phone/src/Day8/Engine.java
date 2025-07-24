package Day8;

public class Engine {
       String engineNumber;
       String type;
       
       public Engine(String engineNumber,String type) {
    	   this.engineNumber=engineNumber;
    	   this.type=type;
       }
       public void displayEngine(){
    	   System.out.println("Engine Number is: "+engineNumber);
    	   System.out.println("Engine Type is: "+type);
       }
}
