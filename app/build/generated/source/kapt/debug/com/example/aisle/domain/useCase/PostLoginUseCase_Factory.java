// Generated by Dagger (https://dagger.dev).
package com.example.aisle.domain.useCase;

import com.example.aisle.domain.repository.LoginRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostLoginUseCase_Factory implements Factory<PostLoginUseCase> {
  private final Provider<LoginRepository> loginRepositoryProvider;

  public PostLoginUseCase_Factory(Provider<LoginRepository> loginRepositoryProvider) {
    this.loginRepositoryProvider = loginRepositoryProvider;
  }

  @Override
  public PostLoginUseCase get() {
    return newInstance(loginRepositoryProvider.get());
  }

  public static PostLoginUseCase_Factory create(Provider<LoginRepository> loginRepositoryProvider) {
    return new PostLoginUseCase_Factory(loginRepositoryProvider);
  }

  public static PostLoginUseCase newInstance(LoginRepository loginRepository) {
    return new PostLoginUseCase(loginRepository);
  }
}
