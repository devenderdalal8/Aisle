package com.example.aisle.domain.useCase

import com.example.aisle.data.model.NotesResponseModel
import com.example.aisle.data.model.OtpResponseModel
import com.example.aisle.domain.repository.NotesRepository
import com.example.aisle.utils.Resource
import javax.inject.Inject

class GetNotesUseCase @Inject constructor(
    private val notesRepository: NotesRepository,
) {

    suspend fun execute(auth: String?): Resource<NotesResponseModel> {
        return notesRepository.getNotesApi(auth)
    }
}