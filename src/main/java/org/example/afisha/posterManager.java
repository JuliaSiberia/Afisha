package org.example.afisha;

public class posterManager {

    private String[] movies = new String[0];
    private int limit;

    public posterManager() {
        limit = 10;
    }

    public posterManager(int limit) {
        this.limit = limit;
    }

    public void add(String movies) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movies;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        ...
  ??? resultLength;
        if ??? {
            resultLength = ???
        } else {
            resultLength = ???
        }
  ??? result = new ???[resultLength];
        for (???) {
            // заполняем result из массива что лежит в поле
            // в обратном порядке
        }
...
    }
}