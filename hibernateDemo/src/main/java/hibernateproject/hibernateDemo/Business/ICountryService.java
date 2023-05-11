package hibernateproject.hibernateDemo.Business;

import hibernateproject.hibernateDemo.DTO.CountryDTO;
import hibernateproject.hibernateDemo.DTO.UpdateCountryDTO;
import hibernateproject.hibernateDemo.Entities.Country;

import java.util.List;


public interface ICountryService {
    List<CountryDTO> getAll();
    void saveCountry(CountryDTO countrydto);
    void updatePresident(UpdateCountryDTO countryDTO, int countryId);
    void deleteCountry(int id);
    CountryDTO getCountryById(int id);
}
