public class Singer extends Artist {
    public enum Genre {
        POP, ROCK, CLASSICAL, JAZZ, HIPHOP, RNB
    }

    private Genre genre;

    public Singer(String name, int age, Genre genre) {
        super(name, age, "Music");
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String getDetails() {
        return "Singer's Info:\n" + 
               super.getDetails() + "\nGenre: " + genre;
    }
}

