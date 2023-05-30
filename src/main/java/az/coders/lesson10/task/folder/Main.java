package az.coders.lesson10.task.folder;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        String folderPath = "baba/ata/ogul";
//      System.out.println(Arrays.toString(folderPath.split("/")));

        System.out.println(pathToFolder(folderPath));


    }

    public static Folder pathToFolder(String pathFolder){

        Folder folder = new Folder();

        String[] strs = pathFolder.split("/");

//        for (int i = 0;i<strs.length;i++){
//
//            return  ;
//
//        }


        return new Folder() ;
    }
}
