public class ArtistDemo {
    public static void main(String[] args) {
        // Artist instance
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        System.out.println("Artist Name: " + artist.getName());
        System.out.println("Age: " + artist.getAge());
        System.out.println("Specialty: " + artist.getSpecialty());
        System.out.println();

        // Singer instance
        Singer singer = new Singer("Ariana Grande", 31, Singer.Genre.POP);
        System.out.println(singer.getDetails());
        System.out.println();

        // Painter instance (corrected)
        Painter painter = new Painter("Pablo Picasso", 91, Painter.Medium.OIL);
        System.out.println(painter.getDetails());
        System.out.println();

        // Writer instance
        Writer writer = new Writer("Jane Austen", 41, Writer.WritingStyle.FICTION);
        System.out.println(writer.getDetails());
        System.out.println();

        // Dancer instance
        Dancer dancer = new Dancer("La Lisa", 26, Dancer.DanceStyle.HIPHOP);
        System.out.println(dancer.getDetails());
    }
}

