package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadiomanTest {
    @Test
    public void validateChangeVolume () {
        Radioman radioman = new Radioman();
        radioman.setCurrentVolume(10);
        assertEquals(10,11);



    }

}