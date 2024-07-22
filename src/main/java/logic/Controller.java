
package logic;

import Persistance.PersistenceController;
import java.util.ArrayList;
import java.util.List;


public class Controller {
    
    PersistenceController persisControl = new PersistenceController();
    
    public void createUser(String userName, String passw, String role) {
        
        User usu = new User();
        usu.setUser_name(userName);
        usu.setPassword(passw);
        usu.setRole(role);
        
        persisControl.createUser(usu);
    }

    public List<User> getUsers() {
        return persisControl.getUsers();
    }

    public void eliminateUser(int id) {
        persisControl.eliminateUser(id);
    }

    public User getUser(int id) {
        return persisControl.getUser(id);
    }

    public void editUser(User user) {
        persisControl.editUser(user);
    }
}
