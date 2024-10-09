package net.noble.notes_view_try.ViewModel_Screen_Notes

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Notes_VievModel : ViewModel() {
    var state by mutableStateOf(NoteState())
        private set
    init {
        viewModelScope.launch {
            state = state.copy(
                isLoading = true
            )
            delay(5000)
            state = state.copy(
                Notes = listOf(
                    Note("Mercado","10-8-2024","Ir al super"),
                    Note("Escuela","10-9-2024","Examen de MOVILE"),
                    Note("Familiar","10-10-2024","Ir a la cena fam")
                ),
                isLoading = false
            )

        }
    }
}