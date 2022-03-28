import java.util.Scanner;

public class Main {

    public static String title;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название");
        title = scanner.nextLine();

        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");

    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie(title, 2010, 1),
                new Movie("Рокки3", 2010, 10)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Тетя Каренина", 2017, 1)

        };
    }

    public static void validEvent(Event event) throws RuntimeException {

         System.out.println(event);
        if (event.getAge() == 0 || event.getReleaseYear() == 0 || event.getTitle().equals("")|| event.getTitle() == null) {
            throw new RuntimeException();

        }
    }
}
