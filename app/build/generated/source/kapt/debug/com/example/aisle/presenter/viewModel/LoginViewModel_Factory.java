// Generated by Dagger (https://dagger.dev).
package com.example.aisle.presenter.viewModel;

import android.content.Context;
import com.example.aisle.domain.useCase.PostLoginUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<Context> contextProvider;

  private final Provider<PostLoginUseCase> loginUseCaseProvider;

  public LoginViewModel_Factory(Provider<Context> contextProvider,
      Provider<PostLoginUseCase> loginUseCaseProvider) {
    this.contextProvider = contextProvider;
    this.loginUseCaseProvider = loginUseCaseProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(contextProvider.get(), loginUseCaseProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<Context> contextProvider,
      Provider<PostLoginUseCase> loginUseCaseProvider) {
    return new LoginViewModel_Factory(contextProvider, loginUseCaseProvider);
  }

  public static LoginViewModel newInstance(Context context, PostLoginUseCase loginUseCase) {
    return new LoginViewModel(context, loginUseCase);
  }
}
