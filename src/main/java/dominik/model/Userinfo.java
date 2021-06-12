package dominik.model;

public class Userinfo {
    private String firstname;
    private String secondname;
    private String username;
    private String password;
    private String email;

    public Userinfo(String firstname, String secondname, String username, String password, String email) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}