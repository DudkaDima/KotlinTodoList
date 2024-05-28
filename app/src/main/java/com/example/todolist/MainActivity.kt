package com.example.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.todolist.core.TodoItemHeight
import com.example.todolist.ui.theme.Pink80
import com.example.todolist.ui.theme.TodoListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoListTheme {
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = Pink80
                ) {
                    val itemsList = (0..100).toList()
                    SimpleLazyColumn(itemsList)
                }
            }
        }
    }
}

@Composable
fun SimpleLazyColumn(items: List<Int>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .width(TodoItemHeight)

    ) {
        items(items) { item ->
            BasicText(text = "Item #$item")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TodoListTheme {
        val itemsList = (0..100).toList()
        SimpleLazyColumn(itemsList)
    }
}