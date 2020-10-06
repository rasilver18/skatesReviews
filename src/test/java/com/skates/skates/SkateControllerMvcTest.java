package com.skates.skates;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
@WebMvcTest(SkateController.class)
public class SkateControllerMvcTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SkateRepository skateRepo;
    @Mock
    private Skates skatesOne;
    @Mock
    private Skates skatesTwo;
    @Mock
    private Skates skatesThree;

    @Test
    public void shouldBeOKForAllSkatesInTheSkatesList() throws Exception{
        mockMvc.perform(get("/skates")).andExpect(status().isOk()).andExpect(view().name("skates"));
    }
    @Test
    public void shouldFindAllSkatesInModel() throws Exception{
        Collection<Skates> allAvailableSkates = Arrays.asList(skatesOne, skatesTwo);
        when(skateRepo.findAll()).thenReturn(allAvailableSkates);
        mockMvc.perform(get("/skates")).andExpect(model().attribute("skatesModel", allAvailableSkates));

    }
    @Test
    public void shouldBeOKForASkatePairInTemplate() throws Exception{
        Long skatePairOneId=1L;
        when(skateRepo.findOne(skatePairOneId)).thenReturn(skatesOne);
        mockMvc.perform(get("/skater?id=1")).andExpect(status().isOk()).andExpect(view().name("skatePair"));
    }
    @Test
    public void shouldFindASkatePairInModel() throws Exception{
        Long skatePairOneId=1L;
        when(skateRepo.findOne(skatePairOneId)).thenReturn(skatesOne);
        mockMvc.perform(get("/skater?id=1")).andExpect(model().attribute("skateModel", skatesOne));
    }

}
