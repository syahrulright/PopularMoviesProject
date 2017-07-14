package syahrulright.com.movies.network;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MovieModule_ProvideUserServiceFactory implements Factory<MovieService> {
  private final MovieModule module;
  private final Provider<Retrofit> retrofitProvider;

  public MovieModule_ProvideUserServiceFactory(MovieModule module, Provider<Retrofit> retrofitProvider) {  
    assert module != null;
    this.module = module;
    assert retrofitProvider != null;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public MovieService get() {  
    MovieService provided = module.provideUserService(retrofitProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<MovieService> create(MovieModule module, Provider<Retrofit> retrofitProvider) {  
    return new MovieModule_ProvideUserServiceFactory(module, retrofitProvider);
  }
}

