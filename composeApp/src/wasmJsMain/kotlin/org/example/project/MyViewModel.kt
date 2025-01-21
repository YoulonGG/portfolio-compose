package org.example.project

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MyViewModel : ViewModel() {
    private val _selectedItem = MutableStateFlow<NavBarItem>(NavBarItem.Home)
    val selectedItem = _selectedItem.asStateFlow()

    fun onSelectItem(item: NavBarItem) {
        _selectedItem.value = item
    }
}


sealed class NavBarItem(val label: String) {
    data object Home : NavBarItem("Home")
    data object About : NavBarItem("About")
    data object Work : NavBarItem("Work")
    data object Contact : NavBarItem("Contact")
}