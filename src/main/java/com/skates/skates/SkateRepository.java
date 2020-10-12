package com.skates.skates;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public interface SkateRepository extends CrudRepository<Skates, Long> {
//    Map<Long, Skates> skatesList = new HashMap<>();
//    @Resource
//    TypeRepository typeRepo;
//
//    public SkateRepository(){
//        Skates moxis = new Skates(1L, "Moxis", "Orange Moxis with a shark on them. Perfect for outdoor skating along the lake!", "Outdoor Skates", "/images/orangesharks.jpg");
//        Skates vans = new Skates(2L, "Vans", "A classic skate shoe turned into a skate itself! Great for park skating and doing tricks!", "Outdoor Skates", "/images/babyvans.jpg");
//        Skates riedell = new Skates(3L, "Riedell", "A classic hand sewn leather skate. A must have for the derby track.", Category trackSkates,"/images/reidell.jpg");
//        Skates antiks = new Skates(4L, "Antiks", "A basic boot style skate. Good for speed on the derby track. A little bit of a heavier skate which makes agility and jumps difficult.", "Track Skates", "/images/antiks.jpg");
//        Skates moxisP = new Skates(5L, "Purple Moxis", "Purple Moxis with a spooky spider on them. A great outdoor skate. The dark color keeps it looking clean.", "Outdoor Skates", "/images/purplespider.jpg");
//        Skates antiksMens = new Skates(6L, "Antik Ar2", "Custom Antik Ar2 skates. The skates are incredibly light which makes doing apex jumps a breeze.", "Track Skates", "/images/osuantiks.jpg");
//        skatesList.put (moxis.getId(), moxis);
//        skatesList.put(vans.getId(), vans);
//        skatesList.put(riedell.getId(), riedell);
//        skatesList.put(antiks.getId(), antiks);
//        skatesList.put(moxisP.getId(), moxisP);
//        skatesList.put(antiksMens.getId(), antiksMens);
//    }
//
//    public SkateRepository(Skates... skatesToAdd) {
//        for (Skates skates : skatesToAdd) {
//            skatesList.put(skates.getId(), skates);
//        }
//    }
//
//    public Skates findOne(long id){
//        return skatesList.get(id);
//    }
//
//
//
//    public Collection<Skates> findAll() {
//        return skatesList.values();
//    }


}