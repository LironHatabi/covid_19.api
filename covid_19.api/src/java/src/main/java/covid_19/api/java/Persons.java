package covid_19.api.java;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Persons")

public class Persons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String FirstName;

    @Column(name = "last_name")
    private String LastName;

    @Column(name = "birthDay")
    private LocalDate birthDay;

    @Column(name = "address")
    private String Address;

    @Column(name = "city")
    private String city;

    @Column(name = "zip_code")
    private String ZipCode;

    @Column(name = "land_line")
    private String LandLine;

    @Column(name = "cellular_phone")
    private String Phone;

    @Column(name = "infected_by_covid")
    private boolean isInfected;

    @Column(name = "previous_conditions")
    private String Conditions;

    // Constructors, getters, and setters
public Persons(){}


    public Persons(Person person) {
      this.FirstName =  person.FirstName;

     this.LastName = person.LastName;

    this.birthDay = person.BirthDay;

     this.Address=person.Address;

     this.city = person.City;

     this.ZipCode =person.ZipCode;

     this.LandLine=person.LandLine;

     this.Phone = person.Phone;

     this.isInfected =person.isInfected;

     this.Conditions= person.Conditions;
    }

public String  getfirstName(){
return FirstName;
}
public String  getLastName(){
return this.LastName;
}
public LocalDate  getbirthDay(){
return this.birthDay;
}
public String  getAddress(){
return this.Address;
}
public String  getcity(){
return this.city;
}
public String  getZipCode(){
return this.ZipCode;
}
public String  getLandLine(){
return this.LandLine;
}
public String  getPhone(){
return this.Phone;
}
public boolean  getisInfected(){
return this.isInfected;
}
public String  getConditions(){
return this.Conditions;
}



}


