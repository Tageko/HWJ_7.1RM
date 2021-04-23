package ru.netology.domain;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class RadiomanTest {
    Radioman radioman = new Radioman();

    @ParameterizedTest
    @CsvSource(
            value = {
                    "-1; 5",
                    "6; 6",
                    "-11; 5"}
            ,delimiter = ';'
    )
    void validateCurrentVolume (int start, int expected) {
        radioman.setCurrentVolume(start);
        assertEquals(5, radioman.getCurrentVolume());
    }
    @ParameterizedTest
    @CsvSource(
            value = {
                    "0; 1",
                    "10, 10"}
            ,delimiter = ';'
    )

    void validateIncreaseCurrentVolume(int start, int result) {
        radioman.setCurrentVolume(start);
        radioman.increaseCurrentVolume();
        assertEquals(1, radioman.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0; 0",
                    "10, 9"}
            ,delimiter = ';'
    )

    void validateDecreaseCurrentVolume(int start, int result) {
        radioman.setCurrentVolume(start);
        radioman.decreaseCurrentVolume();
        assertEquals(0, radioman.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "-1; 0",
                    "5; 5",
                    "10; 0"}
            ,delimiter = ';'
    )
    void validateCurrentChannel (int start, int result) {
        radioman.setCurrentChannel(start);
        assertEquals(5, radioman.getCurrentChannel());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0; 9",
                    "9, 0"}
            ,delimiter = ';'
    )

    void validateNextChannel(int start, int result) {
        radioman.setCurrentChannel(start);
        radioman.nextChannel();
        assertEquals(1, radioman.getCurrentChannel());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0; 9",
                    "8, 7"}
            ,delimiter = ';'
    )

    void validatePrevChannel(int start, int result) {
        radioman.setCurrentChannel(start);
        radioman.prevChannel();
        assertEquals(0, radioman.getCurrentChannel());
    }


}