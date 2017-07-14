package syahrulright.com.movies.network;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MovieModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final MovieModule module;
  private final Provider<OkHttpClient> okHttpClientProvider;

  public MovieModule_ProvideRetrofitFactory(MovieModule module, Provider<OkHttpClient> okHttpClientProvider) {  
    assert module != null;
    this.module = module;
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {  
    Retrofit provided = module.provideRetrofit(okHttpClientProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Retrofit> create(MovieModule module, Provider<OkHttpClient> okHttpClientProvider) {  
    return new MovieModule_ProvideRetrofitFactory(module, okHttpClientProvider);
  }
}

