package assignment.dao;

import assignment.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    @Override
    public List<Users> getUsers() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Users> theQuery =currentSession.createQuery("from Users order by fullName", Users.class);
        List<Users> users = theQuery.getResultList();
        return users;
    }

    @Override
    public void saveUser(Users theUser) {

    }

    @Override
    public Users getUser(int theId) {
        return null;
    }

    @Override
    public void deleteUser(int theId) {

    }

    @Override
    public void lockUser(int theId) {

    }
}
