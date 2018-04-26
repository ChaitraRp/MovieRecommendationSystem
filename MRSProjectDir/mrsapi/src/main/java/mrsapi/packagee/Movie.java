package mrsapi.packagee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
    private String id;
    private String title;
    private Integer votes;
    private Integer rating;
    private String yyear;
    private String genre;
    private String language;
    private String plot;
    
    public Movie() {
    	super();
    }
    
    public Movie(String id, String plot, String title, String votes, String rating, String genre, String year, String language) {
    	this.id = id;
    	this.plot = plot;
    	this.title = title;
    	if (votes == "") {
    		this.votes = 0;
    	} else {
    		this.votes = Integer.valueOf(votes);
    	}
    	
    	if (rating == "") {
    		this.rating = 0;
    	} else {
    		this.rating = Integer.valueOf(rating);
    	}
    	this.genre = genre;
    	this.yyear = year;
    	this.language = language;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getYyear() {
		return yyear;
	}

	public void setYyear(String year) {
		this.yyear = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}
    
    
}
