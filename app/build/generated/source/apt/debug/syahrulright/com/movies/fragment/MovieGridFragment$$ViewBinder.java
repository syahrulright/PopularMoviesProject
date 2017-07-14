// Generated code from Butter Knife. Do not modify!
package syahrulright.com.movies.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MovieGridFragment$$ViewBinder<T extends syahrulright.com.movies.fragment.MovieGridFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558531, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131558531, "field 'recyclerView'");
  }

  @Override public void unbind(T target) {
    target.recyclerView = null;
  }
}
