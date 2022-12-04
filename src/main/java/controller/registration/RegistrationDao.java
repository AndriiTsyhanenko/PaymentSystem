package controller.registration;
/*
 *
 * @author Andrii Tsyhanenko
 *
 */
import controller.dao.UserDAO;
import model.bank.User;

public class RegistrationDao {
    private final UserDAO userDAO = new UserDAO();

    public int registerUser(User user) {
        return userDAO.registerNewUser(user);
    }

    public User getNameAndID(User user) {
        return userDAO.getUser(user.getUserLogin());
    }
}
