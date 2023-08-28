package org.example;

import org.example.exercice4.CityNotFoundException;
import org.example.exercice4.CitySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CitySearchTest {

    private CitySearch citySearch;

    @BeforeEach
    void setup() {
        citySearch = new CitySearch();
    }

    @Test
    void testSearchCitiesShouldRaiseNotFoundExceptionWhenSearhTextIsLt2char() {
        //Arrange => avec setup
        citySearch.setCities(Arrays.asList("Paris, Valence"));
        //Act And Assert When Exception
        Assertions.assertThrowsExactly(CityNotFoundException.class, () -> {
            citySearch.searchCities("t");
        });
    }


    ////

//    @Test
//    public void testSearchCitiesShouldReturnCitiesStarWinSearchWhenIs2L2char()  {
//        citySearch.setCities(Arrays.asList(MOCK_CITIES));
//
//
//        Assertions.assertThrowsL(CityNotFoundException.class, () -> {
//            citySearch.searchCities("t");
//
//        List<String> result = villeSearch.search("Va");
//        assertEquals(2, result.size());
//        assertTrue(result.contains("Valence"));
//        assertTrue(result.contains("Vancouver"));
    }



