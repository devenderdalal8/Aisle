package com.example.aisle.domain.repositoryImpl


import com.example.aisle.data.model.LoginRequestModel
import com.example.aisle.data.model.LoginResponseModel
import com.example.aisle.data.repository.dataSource.LoginRemoteDataSource
import com.example.aisle.domain.repository.LoginRepository
import com.example.aisle.utils.Resource
import retrofit2.Response
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private val loginRemoteDataSource: LoginRemoteDataSource,
) : LoginRepository {
    override suspend fun postLoginPhone(data: LoginRequestModel): Resource<LoginResponseModel> {
        return response(loginRemoteDataSource.postPhoneNumber(data))
    }

    private fun response(response: Response<LoginResponseModel>): Resource<LoginResponseModel> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message())
    }

}