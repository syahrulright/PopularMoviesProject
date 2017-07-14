package syahrulright.com.movies.fragment;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import syahrulright.com.movies.network.MovieService;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MovieDetailFragment_MembersInjector implements MembersInjector<MovieDetailFragment> {
  private final MembersInjector<BaseFragment> supertypeInjector;
  private final Provider<MovieService> movieServiceProvider;

  public MovieDetailFragment_MembersInjector(MembersInjector<BaseFragment> supertypeInjector, Provider<MovieService> movieServiceProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert movieServiceProvider != null;
    this.movieServiceProvider = movieServiceProvider;
  }

  @Override
  public void injectMembers(MovieDetailFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.movieService = movieServiceProvider.get();
  }

  public static MembersInjector<MovieDetailFragment> create(MembersInjector<BaseFragment> supertypeInjector, Provider<MovieService> movieServiceProvider) {  
      return new MovieDetailFragment_MembersInjector(supertypeInjector, movieServiceProvider);
  }
}
