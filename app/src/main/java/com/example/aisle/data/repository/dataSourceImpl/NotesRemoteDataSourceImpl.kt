package com.example.aisle.data.repository.dataSourceImpl

import com.example.aisle.data.ApiService.ApiService
import com.example.aisle.data.model.NotesResponseModel
import com.example.aisle.data.model.OtpRequestModel
import com.example.aisle.data.model.OtpResponseModel
import com.example.aisle.data.repository.dataSource.NotesRemoteDataSource
import com.example.aisle.data.repository.dataSource.OtpRemoteDataSource
import retrofit2.Response
import javax.inject.Inject

class NotesRemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService
): NotesRemoteDataSource {
    override suspend fun getNotesApi(auth : String?): Response<NotesResponseModel> {
        return apiService.getNotesApi(auth)
    }

}