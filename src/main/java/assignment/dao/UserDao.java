package assignment.dao;

import assignment.entity.Users;

import java.util.List;

public interface UserDao {

    public List<Users> getUsers();
    public void saveUser(Users theUser);
    public Users getUser(int theId);
    public void deleteUser(int theId);
    public void lockUser(int theId);

}
