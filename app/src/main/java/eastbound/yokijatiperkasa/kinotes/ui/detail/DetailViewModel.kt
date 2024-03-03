package eastbound.yokijatiperkasa.kinotes.ui.detail

import androidx.lifecycle.ViewModel
import eastbound.yokijatiperkasa.kinotes.data.entity.NoteEntity
import eastbound.yokijatiperkasa.kinotes.repository.Repository

class DetailViewModel(private val repository: Repository): ViewModel() {

    fun delete(note: NoteEntity) {
        repository.delete(note)
    }

    fun update(note: NoteEntity) {
        repository.update(note)
    }

}