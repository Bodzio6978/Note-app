package com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.model.InvalidNoteException
import com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class InsertNoteUseCase(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note:Note){
        if (note.title.isBlank()){
            throw InvalidNoteException("The Title can't be empty")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("The Content can't be empty")
        }
        repository.insertNote(note)
    }
}