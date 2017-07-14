package syahrulright.com.movies.fragment;

import dagger.Component;
import javax.annotation.Generated;
import javax.inject.Singleton;
import syahrulright.com.movies.network.MovieModule;

@Generated("autodagger.compiler.AnnotationProcessor")
@Component(
    modules = MovieModule.class
)
@Singleton
public interface MovieDetailFragmentComponent {
  void inject(MovieDetailFragment movieDetailFragment);
}
