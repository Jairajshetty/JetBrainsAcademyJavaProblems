class Book {

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public String getTitle() {
        return title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String[] getAuthors() {
        return authors;
    }
}