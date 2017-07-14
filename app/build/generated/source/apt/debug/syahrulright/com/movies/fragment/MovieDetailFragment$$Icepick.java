// Generated code from Icepick. Do not modify!
package syahrulright.com.movies.fragment;
import android.os.Bundle;
import icepick.Injector.Helper;
import icepick.Injector.Object;

public class MovieDetailFragment$$Icepick<T extends MovieDetailFragment> extends Object<T> {

  private final static Helper H = new Helper("syahrulright.com.movies.fragment.MovieDetailFragment$$Icepick.");

  public void restore(T target, Bundle state) {
    if (state == null) return;
    target.curMovie = H.getSerializable(state, "curMovie");
    target.movieId = H.getLong(state, "movieId");
    super.restore(target, state);
  }

  public void save(T target, Bundle state) {
    super.save(target, state);
    H.putSerializable(state, "curMovie", target.curMovie);
    H.putLong(state, "movieId", target.movieId);
  }
}