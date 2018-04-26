package mrsapi.packagee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
    private String id;
    private String title;
    private int votes;
    private int rating;
    private int year;
    private String genre;
    private String language;
    private String plot;
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public int getVotes(){
        return votes;
    }
    
    public void setVotes(int votes){
        this.votes = votes;
    } 
    
    public int getRating(){
        return rating;
    }
    
    public void setRating(int rating){
        this.rating = rating;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public void setGenre(String genre){
        this.genre = genre;
    }
    
    public String getLanguage(){
        return language;
    }
    
    public void setLanguage(String language){
        this.language = language;
    }
    
    public String getPlot(){
        return plot;
    }
    
    public void setPlot(String plot){
        this.plot = plot;
    }
}
