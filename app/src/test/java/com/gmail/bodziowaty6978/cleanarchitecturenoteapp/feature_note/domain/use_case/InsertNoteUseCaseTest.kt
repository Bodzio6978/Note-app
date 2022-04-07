package com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.data.repository.FakeNoteRepository
import com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.model.InvalidNoteException
import com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.model.Note
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertThrows
import org.junit.Before
import org.junit.Test

class InsertNoteUseCaseTest {
    private lateinit var insertNote: InsertNoteUseCase
    private lateinit var fakeRepository: FakeNoteRepository

    @Before
    fun setUp() {
        fakeRepository = FakeNoteRepository()
        insertNote = InsertNoteUseCase(fakeRepository)
    }

    @Test
    fun `Add note without title, Invalid note exception`(){
        val note = Note(
            title = "",
            content = "a",
            color = 1,
            timestamp = 1
        )

        assertThrows(InvalidNoteException::class.java){
            runBlocking {
                insertNote(note)
            }
        }
    }

    @Test
    fun `Add note without content, Invalid note exception`(){
        val note = Note(
            title = "a",
            content = "",
            color = 1,
            timestamp = 1
        )

        assertThrows(InvalidNoteException::class.java){
            runBlocking {
                insertNote(note)
            }
        }
    }
}