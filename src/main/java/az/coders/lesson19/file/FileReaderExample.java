package az.coders.lesson19.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\My Workspace\\My Applications\\Coders-26-Aprel\\src\\main\\java\\az\\coders\\lesson19\\file\\text.txt");
        FileReader fileReader = new FileReader(file);

        int cha = 0;
        while ((cha = fileReader.read()) != -1) {
            System.out.print((char) cha);
        }

    }


}


class FileChangeFolderDirectory {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\My Workspace\\My Applications\\Coders-26-Aprel\\src\\main\\java\\az\\coders\\lesson19\\file\\text.txt");
        String oldFolderPath = file.getParent();


        String newFolderPath = "C:\\My Workspace\\My Applications\\Coders-26-Aprel\\src\\main\\java\\az\\coders\\lesson19\\newFolder";
        File newFolderFile = new File(newFolderPath);

        File file1 = new File(newFolderFile,file.getName());
        System.out.println(file1.getPath());
    }
}