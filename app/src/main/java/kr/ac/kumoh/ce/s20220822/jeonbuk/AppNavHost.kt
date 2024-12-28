package kr.ac.kumoh.ce.s20220822.jeonbuk

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.ui.Modifier


@Composable
fun AppNavHost(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navController, startDestination = "start") {
        composable("start") { StartScreen(navController) } // 시작 화면
        composable("club_description") { ClubDescriptionScreen() } // 구단 설명
        composable("coaches") { CoachesScreen() } // 감독 및 코치
        composable("players") { PlayersScreen() } // 프로 선수
    }
}