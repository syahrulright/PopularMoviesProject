// Generated code from Butter Knife. Do not modify!
package syahrulright.com.movies;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MovieGridActivity$$ViewBinder<T extends syahrulright.com.movies.MovieGridActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558507, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131558507, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131558508, "field 'tabLayout'");
    target.tabLayout = finder.castView(view, 2131558508, "field 'tabLayout'");
    view = finder.findRequiredView(source, 2131558530, "field 'moviesViewPager'");
    target.moviesViewPager = finder.castView(view, 2131558530, "field 'moviesViewPager'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.tabLayout = null;
    target.moviesViewPager = null;
  }
}
