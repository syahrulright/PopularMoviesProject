package syahrulright.com.movies.fragment;

import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import syahrulright.com.movies.network.MovieModule;
import syahrulright.com.movies.network.MovieModule_ProvideOkHttpClientFactory;
import syahrulright.com.movies.network.MovieModule_ProvideRetrofitFactory;
import syahrulright.com.movies.network.MovieModule_ProvideUserServiceFactory;
import syahrulright.com.movies.network.MovieService;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerMovieGridFragmentComponent implements MovieGridFragmentComponent {
  private Provider<OkHttpClient> provideOkHttpClientProvider;
  private Provider<Retrofit> provideRetrofitProvider;
  private Provider<MovieService> provideUserServiceProvider;
  private MembersInjector<MovieGridFragment> movieGridFragmentMembersInjector;

  private DaggerMovieGridFragmentComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static MovieGridFragmentComponent create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideOkHttpClientProvider = ScopedProvider.create(MovieModule_ProvideOkHttpClientFactory.create(builder.movieModule));
    this.provideRetrofitProvider = ScopedProvider.create(MovieModule_ProvideRetrofitFactory.create(builder.movieModule, provideOkHttpClientProvider));
    this.provideUserServiceProvider = ScopedProvider.create(MovieModule_ProvideUserServiceFactory.create(builder.movieModule, provideRetrofitProvider));
    this.movieGridFragmentMembersInjector = MovieGridFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideUserServiceProvider);
  }

  @Override
  public void inject(MovieGridFragment movieGridFragment) {  
    movieGridFragmentMembersInjector.injectMembers(movieGridFragment);
  }

  public static final class Builder {
    private MovieModule movieModule;
  
    private Builder() {  
    }
  
    public MovieGridFragmentComponent build() {  
      if (movieModule == null) {
        this.movieModule = new MovieModule();
      }
      return new DaggerMovieGridFragmentComponent(this);
    }
  
    public Builder movieModule(MovieModule movieModule) {  
      if (movieModule == null) {
        throw new NullPointerException("movieModule");
      }
      this.movieModule = movieModule;
      return this;
    }
  }
}

