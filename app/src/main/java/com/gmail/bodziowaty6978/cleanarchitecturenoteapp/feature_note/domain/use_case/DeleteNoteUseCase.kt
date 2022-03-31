package com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note:Note){
        repository.deleteNote(note = note)
    }
}