package az.coders.lesson10.task.folder;

public class Folder {
    private String name;
    private Folder subFolder;

    public Folder(String name, Folder subFolder) {
        this.name = name;
        this.subFolder = subFolder;
    }

    public Folder(String name){
        this.name = name;
    }

    public Folder() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Folder getSubFolder() {
        return subFolder;
    }

    public void setSubFolder(Folder subFolder) {
        this.subFolder = subFolder;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", subFolder=" + subFolder +
                '}';
    }


}
