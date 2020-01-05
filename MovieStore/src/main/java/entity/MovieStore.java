package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MovieStore {
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private String name;
	private double continuance;
	private String nameproducer;
	private String genre;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="movie_genre")
	private MovieStore MovieStore;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getContinuance() {
		return continuance;
	}

	public void setContinuance(double continuance) {
		this.continuance = continuance;
	}

	public String getNameproducer() {
		return nameproducer;
	}

	public void setNameproducer(String nameproducer) {
		this.nameproducer = nameproducer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public MovieStore getMovieStore() {
		return MovieStore;
	}

	public void setMovieStore(MovieStore movieStore) {
		MovieStore = movieStore;
	}

	
	
}
