package com.skates.skates;

public class Skates {
    private Long id;
    private String name;
    private String description;
    private String category;
    private String image;
    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String getCategory(){
        return category;
    }

    public String getImage() {
        return image;
    }

    public Skates(long id, String name, String description, String category, String image) {
        this.id=id;
        this.name=name;
        this.description=description;
        this.category=category;
        this.image=image;
    }


}