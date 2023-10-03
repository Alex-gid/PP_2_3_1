package web.dao;

import web.model.User;

import java.util.List;

public interface Dao {
<<<<<<< HEAD
    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);
=======
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(int id);
    public void deleteUser(int id);
>>>>>>> 75f575af41158fa4561b84c239b46d76c2361bb4


}
