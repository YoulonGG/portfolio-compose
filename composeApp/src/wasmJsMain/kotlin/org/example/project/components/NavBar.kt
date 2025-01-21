package org.example.project.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.CommonStringRes

@Composable
fun NavBar(
    title: String,
) {
    var hoveredTab by remember { mutableStateOf<String?>(null) }
    var selectedTab by remember { mutableStateOf(CommonStringRes.HOME) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(horizontal = 100.dp)
            .padding(vertical = 30.dp)
    ) {
        Text(
            text = title,
            fontSize = 40.sp,
            color = Color(0xFFf0be6d),
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            listOf(
                CommonStringRes.HOME,
                CommonStringRes.WORK,
                CommonStringRes.CONTACT
            ).forEach { tab ->
                Spacer(modifier = Modifier.width(20.dp))
                SmallText(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    text = tab,
                    color = if (hoveredTab == tab || selectedTab == tab) Color.White else Color.Gray,
                    modifier = Modifier
                        .clickable {
                            selectedTab = tab
                        }
                        .pointerInput(Unit) {
                            awaitPointerEventScope {
                                while (true) {
                                    val event = awaitPointerEvent()
                                    when (event.type) {
                                        PointerEventType.Enter -> hoveredTab = tab
                                        PointerEventType.Exit -> if (hoveredTab == tab) hoveredTab = null
                                    }
                                }
                            }
                        }
                )
                Spacer(modifier = Modifier.width(20.dp))
            }
        }
        Card(
            modifier = Modifier.clip(shape = RoundedCornerShape(5.dp)),
            border = BorderStroke(1.dp, color = Color.Black),
            colors = CardDefaults.cardColors(Color.Transparent)
        ) {
            MiddleText(
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                text = "Let's Chat"
            )
        }
    }
}