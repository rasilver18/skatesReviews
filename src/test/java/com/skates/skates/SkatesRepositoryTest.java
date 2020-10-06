package com.skates.skates;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SkatesRepositoryTest {
    private SkateRepository underTest;
    Skates skatesOne = new Skates(1L, "Moxis", "Orange Moxis with a shark at them. Perfect for outdoor skating along the lake!", "Outdoor Skates", "/images/orangesharks.jpg");
    Skates skatesTwo = new Skates(2L, "Vans", "A classic skate shoe turned into a skate itself! Great for park skating and doing tricks!", "Outdoor Skates", "/images/babyvans.jpg");

    @Test
    public void shouldLocatePairOfSkates() {

        underTest = new SkateRepository(skatesOne);
        Skates foundSkatePair = underTest.findOne(1L);
        assertEquals(skatesOne, foundSkatePair);

    }

    @Test
    public void shouldLocateTwoPairsOfSkates() {
        underTest = new SkateRepository(skatesOne, skatesTwo);
        Skates foundSkatePair = underTest.findOne(1L);
        Collection<Skates> foundSkates = underTest.findAll();
        assertThat(foundSkates).contains(skatesOne, skatesTwo);

    }
}
