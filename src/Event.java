public abstract class  Event {
    public String title;
    public  int releaseYear;
    public int age;

    public Event(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    public  abstract String getTitle();

    public abstract int getReleaseYear();

    public abstract int getAge();

    public String toString() {
        return "Название: "+ title + ".  Год:  " + releaseYear + ".  Возраст:  " + age;

    }
}
