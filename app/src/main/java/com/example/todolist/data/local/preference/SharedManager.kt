package com.example.todolist.data.local.preference

import javax.inject.Inject

class SharedManager @Inject constructor(
    private val appPreferences: AppPreferences
)  {
    fun putTodosToStorage(todos: String) {

        appPreferences.putString(KEY_SAVE_TODO_LIST_LOCALLY, todos )
    }

    companion object {
        private const val KEY_SAVE_TODO_LIST_LOCALLY = "KEY_SAVE_TODO_LIST_LOCALLY"
    }
}