package pj.pjatk.szymaj;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pj.pjatk.szymaj.movie.Movie;

@RestController
public class RentalRestController {

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id) {
        return
    }
}
