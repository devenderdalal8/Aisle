// Generated by Dagger (https://dagger.dev).
package com.example.aisle.domain.useCase;

import com.example.aisle.domain.repository.OtpRepository;
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
public final class PostOtpUseCase_Factory implements Factory<PostOtpUseCase> {
  private final Provider<OtpRepository> otpRepositoryProvider;

  public PostOtpUseCase_Factory(Provider<OtpRepository> otpRepositoryProvider) {
    this.otpRepositoryProvider = otpRepositoryProvider;
  }

  @Override
  public PostOtpUseCase get() {
    return newInstance(otpRepositoryProvider.get());
  }

  public static PostOtpUseCase_Factory create(Provider<OtpRepository> otpRepositoryProvider) {
    return new PostOtpUseCase_Factory(otpRepositoryProvider);
  }

  public static PostOtpUseCase newInstance(OtpRepository otpRepository) {
    return new PostOtpUseCase(otpRepository);
  }
}
