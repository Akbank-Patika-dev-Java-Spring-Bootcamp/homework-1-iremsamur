package hibernateproject.hibernateDemo.restApi;

import hibernateproject.hibernateDemo.Business.CountryMapper;
import hibernateproject.hibernateDemo.Business.ICountryService;
import hibernateproject.hibernateDemo.DTO.CountryDTO;
import hibernateproject.hibernateDemo.DTO.UpdateCountryDTO;
import hibernateproject.hibernateDemo.Entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryController {
    private ICountryService countryService;

    @Autowired
    public CountryController(ICountryService countryService) {
        this.countryService = countryService;

    }
    @GetMapping("/getAll")
    public ResponseEntity<List<CountryDTO>> get(){
        List<CountryDTO> countries = countryService.getAll();

        return ResponseEntity.ok(countries);

    }
    @GetMapping("/getById/{countryId}")
    public ResponseEntity<CountryDTO> getCountryById(@PathVariable int countryId){
        CountryDTO country = countryService.getCountryById(countryId);

        return ResponseEntity.ok(country);

    }
    @PostMapping("/addCountry")
    public ResponseEntity<List<CountryDTO>> addCountry(@RequestBody CountryDTO countryDTO){
        countryService.saveCountry(countryDTO);

        List<CountryDTO> countries = countryService.getAll();

        return ResponseEntity.ok(countries);


    }
    @PutMapping("/updatePresident/{countryId}")
    public ResponseEntity<List<CountryDTO>> updatePresident(@RequestBody UpdateCountryDTO countryDTO, @PathVariable int countryId){
        countryService.updatePresident(countryDTO,countryId);

        List<CountryDTO> countries = countryService.getAll();

        return ResponseEntity.ok(countries);

    }
    @DeleteMapping("/deleteCountry/{countryId}")
    public ResponseEntity<List<CountryDTO>> deleteCountry(@PathVariable int countryId){

        countryService.deleteCountry(countryId);
        List<CountryDTO> countries = countryService.getAll();

        return ResponseEntity.ok(countries);

    }


}
