package one.digitalinnovation.helloworldapi.dto.mapper;

import one.digitalinnovation.helloworldapi.dto.request.PersonDTO;
import one.digitalinnovation.helloworldapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
