// Generated code from Butter Knife. Do not modify!
package syahrulright.com.movies.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MovieVideoRecyclerViewAdapter$ViewHolder$$ViewBinder<T extends syahrulright.com.movies.adapter.MovieVideoRecyclerViewAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 16908308, "field 'mVideoName'");
    target.mVideoName = finder.castView(view, 16908308, "field 'mVideoName'");
  }

  @Override public void unbind(T target) {
    target.mVideoName = null;
  }
}
