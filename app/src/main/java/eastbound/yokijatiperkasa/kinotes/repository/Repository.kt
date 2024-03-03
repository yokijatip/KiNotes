package eastbound.yokijatiperkasa.kinotes.repository

import android.app.Application
import androidx.lifecycle.LiveData
import eastbound.yokijatiperkasa.kinotes.data.entity.NoteEntity
import eastbound.yokijatiperkasa.kinotes.data.local.room.KiDao
import eastbound.yokijatiperkasa.kinotes.data.local.room.KiRoomDatabase

class Repository(application: Application) {

    private val mKiDao: KiDao

    init {
        val db = KiRoomDatabase.getDatabase(application)
        mKiDao = db.dao()
    }

//    Fetching All Notes berbentuk Livedata List
    fun getAllNotes(): LiveData<List<NoteEntity>> = mKiDao.getAllNotes()

//    Menambahkan Notes
    fun insert(note: NoteEntity) {
        mKiDao.insert(note)
    }

//    Menghapus Notes
    fun delete(note: NoteEntity) {
        mKiDao.delete(note)
    }

//    Mengupdate Notes
    fun update(note: NoteEntity) {
        mKiDao.update(note)
    }



}