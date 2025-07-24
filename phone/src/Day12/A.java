package Day12;

public class A {
    public int pub = 1;
    protected int pro = 2;
    int def = 3; // default
    private int pri = 4;

    public void show() {
        System.out.println("public: " + pub);
        System.out.println("protected: " + pro);
        System.out.println("default: " + def);
        System.out.println("private: " + pri);
    }
}
/* It's C Class in Package 11; */