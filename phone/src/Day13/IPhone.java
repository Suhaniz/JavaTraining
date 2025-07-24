package Day13;

public class IPhone extends Mobile {
	
	@Override
	void call() {
		System.out.println("The IPhone is Called");
	}
	@Override
	void sendMessage() {
		System.out.println("The IPhone sends the Messages");
		
	}
}