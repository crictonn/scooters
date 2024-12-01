package org.lab.scooters.implementaions;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import org.lab.scooters.dao.UserDao;
import org.lab.scooters.models.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class UserService implements UserDao {
    @PersistenceContext
    private EntityManager entityManager = Persistence.createEntityManagerFactory("default").createEntityManager();

    public User parseUser(HttpServletRequest request){
        return User.builder()
                .firstName(request.getParameter("firstName"))
                .lastName(request.getParameter("lastName"))
                .username(request.getParameter("username"))
                .password(request.getParameter("password"))
                .build();
    }

    @Override
    public void saveUser(User user) {
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        } catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void updateUser(User user) {
        entityManager.detach(user);
        entityManager.getTransaction().begin();
        entityManager.merge(user);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteUser(User user) {
        entityManager.getTransaction().begin();
        entityManager.remove(user);
        entityManager.getTransaction().commit();
    }

    @Override
    public User getUserByID(Long id) {
        return entityManager.getReference(User.class, id);
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT a from User a", User.class).getResultList();
    }
}
