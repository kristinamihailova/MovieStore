package MovieRepository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entity.MovieStore;


@Repository
public interface MovieStoreRepositor extends CrudRepository<MovieStore, Long> {

}

