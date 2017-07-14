// Generated code from Butter Knife. Do not modify!
package syahrulright.com.movies.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MoviesRecyclerViewAdapter$ViewHolder$$ViewBinder<T extends syahrulright.com.movies.adapter.MoviesRecyclerViewAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558528, "field 'mView'");
    target.mView = view;
    view = finder.findRequiredView(source, 2131558529, "field 'mMovieImage'");
    target.mMovieImage = finder.castView(view, 2131558529, "field 'mMovieImage'");
  }

  @Override public void unbind(T target) {
    target.mView = null;
    target.mMovieImage = null;
  }
}
