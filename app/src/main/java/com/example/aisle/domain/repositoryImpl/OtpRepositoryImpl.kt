package com.example.aisle.domain.repositoryImpl


import com.example.aisle.data.model.LoginRequestModel
import com.example.aisle.data.model.OtpRequestModel
import com.example.aisle.data.model.OtpResponseModel
import com.example.aisle.data.repository.dataSource.LoginRemoteDataSource
import com.example.aisle.data.repository.dataSource.OtpRemoteDataSource
import com.example.aisle.domain.repository.LoginRepository
import com.example.aisle.domain.repository.OtpRepository
import com.example.aisle.utils.Resource
import retrofit2.Response
import javax.inject.Inject

class OtpRepositoryImpl @Inject constructor(
    private val otpRemoteDataSource: OtpRemoteDataSource
) : OtpRepository {

    private fun response(response: Response<OtpResponseModel>): Resource<OtpResponseModel> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message())
    }

    override suspend fun postOtpApi(data: OtpRequestModel): Resource<OtpResponseModel> {
        return response(otpRemoteDataSource.postOtpCode(data))
    }

}