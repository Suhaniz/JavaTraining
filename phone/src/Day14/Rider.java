package Day14;

public class Rider {
	String name;

    Rider(String name) {
        this.name = name;
    }

    void requestRide() {
        System.out.println(name + " requested a ride.");
    }
}