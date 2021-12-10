package ru.netology;

public class FilmManager {
    private int filmAmount = 10;

    private ru.netology.Film[] films = new ru.netology.Film[filmAmount];

    public FilmManager() {
        this.filmAmount = 10;
    }

    public FilmManager(int filmAmount) {
        this.filmAmount = filmAmount;
    }

    public void addFilms(ru.netology.Film film) {
        int length = films.length + 1;
        ru.netology.Film[] tmp = new ru.netology.Film[length];
        System.arraycopy(films, 0, tmp, 0, length - 1);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }


    public ru.netology.Film[] getFilms() {
        ru.netology.Film[] tmpresult = new ru.netology.Film[filmAmount];
        int counter = 0;
        for (int i = 0; i < filmAmount; i++) {
            int index = films.length - i - 1;
            if(films[index] != null){
                tmpresult[counter] = films[index];
                counter += 1;
            }
        }
        ru.netology.Film[] result = new ru.netology.Film[counter];
        System.arraycopy(tmpresult, 0, result, 0, counter );
        return result;
    }
}
