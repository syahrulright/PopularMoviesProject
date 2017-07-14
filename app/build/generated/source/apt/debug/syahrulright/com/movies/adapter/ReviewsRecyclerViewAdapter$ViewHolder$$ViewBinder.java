// Generated code from Butter Knife. Do not modify!
package syahrulright.com.movies.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ReviewsRecyclerViewAdapter$ViewHolder$$ViewBinder<T extends syahrulright.com.movies.adapter.ReviewsRecyclerViewAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 16908308, "field 'mAuthor'");
    target.mAuthor = finder.castView(view, 16908308, "field 'mAuthor'");
    view = finder.findRequiredView(source, 16908309, "field 'mContent'");
    target.mContent = finder.castView(view, 16908309, "field 'mContent'");
  }

  @Override public void unbind(T target) {
    target.mAuthor = null;
    target.mContent = null;
  }
}
