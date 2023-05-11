package hibernateproject.hibernateDemo.Business;

import hibernateproject.hibernateDemo.DTO.CountryDTO;
import hibernateproject.hibernateDemo.DTO.UpdateCountryDTO;
import hibernateproject.hibernateDemo.Entities.Country;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);
    Country map(CountryDTO countryDTO);
    CountryDTO map(Country country);

    Country mapForUpdate(UpdateCountryDTO countryDTO);

    List<CountryDTO> toDtoList(List<Country> country);
    List<Country> toEntityList(List<CountryDTO> country);
}
