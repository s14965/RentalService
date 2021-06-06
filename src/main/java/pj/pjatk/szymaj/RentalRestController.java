package pj.pjatk.szymaj;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pj.pjatk.szymaj.movie.Movie;
import pj.pjatk.szymaj.movie.RentalService;

@RestController
@RequestMapping("/movies")
public class RentalRestController {

    private final RentalService rentalService;

    public RentalRestController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id) {
        return ResponseEntity.ok().body(rentalService.getMovieById(id));
    }

    @PutMapping("return/{id}")
    public ResponseEntity<Void> returnMovie(@PathVariable Long id){
        rentalService.returnMovie(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping("rent/{id}")
    public ResponseEntity<Void>  rentMovie(@PathVariable Long id){
        rentalService.rentMovie(id);
        return ResponseEntity.ok(null);
    }

}
