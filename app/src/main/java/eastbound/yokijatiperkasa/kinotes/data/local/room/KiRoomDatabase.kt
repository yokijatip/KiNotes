package eastbound.yokijatiperkasa.kinotes.data.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import eastbound.yokijatiperkasa.kinotes.data.entity.NoteEntity

@Database(entities = [NoteEntity::class], version = 2)
abstract class KiRoomDatabase : RoomDatabase(){

    abstract fun dao(): KiDao

    companion object {
        @Volatile
        private var INSTANCE: KiRoomDatabase? = null

        @JvmStatic
        fun getDatabase(context: Context): KiRoomDatabase {
            if (INSTANCE == null) {
                synchronized(KiRoomDatabase::class.java) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext, KiRoomDatabase::class.java, "ki_note_database").build()
                }
            }
            return INSTANCE as KiRoomDatabase
        }
    }

}