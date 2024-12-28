package kr.ac.kumoh.ce.s20220822.jeonbuk

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ClubDescriptionScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
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

        // 설명 섹션
        Text(
            text = "소개글",
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.DarkGray,
            modifier = Modifier.fillMaxWidth().padding(bottom = 4.dp)
        )
        Text(
            text = " 전북 현대는 전북특별자치도를 연고로 하는 K리그1 소속 프로 축구단으로 1994년 12월 12일에 창단하였다. 홈 구장은 전주월드컵경기장(34,276석)이며 현대자동차가 모기업이다.\n" +
                    " 전북 현대는 K리그1 9회 최다 우승과 최다 연속 우승, 코리아컵 5회 우승, 슈퍼컵 1회 우승, AFC 챔피언스 리그 2회 우승 타이틀을 가지고 있다.\n" +
                    " 라이벌로는 서울, 수원삼성, 울산현대가 대표적이며, 각각 전설매치, 공선전, 현대가더비라고 부른다.",
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        )

        Text(
            text = "우승 기록",
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.DarkGray,
            modifier = Modifier.fillMaxWidth().padding(bottom = 4.dp)
        )
        Text(
            text = "K리그1 (9회/최다 우승)",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        )
        Text(
            text = "-2009년\n-2011년\n-2014년\n-2015년\n-2017년\n-2018년\n-2019년\n-2020년\n2021년\n",
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        )
        Text(
            text = "코리아컵(5회)",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        )
        Text(
            text = "-2000년\n-2003년\n-2005년\n-2020년\n-2022년\n",
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        )
        Text(
            text = "슈퍼컵(1회)",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        )
        Text(
            text = "-2004년\n",
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        )
        Text(
            text = "AFC 챔피언스 리그(2회)",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        )
        Text(
            text = "-2006년\n-2016년\n",
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        )

        // 기타 설명 추가
        Text(
            text = "영구 결번",
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.DarkGray,
            modifier = Modifier.fillMaxWidth().padding(bottom = 4.dp)
        )
        Text(
            text = "-12번: 매드 그린 보이즈\n" +
                    "-20번: 이동국\n",
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        )

        // 버튼 (공식 사이트 연결)
        Button(
            onClick = {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hyundai-motorsfc.com")) // 전북 현대 공식 사이트 URL
                context.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Text(text = "공식 사이트로 이동")
        }
    }
}
