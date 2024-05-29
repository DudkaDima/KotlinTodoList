package com.example.todolist.data.local.preference

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AppPreferenceIml @Inject constructor(
    @ApplicationContext
    context: Context
) : AppPreferences {
    private val storage: SharedPreferences =
        context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

    override fun clear(key: String) {
        storage.edit { remove(key) }
    }

    override fun putInt(key: String, value: Int) {
        storage.edit { putInt(key, value) }
    }

    override fun getInt(key: String, def: Int): Int {
        return storage.getInt(key, def)
    }

    override fun putBoolean(key: String, value: Boolean) {
        storage.edit { putBoolean(key, value) }
    }

    override fun getBoolean(key: String, def: Boolean): Boolean {
        return storage.getBoolean(key, def)
    }

    override fun putString(key: String, value: String) {
        storage.edit { putString(key, value) }
    }

    override fun getString(key: String, def: String): String {
        return storage.getString(key, def).orEmpty()
    }

    override fun getString(key: String): String? {
        return storage.getString(key, null)
    }

    override fun putLong(key: String, value: Long) {
        storage.edit { putLong(key, value) }
    }

    override fun getLong(key: String, def: Long): Long {
        return storage.getLong(key, def)
    }

    override fun putFloat(key: String, value: Float) {
        storage.edit { putFloat(key, value) }
    }

    override fun getFloat(key: String, def: Float): Float {
        return storage.getFloat(key, def)
    }

    companion object {
        private const val PREFERENCES_NAME = "HI_PAW_PREFERENCES"
    }
}