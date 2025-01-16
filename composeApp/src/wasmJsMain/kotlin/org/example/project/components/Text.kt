package org.example.project.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun ContentText(
    modifier: Modifier = Modifier,
    text: String,
    fontWeight: FontWeight = FontWeight.ExtraBold,
    color: Color = Color.Black,
    fontSize: TextUnit = 72.sp,
    textAlign: TextAlign = TextAlign.Start
) {
    Text(
        modifier = modifier,
        text = text,
        fontWeight = fontWeight,
        fontSize = fontSize,
        textAlign = textAlign,
        color = color
    )
}


@Composable
fun NavBarText(
    modifier: Modifier = Modifier,
    fontWeight: FontWeight = FontWeight.SemiBold,
    color: Color = Color.Black,
    fontSize: TextUnit = 16.sp,
    textAlign: TextAlign = TextAlign.Center,
    text: String
) {
    Text(
        modifier = modifier,
        text = text,
        fontWeight = fontWeight,
        color = color,
        fontSize = fontSize,
        textAlign = textAlign
    )
}