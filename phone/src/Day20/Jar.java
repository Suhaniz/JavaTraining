package Day20;

public class Jar<T> {
     private T item;
     
     public void add(T item) {
    	 this.item=item;
     }
     
     public T get() {
    	 return item;
     }
}
