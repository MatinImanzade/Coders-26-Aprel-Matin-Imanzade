package az.coders.lesson5.task;

import az.coders.lesson5.task.login.Login;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        User user = new User();
        user.setName("Matin");
        user.setSurname("Imanzade");
        user.setAge("21");
        login.loginGenerate(user);

    }




}


