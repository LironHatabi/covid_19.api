package covid_19.api.java;

import java.time.LocalDate;
import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import covid_19.api.java.Repository.YourRepository;
// import covid_19.api.java.Repository.RepositorySearch;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class firstController {

    @Autowired
    private YourRepository yourRepository;
    // private RepositorySearch RepositorySearch;
    // @Autowired
    // public firstController(YourRepository personRepository) {
    // this.yourRepository = personRepository;
    // }

    @GetMapping("/getAll")
    public List<Persons> getAllPersons() {

        // List<Persons> tables = yourRepository.findAllById("1")

        return yourRepository.findAll();
    }

    @PostMapping("/savedata")
    public void savedata(@RequestBody Person person) {
        // Persons entity = new Persons();

        Persons a = new Persons(person);
        yourRepository.save(a);
        // return person;
    }

    @GetMapping("/welcome/{id}")
    public String first_api(@PathVariable("id") String id) {

        String a = "liron " + id;
        return a;

    }

    @GetMapping("/city/{City}")
    public List<Persons> getWithCity(@PathVariable("City") String City) {

        return yourRepository.findBycity(City);

    }

      @GetMapping("/dob")
    public List<Persons> getWithdate(@RequestParam("first") LocalDate first,@RequestParam("second") LocalDate second) {

        return yourRepository.findBybirthDayBetween(first,second);

        // return first + second;

    }
    // @PostMapping("/savedata")
    // public String insert(@RequestBody Person myObject) {

    // yourRepository.findAll();
    // return myObject.firstName;

    // }
    // yourRepository.save(new Tutorial());

    // // or

    // // Rely on Spring's auto-creation feature by inserting data

}