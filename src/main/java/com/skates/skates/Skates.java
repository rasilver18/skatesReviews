package com.skates.skates;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Skates {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    private Category category;
    private String image;

    public Skates() {

    }

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }
    public Category getCategory(){
        return category;
    }


    public String getImage() {
        return image;
    }

    public Skates(long id, String name, String description, Category category, String image) {
        this.id=id;
        this.name=name;
        this.description=description;
        this.image=image;
        this.category=category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skates skates = (Skates) o;
        return Objects.equals(id, skates.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}