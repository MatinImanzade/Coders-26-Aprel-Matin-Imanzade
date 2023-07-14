package az.coders.lesson14.test.crate;

public class Handling {
    public static void main(String[] args) {

        genericMethod_1("Salam");
        Crate<String> crate = ship("Matin");
        System.out.println(crate);
    }
    public static <T> void genericMethod_1(T t){
        System.out.println("t1= " + t);
    }

    public static <T> Crate<T> ship(T t){
        System.out.println("t_ship= " + t);
        return new Crate<T>(5);
    }

//    public static <T> Crate<T> shiping(T t) {
//        System.out.println("Shipping " + t);
//        return new Crate<T>();
//    }
}
