package pj.pjatk.szymaj;
import io.swagger.annotations.*;
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

    @ApiOperation(value = "Get movie for given ID",
            response = Movie.class,
            notes = "This method will return movie for given id or http 404 if not found")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Movie not found"),
            @ApiResponse(code = 500, message = "Movie not found")
    })

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(
            @ApiParam(name = "id",
                    type = "long",
                    value = "1",
                    example = "1",
                    required = true,
                    defaultValue = "1")
            @PathVariable Long id) {
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
