package org.example.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class posterManagerTest {
    String movie1 = "Бладшот";
    String movie2 = "Вперёд";
    String movie3 = "Отель <Белград>";
    String movie4 = "Джентельмены";
    String movie5 = "Человек-невидимка";
    String movie6 = "Тролли.Мировой тур";
    String movie7 = "Номер один";

    @Test
    public void listMoviesInOrder() {
        posterManager manager = new posterManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void putMoviesInReverseOrder() {
        posterManager manager = new posterManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void maximumlimit() {
    posterManager manager = new posterManager(5);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] expected = {movie7, movie6, movie5, movie4, movie3};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
