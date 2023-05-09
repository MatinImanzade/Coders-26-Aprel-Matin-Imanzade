package az.coders.lesson5;

import java.util.Random;

public class MathLib {

    public static void main(String[] args) {
        Math.pow(2,5);

        Random random = new Random();

        int i = random.nextInt(10)+20;
        System.out.println(i);

        new MathLib().cem(1,2);
    }

    void cem(int a,int b){
        System.out.println(a+b);
    }

    static String cem1 (int a,int b){
        return a + "" + b;
    }

    //public
    //protected
    //default
    //private

//        public static int random ( int low, int high ){
//
//            Random r = new Random;
//
//            int result = r.nextInt( high – low ) + low;
//
//            return result;
//
//        }
    }

