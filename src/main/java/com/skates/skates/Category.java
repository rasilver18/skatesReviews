package com.skates.skates;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String skateType;
    private String typeImage;
    private String description;
    @OneToMany(mappedBy = "category")
    private Collection<Skates> skates;

    public Long getId(){
        return id;
    }
    public String getSkateType(){
        return skateType;
    }
    public String getTypeImage(){return typeImage;}
    public String getDescription(){return description;}

    public Collection<Skates> getSkates(){
        return skates;
    }
    public Category(){

    }
    public Category(String skateType, String typeImage, String description){
        this.skateType=skateType;
        this.typeImage= typeImage;
        this.description=description;
//        this.skates = new HashSet<>(Arrays.asList(skates));
    }
//    for(Skates skate : skates){
//        skates.setCategory(this);
//    }
//public SkateRepository(Skates... skatesToAdd) {
//        for (Skates skates : skatesToAdd) {
//            skatesList.put(skates.getId(), skates);
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
