package org.lab.scooters.implementaions;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import org.lab.scooters.dao.ScooterDao;
import org.lab.scooters.models.Scooter;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ScooterService implements ScooterDao {
    @PersistenceContext
    private EntityManager entityManager = Persistence.createEntityManagerFactory("default").createEntityManager();

    public Scooter parseScooter(HttpServletRequest request){
        return Scooter.builder().build();
    }

    @Override
    public void saveScooter(Scooter scooter) {
        entityManager.getTransaction().begin();
        entityManager.persist(scooter);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateScooter(Scooter scooter) {
        entityManager.detach(scooter);
        entityManager.getTransaction().begin();
        entityManager.persist(scooter);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteScooter(Scooter scooter) {
        entityManager.getTransaction().begin();
        entityManager.remove(scooter);
        entityManager.getTransaction().commit();
    }

    @Override
    public Scooter getScooterByID(Long id) {
        return entityManager.getReference(Scooter.class, id);
    }

    @Override
    public List<Scooter> getAllScooters() {
        return entityManager.createQuery("SELECT a from Scooter a", Scooter.class).getResultList();
    }
}
