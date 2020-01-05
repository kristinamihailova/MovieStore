package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


public class Movie {

	@GeneratedValue(strategy=GenerationType.AUTO)

		private String name;
		private double continuance;
		private String nameproducer;
		private String genre;
		private double price;
		
		@OneToMany
		private List<Movie> movies;

		
		
		public Movie(String name, double continuance, String nameproducer, String genre, double price) {
			super();
			this.name = name;
			this.continuance = continuance;
			this.nameproducer = nameproducer;
			this.genre = genre;
			this.price = price;
		}
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
		public List<Movie> getMovies() {
			return movies;
		}

		public void setMovies(List<Movie> Movies) {
			this.movies = movies;
		}
		
		
	}






