package kr.ac.kumoh.ce.s20220822.jeonbuk

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TeamViewModel : ViewModel() {
    private val _coaches = MutableStateFlow<List<Coach>>(emptyList())
    val coaches: StateFlow<List<Coach>> get() = _coaches

    private val _players = MutableStateFlow<List<Player>>(emptyList())
    val players: StateFlow<List<Player>> get() = _players

    init {
        fetchCoaches()
        fetchPlayers()
    }

    private fun fetchCoaches() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getCoaches()
                _coaches.value = response
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    private fun fetchPlayers() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getPlayers()
                _players.value = response
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
