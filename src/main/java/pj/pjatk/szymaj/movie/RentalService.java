package pj.pjatk.szymaj.movie;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RentalService {

    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovieById(Long id) {
        return restTemplate.getForEntity("http://localhost:8080/movies/" + id, Movie.class).getBody();
    }

    public Movie returnMovie(Long id) {
        return restTemplate.getForEntity("http://localhost:8080/movies/makeAvailable/" + id, Movie.class).getBody();
    }
}
