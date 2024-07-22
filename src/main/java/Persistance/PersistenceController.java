
package Persistance;

import Persistance.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.User;


public class PersistenceController {
    
    ScheduleJpaController hourJPA = new ScheduleJpaController();
    DentistJpaController dentisJPA = new DentistJpaController();
    PatientJpaController patienJPA = new PatientJpaController();
    PersonJpaController persJPA = new PersonJpaController();
    GurdianJpaController gurdJPA = new GurdianJpaController();
    SecretaryJpaController secreJPA = new SecretaryJpaController();
    ShiftJpaController shifJPA = new ShiftJpaController();
    UserJpaController userJPA = new UserJpaController();

    public PersistenceController() {
    }

    public void createUser(User usu) {
        userJPA.create(usu);
    }

    public List<User> getUsers() {
        return userJPA.findUserEntities();
    }

    public void eliminateUser(int id) {
        try {
            userJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public User getUser(int id) {
        return userJPA.findUser(id);
    }

    public void editUser(User user) {
        try {
            userJPA.edit(user);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
