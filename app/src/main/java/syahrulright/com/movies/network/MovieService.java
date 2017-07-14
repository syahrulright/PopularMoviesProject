package syahrulright.com.movies.network;

import syahrulright.com.movies.entity.Movie;
import syahrulright.com.movies.entity.MovieList;
import syahrulright.com.movies.entity.MovieReviewsList;
import syahrulright.com.movies.entity.MovieVideosList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MovieService {

    @GET("movie/popular?api_key=" + MovieModule.API_KEY)
    Call<MovieList> getPopularMovies();

    @GET("movie/top_rated?api_key=" + MovieModule.API_KEY)
    Call<MovieList> getTopRatedMovies();

    @GET("movie/{id}?api_key=" + MovieModule.API_KEY)
    Call<Movie> getdMovie(@Path("id") long id);

    @GET("movie/{id}/videos?api_key=" + MovieModule.API_KEY)
    Call<MovieVideosList> getMovieVideos(@Path("id") long id);

    @GET("movie/{id}/reviews?api_key=" + MovieModule.API_KEY)
    Call<MovieReviewsList> getMovieReviews(@Path("id") long id);

}
