package web.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.Dao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService{


    @Autowired
    private Dao dao;
    @Override
    @Transactional
    public List<User> getAllUsers() {return dao.getAllUsers();}

    @Override
    @Transactional
    public void saveUser(User user) {dao.saveUser(user);}

    @Override
    @Transactional
    public User getUser(int id) {return dao.getUser(id);}

    @Override
    @Transactional
    public void deleteUser(int id) {dao.deleteUser(id);}


}
