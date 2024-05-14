object Movies {

  // Equivalent to Movies.movies() from part1, except it turns an array instead of a list
  // (Arrays are more useful in Scala than in Java for *reasons*)
  def movies(): Array[Movie] = Array(
    Movie("Star Wars", 1977),
    Movie("Star Trek: the Motion Picture", 1979),
    Movie("Blade Runner", 1982),
    Movie("The Matrix", 1999),
    Movie("Alien", 1979),
    Movie("Inception", 2010),
    Movie("Interstellar", 2014),
    Movie("The Terminator", 1984),
    Movie("2001: A Space Odyssey", 1968),
    Movie("E.T. the Extra-Terrestrial", 1982),
    Movie("Jurassic Park", 1993),
    Movie("Avatar", 2009)
  )

  def main(args: Array[String]): Unit =
    () // replace with code
}
