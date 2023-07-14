package az.coders.lesson2;

public class Lesson2 {

    private String name;

    public static void main(String[] args) {



        int i = 0;
        int j = 0;

        OUTER:
        while (i<5){
            i++;
            INNER:
            while (j<i){
                j++;
                System.out.println(i + "         " + j);
                if (j==4){

                }
            }
        }

    }


}

