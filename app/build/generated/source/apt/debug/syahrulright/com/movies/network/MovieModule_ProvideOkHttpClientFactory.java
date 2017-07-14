package syahrulright.com.movies.network;

import dagger.internal.Factory;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MovieModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final MovieModule module;

  public MovieModule_ProvideOkHttpClientFactory(MovieModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public OkHttpClient get() {  
    OkHttpClient provided = module.provideOkHttpClient();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<OkHttpClient> create(MovieModule module) {  
    return new MovieModule_ProvideOkHttpClientFactory(module);
  }
}

