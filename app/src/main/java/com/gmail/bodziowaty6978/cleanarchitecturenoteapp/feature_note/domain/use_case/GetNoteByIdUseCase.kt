package com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class GetNoteByIdUseCase(
    private val repository: NoteRepository) {

    suspend operator fun invoke(id:Int){
        repository.getNoteById(id)
    }
}