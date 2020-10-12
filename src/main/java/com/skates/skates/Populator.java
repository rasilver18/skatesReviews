package com.skates.skates;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {
    @Resource
    private TypeRepository typeRepo;
    @Resource
    private SkateRepository skateRepo;

    @Override
    public void run(String... args) throws Exception {
        Category trackSkates = new Category("Track Skates");
        Category parkSkates = new Category ("Park Skates");
        Category trailSkates = new Category ("Trail Skates");
        typeRepo.save(trackSkates);
        typeRepo.save(parkSkates);
        typeRepo.save(trailSkates);

        Skates moxis = new Skates(1L, "Moxis", "Orange Moxis with a shark on them. Perfect for outdoor skating along the lake!", trailSkates, "/images/orangesharks.jpg");
        Skates vans = new Skates(2L, "Vans", "A classic skate shoe turned into a skate itself! Great for park skating and doing tricks!", parkSkates, "/images/babyvans.jpg");
        Skates riedell = new Skates(3L, "Riedell", "A classic hand sewn leather skate. A must have for the derby track.", trackSkates,"/images/reidell.jpg");
        Skates antiks = new Skates(4L, "Antiks", "A basic boot style skate. Good for speed on the derby track. A little bit of a heavier skate which makes agility and jumps difficult.", trackSkates, "/images/antiks.jpg");
        Skates moxisP = new Skates(5L, "Purple Moxis", "Purple Moxis with a spooky spider on them. A great outdoor skate. The dark color keeps it looking clean.", trailSkates, "/images/purplespider.jpg");
        Skates antiksMens = new Skates(6L, "Antik Ar2", "Custom Antik Ar2 skates. The skates are incredibly light which makes doing apex jumps a breeze.", trackSkates, "/images/osuantiks.jpg");
        skateRepo.save(moxis);
        skateRepo.save(vans);
        skateRepo.save(riedell);
        skateRepo.save(antiks);
        skateRepo.save(moxisP);
        skateRepo.save(antiksMens);
//
//        skatesList.put (moxis.getId(), moxis);
//        skatesList.put(vans.getId(), vans);
//        skatesList.put(riedell.getId(), riedell);
//        skatesList.put(antiks.getId(), antiks);
//        skatesList.put(moxisP.getId(), moxisP);
//        skatesList.put(antiksMens.getId(), antiksMens);
    }
}