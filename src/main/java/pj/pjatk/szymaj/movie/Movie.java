package pj.pjatk.szymaj.movie;

import io.swagger.annotations.ApiModelProperty;

public class Movie {

    @ApiModelProperty(notes = "This is id of the movie", required = true, value = "some value", example = "64")
    private Long id;
    @ApiModelProperty(notes = "This is title of the movie", required = true, value = "some value", example = "movie name")
    private String title;
    @ApiModelProperty(notes = "This is category of the movie", required = true, value = "some value", example = "Horror")
    private Category category;
    @ApiModelProperty(notes = "This is availablity of the movie", required = true, value = "some value", example = "available")
    private boolean isavailable;

    public Movie(){}
    public Movie(String n, Category c){
        id = Long.valueOf(0);
        title = n;
        category = c;
        isavailable = false;
    }
    public Movie(Long i, String n, Category c){
        id = i;
        title = n;
        category = c;
        isavailable = false;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long i){
        id = i;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String s) {
        title = s;
    }
    public Category getCategory() {
        return category;
    }
    public  void setCategory(Category c){
        category = c;
    }
    public boolean isAvailable() {
        return isavailable;
    }
    public void setAvailable(boolean available) {
        isavailable = available;
    }
}