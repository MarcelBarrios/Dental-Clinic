
package logic;


public class User {
    private int id_user;
    private String user_name;
    private String password;
    private String role;

    public User() {
    }

    public User(int id_user, String user_name, String password, String role) {
        this.id_user = id_user;
        this.user_name = user_name;
        this.password = password;
        this.role = role;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
}