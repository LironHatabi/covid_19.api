package covid_19.api.java;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import covid_19.api.java.Repository.YourRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class firstController {

    @Autowired
    private YourRepository yourRepository;


    @GetMapping("/getAll")
    public List<Persons> getAllPersons() {


        return yourRepository.findAll();
    }

    @PostMapping("/savedata")
    public void savedata(@RequestBody Person person) {

        Persons a = new Persons(person);
        yourRepository.save(a);
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


    }
  

}