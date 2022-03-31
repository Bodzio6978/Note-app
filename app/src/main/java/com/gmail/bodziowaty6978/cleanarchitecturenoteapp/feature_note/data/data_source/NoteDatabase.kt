package com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gmail.bodziowaty6978.cleanarchitecturenoteapp.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase :RoomDatabase(){

    abstract val noteDao:NoteDao
}