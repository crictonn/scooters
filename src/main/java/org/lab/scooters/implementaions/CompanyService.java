package org.lab.scooters.implementaions;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import org.lab.scooters.dao.CompanyDao;
import org.lab.scooters.models.Company;

import java.util.List;

public class CompanyService implements CompanyDao {
    @PersistenceContext
    private EntityManager entityManager = Persistence.createEntityManagerFactory("default").createEntityManager();


    @Override
    public void saveCompany(Company company) {
        entityManager.getTransaction().begin();
        entityManager.persist(company);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateCompany(Company company) {
        entityManager.detach(company);
        entityManager.getTransaction().begin();
        entityManager.persist(company);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteCompany(Company company) {
        entityManager.getTransaction().begin();
        entityManager.remove(company);
        entityManager.getTransaction().commit();
    }

    @Override
    public Company getCompanyByID(Long id) {
        return entityManager.getReference(Company.class, id);
    }

    @Override
    public List<Company> getAllCompanies() {
        return entityManager.createQuery("SELECT a from Company a", Company.class).getResultList();
    }
}
