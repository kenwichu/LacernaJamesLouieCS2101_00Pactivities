public class Artist {
    private String name;
    private int age;
    private String specialty;

    public Artist(String name, int age, String specialty) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getSpecialty() {
        return specialty;
    }

    protected void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getDetails() {
        return "Artist Name: " + name + "\nAge: " + age + "\nSpecialty: " + specialty;
    }
}

