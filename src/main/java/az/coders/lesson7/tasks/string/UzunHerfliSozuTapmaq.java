package az.coders.lesson7.tasks.string;

import java.util.Arrays;

public class UzunHerfliSozuTapmaq {



    public static void main(String[] args) {
        String sentences = "Salam necesesen mm asdjfhjsdhfjsdjfsjdfjsdf adf sdf fffffffffffffffffffffffffffffffffffffffffffff";
        String[] words = sentences.split(" ");

        String maxWordsofSentences = null ;

        System.out.println(sentences);
        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------");


        for (int i = 0;i<words.length;i++){
            for (int j = 0;j<i;j++){
                if (words[i].length()>words[j].length()){
                    maxWordsofSentences = words[i];
                }
            }

        }
        System.out.println(maxWordsofSentences);
    }
}
