package az.coders.lesson9.task.loginAndSingup;

public class User {
    private String email;
    private String password;

    private static final String regexPassword =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    String regexEmail = "^(.+)@(.+)$";
    public User(String email, String password) {
        if (email.matches(regexEmail)){
            this.email = email;
        }
        if (password.matches(regexPassword)){
            this.password = password;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
