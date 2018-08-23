
public class Netflix {
	
public static void main(String[] args) {
	Movie movie = new Movie("Ip Man", 5);
	Movie movie2 = new Movie("Ip Man 2", 4);
	Movie movie3 = new Movie("Ip Man 3", 4);
	Movie movie4 = new Movie("Coco", 5);
	Movie movie5 = new Movie("Lion", 4);
	movie.getClass();
	movie.getRating();
	System.out.println(movie.toString());
	movie.getTicketPrice();
	NetflixQueue que = new NetflixQueue();
	que.addMovie(movie);
	que.addMovie(movie2);
	que.addMovie(movie3);
	que.addMovie(movie4);
	que.addMovie(movie5);
	que.sortMoviesByRating();
	que.printMovies();
	System.out.println("The best movie is " +que.getBestMovie());
	System.out.println("The second best movie is " + que.getMovie(2));
	
	
}
}
