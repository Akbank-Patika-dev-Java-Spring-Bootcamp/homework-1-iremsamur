package hibernateproject.hibernateDemo.DataAccess;

import hibernateproject.hibernateDemo.Entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ICountryDal extends JpaRepository<Country, Integer> {
    //List<Country> getAll();
    //void add(Country country);
    //void update(Country country);
    //void delete(Country country);
}
