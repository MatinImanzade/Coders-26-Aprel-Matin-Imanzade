package az.coders.lesson18.reflection;

public class B {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> c = A.class;
        System.out.println(c.getDeclaredConstructors());
    }

}
