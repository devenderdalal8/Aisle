// Generated by Dagger (https://dagger.dev).
package com.example.aisle.presenter.di;

import com.example.aisle.data.ApiService.ApiService;
import com.example.aisle.data.repository.dataSource.LoginRemoteDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataSourceModule_ProvideLoginPhoneNumberDataSourceFactory implements Factory<LoginRemoteDataSource> {
  private final DataSourceModule module;

  private final Provider<ApiService> apiServiceProvider;

  public DataSourceModule_ProvideLoginPhoneNumberDataSourceFactory(DataSourceModule module,
      Provider<ApiService> apiServiceProvider) {
    this.module = module;
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public LoginRemoteDataSource get() {
    return provideLoginPhoneNumberDataSource(module, apiServiceProvider.get());
  }

  public static DataSourceModule_ProvideLoginPhoneNumberDataSourceFactory create(
      DataSourceModule module, Provider<ApiService> apiServiceProvider) {
    return new DataSourceModule_ProvideLoginPhoneNumberDataSourceFactory(module, apiServiceProvider);
  }

  public static LoginRemoteDataSource provideLoginPhoneNumberDataSource(DataSourceModule instance,
      ApiService apiService) {
    return Preconditions.checkNotNullFromProvides(instance.provideLoginPhoneNumberDataSource(apiService));
  }
}
