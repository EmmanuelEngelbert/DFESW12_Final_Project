package com.qa.animes.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animes {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id; 
	
	private String animeName; 
	private int yearOfProduction; 
	private String animeGenre; 
	private String animeStudio; 
	
		public Animes() { 
			super();
		}

		public Animes(Long id, String animeName, int yearOfProduction, String animeGenre, String animeStudio) {
			super();
			this.id = id;
			this.animeName = animeName;
			this.yearOfProduction = yearOfProduction;
			this.animeGenre = animeGenre;
			this.animeStudio = animeStudio;
		}

		public Animes(String animeName, int yearOfProduction, String animeGenre, String animeStudio) {
			super();
			this.animeName = animeName;
			this.yearOfProduction = yearOfProduction;
			this.animeGenre = animeGenre;
			this.animeStudio = animeStudio;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getAnimeName() {
			return animeName;
		}

		public void setAnimeName(String animeName) {
			this.animeName = animeName;
		}

		public int getYearOfProduction() {
			return yearOfProduction;
		}

		public void setYearOfProduction(int yearOfProduction) {
			this.yearOfProduction = yearOfProduction;
		}

		public String getAnimeGenre() {
			return animeGenre;
		}

		public void setAnimeGenre(String animeGenre) {
			this.animeGenre = animeGenre;
		}

		public String getAnimeStudio() {
			return animeStudio;
		}

		public void setAnimeStudio(String animeStudio) {
			this.animeStudio = animeStudio;
		}

		@Override
		public int hashCode() {
			return Objects.hash(animeGenre, animeName, animeStudio, id, yearOfProduction);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Animes other = (Animes) obj;
			return Objects.equals(animeGenre, other.animeGenre) && Objects.equals(animeName, other.animeName)
					&& Objects.equals(animeStudio, other.animeStudio) && Objects.equals(id, other.id)
					&& yearOfProduction == other.yearOfProduction;
		}
		
		
		
}
