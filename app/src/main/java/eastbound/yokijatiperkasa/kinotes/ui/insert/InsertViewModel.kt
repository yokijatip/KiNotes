package eastbound.yokijatiperkasa.kinotes.ui.insert

import androidx.lifecycle.ViewModel
import eastbound.yokijatiperkasa.kinotes.data.entity.NoteEntity
import eastbound.yokijatiperkasa.kinotes.repository.Repository

class InsertViewModel(private val repository: Repository): ViewModel() {

    fun insert(note: NoteEntity) {
        repository.insert(note)
    }

}