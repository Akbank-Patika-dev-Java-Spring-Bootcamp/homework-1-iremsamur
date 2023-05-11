package hibernateproject.hibernateDemo.DataAccess;

import hibernateproject.hibernateDemo.Entities.Country;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateCountryDal{
    private EntityManager entityManager;
    @Autowired
    public HibernateCountryDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    /*
    @Override
    @Transactional
    public List<Country> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Country> countries = session.createQuery("from Country",Country.class).getResultList();
        return countries;
    }

     */


}
