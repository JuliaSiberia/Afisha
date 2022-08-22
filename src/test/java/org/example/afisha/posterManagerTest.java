package org.example.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class posterManagerTest {
    posterManager manager = new posterManager();

    String movie1 = "Бладшот";
    String movie2 = "Вперёд";
    String movie3 = "Отель <Белград>";
    String movie4 = "Джентельмены";
    String movie5 = "Человек-невидимка";
    String movie6 = "Тролли.Мировой тур";
    String movie7 = "Номер один";

    @Test
    public void listMoviesInOrder() {
        posterManager.add.(movie1);
        posterManager.add.(movie2);
        posterManager.add.(movie3);
        posterManager.add.(movie4);
        posterManager.add.(movie5);
        posterManager.add.(movie6);
        posterManager.add.(movie7);

        String [] expected = { movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        String[] actual = posterManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
