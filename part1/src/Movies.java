import java.util.List;

public class Movies {

    public static List<Movie> movies() {
        return List.of(
            new Movie("Star Wars", 1977),
            new Movie("Star Trek: the Motion Picture", 1979),
            new Movie("Blade Runner", 1982),
            new Movie("The Matrix", 1999),
            new Movie("Alien", 1979),
            new Movie("Inception", 2010),
            new Movie("Interstellar", 2014),
            new Movie("The Terminator", 1984),
            new Movie("2001: A Space Odyssey", 1968),
            new Movie("E.T. the Extra-Terrestrial", 1982),
            new Movie("Jurassic Park", 1993),
            new Movie("Avatar", 2009)
        );
    }

    public static void main(String[] args) {
        List<Movie> startingMovies = movies();

        /* Write some Java code to do the following:
                1) Filter startingMovies so that it contains only movies from 1980 or later
                   (That is, make a new ArrayList of movies and keep only those from 1980+)

                2) Sort the resulting list alphabetically

                3) Print each movie in the resulting list in the form "(year) Title", e.g. "(1977) Star Wars"
         */

        // 1) Filter startingMovies so that it contains only movies from 1980 or later
        // (startingMovies is immutable, so make a new ArrayList and retain only those movies from 1980 or later)





        // 2) Sort the resulting list alphabetically
        // The easiest way to do this is something like
        //     movies.sort(Comparator.comparing(movie -> movie.title()))





        // 3) Print each movie in the resulting list in the form "(year) Title", e.g. "(1977) Star Wars"





    }
}
