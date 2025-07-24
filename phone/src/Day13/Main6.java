package Day13;

public class Main6 {
     public static void main(String[] args) {
		Mobile M = new IPhone();
		M.call();
		M.sendMessage();
		
		Mobile O = new OPPO();
		O.call();
		O.sendMessage();
	}
}
