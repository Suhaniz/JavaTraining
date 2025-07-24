package Day20;

public class JarMain {
     public static void main(String[] args) {
		Jar<String> cookieJar = new Jar<>();
		cookieJar.add("Choco chip cookies");
		System.out.println("The jar contains:"+cookieJar.get());
		
		Jar<Integer> numberJar = new Jar<>();
		numberJar.add(50);
		System.out.println("The Jar contains the number:"+numberJar.get());
	}
}
