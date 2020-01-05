package MovieRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.Movie;
import entity.MovieStore;



@Repository
public interface MovieStoreRepository extends CrudRepository<MovieStore, Long> {
	
	List<Movie> findbyname(String name);
	List<Movie> findbygenre(String genre);
	List<Movie> findbyprice(double price);
	List<Movie> findbyameproducer(String ameproducer);
	
}
