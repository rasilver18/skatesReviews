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
        Category trackSkates = new Category("Track Skates", "/images/legs.jpg",
                "These skates are ideal for Roller Derby. Generally these skates have a harder wheel and a flatter sole. This allows for greater stability and agility on the track");
        Category parkSkates = new Category ("Park Skates", "/images/rainbowpark.jpg",
                "Wear these skates when going on the skate park. These skates can be equipped with slides on the bottom to allow for rail work. Often a softer wheel to allow for outdoor terrain. Some trail skates can also be used as park skates");
        Category trailSkates = new Category ("Trail Skates", "/images/banana.jpg",
                "These skates are perfect for outdoor skating on any pavement. Most outdoor skates have a slight heel on them which shifts your weight forward, making jumps and other tricks easier. ");
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