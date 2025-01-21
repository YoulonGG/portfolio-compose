package org.example.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import org.example.project.components.Content
import org.example.project.components.NavBar

@Composable
fun App(
    navController: NavController
) {
    MaterialTheme {
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()
        Column(
            modifier = Modifier.fillMaxSize().background(color = Color(0xFF34343b))
        ) {
            NavBar(title = "Youlong.")
//            Content()
        }
    }
}