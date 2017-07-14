// Generated code from Butter Knife. Do not modify!
package syahrulright.com.movies.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MovieDetailFragment$$ViewBinder<T extends syahrulright.com.movies.fragment.MovieDetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558519, "field 'appBarLayout'");
    target.appBarLayout = finder.castView(view, 2131558519, "field 'appBarLayout'");
    view = finder.findRequiredView(source, 2131558520, "field 'backdrop'");
    target.backdrop = finder.castView(view, 2131558520, "field 'backdrop'");
    view = finder.findRequiredView(source, 2131558524, "field 'mMoviePlot'");
    target.mMoviePlot = finder.castView(view, 2131558524, "field 'mMoviePlot'");
    view = finder.findRequiredView(source, 2131558522, "field 'mMovieReleaseDate'");
    target.mMovieReleaseDate = finder.castView(view, 2131558522, "field 'mMovieReleaseDate'");
    view = finder.findRequiredView(source, 2131558523, "field 'mMovieRating'");
    target.mMovieRating = finder.castView(view, 2131558523, "field 'mMovieRating'");
    view = finder.findRequiredView(source, 2131558527, "field 'mAddToFavorites' and method 'onAddToFavoritesClicked'");
    target.mAddToFavorites = finder.castView(view, 2131558527, "field 'mAddToFavorites'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onAddToFavoritesClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558525, "field 'movieTrailersRecyclerView'");
    target.movieTrailersRecyclerView = finder.castView(view, 2131558525, "field 'movieTrailersRecyclerView'");
    view = finder.findRequiredView(source, 2131558526, "field 'movieReviewsRecyclerView'");
    target.movieReviewsRecyclerView = finder.castView(view, 2131558526, "field 'movieReviewsRecyclerView'");
  }

  @Override public void unbind(T target) {
    target.appBarLayout = null;
    target.backdrop = null;
    target.mMoviePlot = null;
    target.mMovieReleaseDate = null;
    target.mMovieRating = null;
    target.mAddToFavorites = null;
    target.movieTrailersRecyclerView = null;
    target.movieReviewsRecyclerView = null;
  }
}
