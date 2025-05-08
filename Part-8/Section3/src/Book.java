public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.content = content;
        this.published = published;
    }

    public int hashCode() {
        if (this.name == null) {
            return this.published;
        }
        return this.published + this.name.hashCode();
    }

    //custom equals method
    //to check object similarity
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Book)) {
            return false;
        }

        Book bookObj = (Book) obj;

        if (this.name.equals(bookObj.name) &&
        this.published == bookObj.published &&
        this.content.equals(bookObj.content)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return this.published;
    }

    public void setPublished(int year) {
        this.published = year;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "Name: " + this.name +
                " (" + this.published + ")\n"
                + "Content: " + this.content;
    }
}
