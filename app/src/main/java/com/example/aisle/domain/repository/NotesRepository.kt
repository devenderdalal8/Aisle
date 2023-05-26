package com.example.aisle.domain.repository


import com.example.aisle.data.model.NotesResponseModel
import com.example.aisle.utils.Resource

interface NotesRepository {

    suspend fun getNotesApi(auth: String?): Resource<NotesResponseModel>
}