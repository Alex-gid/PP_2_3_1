package web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;
@Repository
public class DaoImp implements Dao{

<<<<<<< HEAD
    private SessionFactory sessionFactory;
    @Autowired
    public DaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

=======
    @Autowired
    private SessionFactory sessionFactory;
>>>>>>> 75f575af41158fa4561b84c239b46d76c2361bb4
    @Override
    public List<User> getAllUsers() {
        return sessionFactory.getCurrentSession().createQuery("from User", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public User getUser(int id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public void deleteUser(int id) {
        sessionFactory.getCurrentSession()
                .createQuery("delete from User where id =:userId")
                .setParameter("userId", id)
                .executeUpdate();
    }


}
