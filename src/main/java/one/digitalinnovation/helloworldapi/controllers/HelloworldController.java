package one.digitalinnovation.helloworldapi.controllers;

import lombok.AllArgsConstructor;
import one.digitalinnovation.helloworldapi.dto.request.PersonDTO;
import one.digitalinnovation.helloworldapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.helloworldapi.exception.PersonNotFoundException;
import one.digitalinnovation.helloworldapi.services.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/Hello")
public class HelloworldController {
    @GetMapping
    public String getBook() {
        return "API Hello World";
    }
}


/*
@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class HelloworldController {

    private final HelloworldService helloworldService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody @Valid PersonDTO personDTO) {
        return helloworldService.create(personDTO);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        return helloworldService.findById(id);
    }

    @GetMapping
    public List<PersonDTO> listAll() {
        return helloworldService.listAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) throws PersonNotFoundException {
        return helloworldService.update(id, personDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) throws PersonNotFoundException {
        helloworldService.delete(id);
    }
}
*/