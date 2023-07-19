package covid_19.api.java;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class JavaApplication {


	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);
	}

    
 
	// public void createTable() {
    //     // Create the table explicitly
    //     yourRepository.save(new YourEntity());

    //     // or

    //     // Rely on Spring's auto-creation feature by inserting data
    //     yourRepository.findAll();
    // }


}
