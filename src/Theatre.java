public class Theatre extends Event{


    public Theatre(String title, int releaseYear, int age) {
        super(title, releaseYear, age);
    }

    @Override
    public  String getTitle(){
        return title;
    }
    @Override
    public  int getReleaseYear(){
        return releaseYear;
    }
    @Override
    public int getAge(){
        return age;
    }
}
