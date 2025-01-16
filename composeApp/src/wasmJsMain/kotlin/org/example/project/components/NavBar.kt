package org.example.project.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NavBar(
    title: String,
) {

    var isOnHome by remember { mutableStateOf(false) }
    var isOnAbout by remember { mutableStateOf(false) }
    var isOnWork by remember { mutableStateOf(false) }
    var isOnContact by remember { mutableStateOf(false) }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.padding(horizontal = 100.dp).padding(vertical = 30.dp)
    ) {
        Text(
            text = title,
            fontSize = 32.sp,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth().weight(1f).padding(horizontal = 100.dp)
        ) {
            NavBarText(
                text = "Home",
                color = if (isOnHome) Color.Magenta else Color.Black,
                modifier = Modifier
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
            NavBarText(
                text = "About",
                color = if (isOnAbout) Color.Magenta else Color.Black,
                modifier = Modifier
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
            NavBarText(
                text = "Work",
                color = if (isOnWork) Color.Magenta else Color.Black,
                modifier = Modifier
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
            NavBarText(
                text = "Contact",
                color = if (isOnContact) Color.Magenta else Color.Black,
                modifier = Modifier
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
            NavBarText(
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                text = "Let's Chat"
            )
        }
    }
}



