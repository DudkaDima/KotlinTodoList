package com.example.todolist.data.local.preference

interface AppPreferences {

        fun clear(key: String)

        fun putInt(key: String, value: Int)
        fun getInt(key: String, def: Int = -1): Int

        fun putBoolean(key: String, value: Boolean)
        fun getBoolean(key: String, def: Boolean = false): Boolean

        fun putString(key: String, value: String)
        fun getString(key: String, def: String = ""): String
        fun getString(key: String): String?

        fun putLong(key: String, value: Long)
        fun getLong(key: String, def: Long = -1): Long

        fun putFloat(key: String, value: Float)
        fun getFloat(key: String, def: Float = 0f): Float
}