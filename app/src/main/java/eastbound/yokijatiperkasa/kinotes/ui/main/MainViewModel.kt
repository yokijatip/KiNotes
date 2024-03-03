package eastbound.yokijatiperkasa.kinotes.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import eastbound.yokijatiperkasa.kinotes.data.entity.NoteEntity
import eastbound.yokijatiperkasa.kinotes.repository.Repository

class MainViewModel(private val repository: Repository) : ViewModel() {

    fun getAllNotes(): LiveData<List<NoteEntity>> = repository.getAllNotes()

    fun update(note: NoteEntity) {
        repository.update(note)
    }

    fun delete(note: NoteEntity) {
        repository.delete(note)
    }
}