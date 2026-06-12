package nl.pluralsight.stagepass.repository;

import nl.pluralsight.stagepass.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ConcertRepository extends JpaRepository<Concert, Long> {
    //Feature 2: searching for concert by artist ID.
    List<Concert> findByArtistId(Long artistId);

    //Feature 3: Finding Upcoming concerts based on the date.
    List<Concert> findByDateAfterOrderByDateAsc(LocalDate date);
}
