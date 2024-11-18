public class Writer extends Artist {
    public enum WritingStyle {
        FICTION, NONFICTION, POETRY, DRAMA
    }

    private WritingStyle writingStyle;

    public Writer(String name, int age, WritingStyle writingStyle) {
        super(name, age, "Literature");
        this.writingStyle = writingStyle;
    }

    public WritingStyle getWritingStyle() {
        return writingStyle;
    }

    public void setWritingStyle(WritingStyle writingStyle) {
        this.writingStyle = writingStyle;
    }

    @Override
    public String getDetails() {
        return "Writer's Info:\n" +
               super.getDetails() + "\nWriting Style: " + writingStyle;
    }
}

