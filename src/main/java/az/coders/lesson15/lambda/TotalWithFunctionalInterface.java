package az.coders.lesson15.lambda;
@FunctionalInterface
public interface TotalWithFunctionalInterface {
    int total(int a,int b);

}

class Main {
    public static void main(String[] args) {
        TotalWithFunctionalInterface totalWithFunctionalInterface = new TotalWithFunctionalInterface() {
            @Override
            public int total(int a, int b) {
                return a+b;
            }
        };

//        TotalWithFunctionalInterface totalWithFunctionalInterface1 = (a,b) -> a+b;
//        int result = totalWithFunctionalInterface1.total(5,3);
//        System.out.println(result);
    }

//    @Override
//    public int total(int a, int b) {
//        return 0;
//    }
}
