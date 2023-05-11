package hibernateproject.hibernateDemo.Business;

import hibernateproject.hibernateDemo.DTO.CountryDTO;
import hibernateproject.hibernateDemo.DTO.UpdateCountryDTO;
import hibernateproject.hibernateDemo.DataAccess.ICountryDal;
import hibernateproject.hibernateDemo.Entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryManager implements ICountryService{
    private ICountryDal countryDal;

    @Autowired
    public CountryManager(ICountryDal countryDal) {
        this.countryDal = countryDal;

    }
    @Override
    public List<CountryDTO> getAll() {
       // return this.countryDal.findAll();
        List<Country> countryValues = this.countryDal.findAll();
        List<CountryDTO> countries = CountryMapper.INSTANCE.toDtoList(countryValues);
        return countries;
    }

    @Override
    public CountryDTO getCountryById(int id) {
        CountryDTO countryDTO = CountryMapper.INSTANCE.map(this.countryDal.findById(id).orElse(null));
        return countryDTO;
    }

    @Override
    public void saveCountry(CountryDTO countryDTO) {
        Country country = CountryMapper.INSTANCE.map(countryDTO);
        this.countryDal.save(country);
    }

    @Override
    public void updatePresident(UpdateCountryDTO countryDTO, int countryId) {

        Country country = CountryMapper.INSTANCE.mapForUpdate(countryDTO);
        Country updatedCountry
                = countryDal.findById(countryId)
                .get();

        updatedCountry.setPresident(country.getPresident());

        this.countryDal.save(updatedCountry);

    }

    @Override
    public void deleteCountry(int id) {
        this.countryDal.deleteById(id);

    }
}
