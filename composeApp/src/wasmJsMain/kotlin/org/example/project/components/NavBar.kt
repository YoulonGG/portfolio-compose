package org.example.project.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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

    var isOnHome by remember { mutableStateOf(false) }
    var isOnAbout by remember { mutableStateOf(false) }
    var isOnWork by remember { mutableStateOf(false) }
    var isOnContact by remember { mutableStateOf(false) }

    var isHomeSelected by remember { mutableStateOf(false) }
    var isOnAboutSelected by remember { mutableStateOf(false) }
    var isOnWorkSelected by remember { mutableStateOf(false) }
    var isOnContactSelected by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        isOnHome = true
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.padding(horizontal = 100.dp).padding(vertical = 30.dp)
    ) {
        Text(
            text = title,
            fontSize = 32.sp,
            color = Color.Black,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraBold
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth().weight(1f).padding(horizontal = 200.dp)
        ) {
            SmallText(
                text = CommonStringRes.HOME,
                color = if (isOnHome || isHomeSelected) Color(0xFF0077b6) else Color.Black,
                modifier = Modifier
                    .clickable {
                        isHomeSelected = true
                        isOnWorkSelected = false
                        isOnAboutSelected = false
                        isOnContactSelected = false
                    }
                    .pointerInput(Unit) {
                        awaitPointerEventScope {
                            while (true) {
                                val event = awaitPointerEvent()
                                when (event.type) {
                                    PointerEventType.Enter -> {
                                        isOnHome = true
                                    }

                                    PointerEventType.Exit -> {
                                        isOnHome = false
                                    }
                                }
                            }
                        }
                    }
            )
            SmallText(
                text = CommonStringRes.ABOUT,
                color = if (isOnAbout || isOnAboutSelected) Color(0xFF0077b6) else Color.Black,
                modifier = Modifier
                    .clickable {
                        isOnAboutSelected = true
                        isOnWorkSelected = false
                        isOnContactSelected = false
                        isHomeSelected = false
                    }
                    .pointerInput(Unit) {
                        awaitPointerEventScope {
                            while (true) {
                                val event = awaitPointerEvent()
                                when (event.type) {
                                    PointerEventType.Enter -> {
                                        isOnAbout = true
                                    }

                                    PointerEventType.Exit -> {
                                        isOnAbout = false
                                    }
                                }
                            }
                        }
                    }
            )
            SmallText(
                text = CommonStringRes.WORK,
                color = if (isOnWork || isOnWorkSelected) Color(0xFF0077b6) else Color.Black,
                modifier = Modifier
                    .clickable {
                        isOnWorkSelected = true
                        isHomeSelected = false
                        isOnAboutSelected = false
                        isOnContactSelected = false
                    }
                    .pointerInput(Unit) {
                        awaitPointerEventScope {
                            while (true) {
                                val event = awaitPointerEvent()
                                when (event.type) {
                                    PointerEventType.Enter -> {
                                        isOnWork = true
                                    }

                                    PointerEventType.Exit -> {
                                        isOnWork = false
                                    }
                                }
                            }
                        }
                    }
            )
            SmallText(
                text = CommonStringRes.CONTACT,
                color = if (isOnContact || isOnContactSelected) Color(0xFF0077b6) else Color.Black,
                modifier = Modifier
                    .clickable {
                        isOnContactSelected = true
                        isHomeSelected = false
                        isOnAboutSelected = false
                        isOnWorkSelected = false
                    }
                    .pointerInput(Unit) {
                        awaitPointerEventScope {
                            while (true) {
                                val event = awaitPointerEvent()
                                when (event.type) {
                                    PointerEventType.Enter -> {
                                        isOnContact = true
                                    }

                                    PointerEventType.Exit -> {
                                        isOnContact = false
                                    }
                                }
                            }
                        }
                    }
            )
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