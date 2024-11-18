public class Painter extends Artist {
    public enum Medium {
        OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL
    }

    private Medium medium;

    public Painter(String name, int age, Medium medium) {
        super(name, age, "Art");
        this.medium = medium;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    @Override
    public String getDetails() {
        return "Painter's Info:\n" +
               super.getDetails() + "\nMedium: " + medium;
    }
}

