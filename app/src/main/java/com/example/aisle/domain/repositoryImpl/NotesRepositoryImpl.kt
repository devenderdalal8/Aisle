package com.example.aisle.domain.repositoryImpl


import com.example.aisle.data.model.LoginRequestModel
import com.example.aisle.data.model.NotesResponseModel
import com.example.aisle.data.model.OtpRequestModel
import com.example.aisle.data.model.OtpResponseModel
import com.example.aisle.data.repository.dataSource.LoginRemoteDataSource
import com.example.aisle.data.repository.dataSource.NotesRemoteDataSource
import com.example.aisle.data.repository.dataSource.OtpRemoteDataSource
import com.example.aisle.domain.repository.LoginRepository
import com.example.aisle.domain.repository.NotesRepository
import com.example.aisle.domain.repository.OtpRepository
import com.example.aisle.utils.Resource
import retrofit2.Response
import javax.inject.Inject

class NotesRepositoryImpl @Inject constructor(
    private val notesRemoteDataSource: NotesRemoteDataSource
) : NotesRepository {

    private fun response(response: Response<NotesResponseModel>): Resource<NotesResponseModel> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message())
    }


    override suspend fun getNotesApi(auth: String?): Resource<NotesResponseModel> {
        return response(notesRemoteDataSource.getNotesApi(auth))
    }

}