package web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import MovieRepository.MovieStoreRepository;
import entity.Movie;

@RestController
public class MovieController {
	@Autowired
	private MovieStoreRepository moviestorerepository;
	
	@RequestMapping(value="/movie", method = RequestMethod.POST)
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
		MovieStoreRepository.save(movie);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	@RequestMapping(value="/movie/name/{name}", method = RequestMethod.GET)
	public ResponseEntity<List<Movie>> findMovieByName(@PathVariable String name) {
		if(name == null || name.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		List<Movie> books = MovieStoreRepository.findByname(name);
		return new ResponseEntity<>(movie, HttpStatus.OK);
		
	}
	@RequestMapping(value="/movie/genre/{genre}", method = RequestMethod.GET)
	public ResponseEntity<List<Movie>> findMovie(@PathVariable String genre){
		return new ResponseEntity<>(moviestorerepository.findbygenre(genre), HttpStatus.OK);
	}
}



