package com.example.aisle.data.repository.dataSource

import com.example.aisle.data.ApiService.ApiService
import com.example.aisle.data.model.NotesResponseModel
import retrofit2.Response

interface NotesRemoteDataSource {
    suspend fun getNotesApi(auth : String?): Response<NotesResponseModel>
}