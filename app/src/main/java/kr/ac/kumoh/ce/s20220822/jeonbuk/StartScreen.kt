package kr.ac.kumoh.ce.s20220822.jeonbuk

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun StartScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEFEFEF))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 제목
        Text(
            text = "전북 현대 모터스",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // 엠블럼 이미지
        Image(
            painter = painterResource(id = R.drawable.jbhd), // 엠블럼 이미지 추가
            contentDescription = "전북 현대 엠블럼",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 16.dp)
        )
        Button(
            onClick = { navController.navigate("club_description") }, // 구단 설명 화면으로 이동
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(red = 39, green = 106, blue = 82), // 전북 공식 Green 색상
                contentColor = Color.White // 텍스트 색상
            )
        ) {
            Text("구단 설명")
        }
        Button(
            onClick = { navController.navigate("coaches") }, // 감독 및 코치 화면으로 이동
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(red = 39, green = 106, blue = 82), // 전북 공식 Green 색상
                contentColor = Color.White // 텍스트 색상
            )
        ) {
            Text("감독 및 코치")
        }
        Button(
            onClick = { navController.navigate("players") }, // 프로 선수 화면으로 이동
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(red = 39, green = 106, blue = 82), // 전북 공식 Green 색상
                contentColor = Color.White // 텍스트 색상
            )
        ) {
            Text("프로 선수")
        }
    }
}

