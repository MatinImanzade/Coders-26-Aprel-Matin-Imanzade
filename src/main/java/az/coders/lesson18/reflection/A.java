package az.coders.lesson18.reflection;

public class A {
    private String name;

    public A(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
