package kr.ac.kumoh.ce.s20220822.jeonbuk

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerContent(navController: NavHostController, scaffoldState: ScaffoldState) {
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "구단 설명",
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    coroutineScope.launch {
                        scaffoldState.drawerState.close() // 드로어 닫기
                    }
                    navController.navigate("club_description") // 구단 설명 화면으로 이동
                }
                .padding(vertical = 8.dp)
        )
        Text(
            text = "감독 및 코치",
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    coroutineScope.launch {
                        scaffoldState.drawerState.close()
                    }
                    navController.navigate("coaches") // 감독 및 코치 화면으로 이동
                }
                .padding(vertical = 8.dp)
        )
        Text(
            text = "프로 선수",
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    coroutineScope.launch {
                        scaffoldState.drawerState.close()
                    }
                    navController.navigate("players") // 프로 선수 화면으로 이동
                }
                .padding(vertical = 8.dp)
        )
    }
}
