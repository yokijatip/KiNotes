package eastbound.yokijatiperkasa.kinotes.data.local.room

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import eastbound.yokijatiperkasa.kinotes.data.entity.NoteEntity

interface KiDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note: NoteEntity)

    @Update
    fun update(note: NoteEntity)

    @Delete
    fun delete(note: NoteEntity)

    @Query("SELECT * FROM noteentity ORDER BY id DESC")
    fun getAllNotes(): LiveData<List<NoteEntity>>

}