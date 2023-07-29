package covid_19.api.java.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import covid_19.api.java.Persons;
public interface CovidRepository extends JpaRepository<Persons, Long> {
    List<Persons> findBybirthDayBetween(LocalDate startDate, LocalDate endDate);

    List<Persons> findBycity(String aaa);

}
