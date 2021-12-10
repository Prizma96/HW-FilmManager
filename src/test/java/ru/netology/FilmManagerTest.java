package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    private ru.netology.Film first = new ru.netology.Film(1, "url1", "Film1", "Genre1");
    private ru.netology.Film second = new ru.netology.Film(2, "url2", "Film2", "Genre2");
    private ru.netology.Film third = new ru.netology.Film(3, "url3", "Film3", "Genre3");
    private ru.netology.Film fourth = new ru.netology.Film(4, "url4", "Film4", "Genre4");
    private ru.netology.Film fifth = new ru.netology.Film(5, "url5", "Film5", "Genre5");
    private ru.netology.Film sixth = new ru.netology.Film(6, "url6", "Film6", "Genre6");
    private ru.netology.Film seventh = new ru.netology.Film(7, "url7", "Film7", "Genre7");
    private ru.netology.Film eight = new ru.netology.Film(8, "url8", "Film8", "Genre8");
    private ru.netology.Film ninth = new ru.netology.Film(9, "url9", "Film9", "Genre9");
    private ru.netology.Film tenth = new ru.netology.Film(10, "url10", "Film10", "Genre10");
    private ru.netology.Film eleventh = new ru.netology.Film(11, "url11", "Film11", "Genre11");
    private ru.netology.Film twelfth = new ru.netology.Film(12, "url12", "Film12", "Genre12");

    FilmManager manager = new FilmManager(6);

    @BeforeEach
    public void setUp() {
        manager.addFilms(first);
        manager.addFilms(second);
        manager.addFilms(third);
        manager.addFilms(fourth);
        manager.addFilms(fifth);
        manager.addFilms(sixth);
        manager.addFilms(seventh);
        manager.addFilms(eight);
        manager.addFilms(ninth);
        manager.addFilms(tenth);
        manager.addFilms(eleventh);
        manager.addFilms(twelfth);
    }


    @Test
    public void shouldAddFilm() {
        manager.addFilms(first);
        ru.netology.Film[] expected = new ru.netology.Film[]{
                first,
                twelfth,
                eleventh,
                tenth,
                ninth};
        ru.netology.Film[] actual = manager.getFilms();
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldGetAllFilms() {
        ru.netology.Film[] expected = new ru.netology.Film[]{
                twelfth,
                eleventh,
                tenth,
                ninth,
                eight};
        ru.netology.Film[] actual = manager.getFilms();
        assertArrayEquals(expected, actual);
    }

}