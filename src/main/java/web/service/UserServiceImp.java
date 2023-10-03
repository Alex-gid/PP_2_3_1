package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.Dao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private final Dao dao;
    @Autowired
    public UserServiceImp(Dao dao) {
        this.dao = dao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {return dao.getAllUsers();}

    @Override
    @Transactional(readOnly = true)
    public void saveUser(User user) {dao.saveUser(user);}

    @Override
    @Transactional(readOnly = true)
    public User getUser(int id) {return dao.getUser(id);}

    @Override
    @Transactional
    public void deleteUser(int id) {dao.deleteUser(id);}


}
