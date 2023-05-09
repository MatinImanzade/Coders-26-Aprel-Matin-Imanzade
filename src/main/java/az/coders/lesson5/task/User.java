package az.coders.lesson5.task;

public class User {
    private String name;
    private String surname;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()<=3 && ){
            System.out.println("");
        }else {
            this.name = name;
        }

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.length()<=3 && ){
            System.out.println("");
        }else {
            this.surname = surname;
        }

    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        if (age.length()>=18 && age.length()<=100){
            this.age = age;
        }else{
            System.out.println("Yas uygun deyil");
        }

    }
}
