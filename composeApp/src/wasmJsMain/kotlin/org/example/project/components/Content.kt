package org.example.project.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import myportfolio.composeapp.generated.resources.Res
import myportfolio.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource

@Composable
fun Content() {
    Row {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().weight(1f)
        ) {
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize().weight(0.8f).background(color = Color.LightGray),
                content = {
                    Column(
                        modifier = Modifier
                            .background(color = Color.LightGray)
                            .fillMaxSize(0.7f)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            ContentText(
                                text = "Hi! I Am"
                            )
                            Spacer(modifier = Modifier.width(20.dp))
                            ElevatedButton(
                                colors = ButtonDefaults.buttonColors(Color.Black),
                                modifier = Modifier.wrapContentSize(),
                                onClick = {},
                            ) {
                                NavBarText(
                                    text = "Android Developer",
                                    color = Color.White,
                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp)
                                )
                            }
                        }
                        ContentText(
                            text = "John  Youlong"
                        )
                        Spacer(modifier = Modifier.height(30.dp))
                        ContentText(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            text = "Starting my career as an Android app developer, I was excited but also aware that Jetpack Compose was a new technology for me."
                        )
                        Spacer(modifier = Modifier.height(30.dp))
                        Row(
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Card(
                                modifier = Modifier,
                                colors = CardDefaults.cardColors(Color(0xFFfb8500))
                            ) {
                                NavBarText(
                                    fontWeight = FontWeight.W500,
                                    fontSize = 14.sp,
                                    modifier = Modifier.padding(
                                        horizontal = 24.dp, vertical = 12.dp
                                    ),
                                    color = Color.White,
                                    text = "Hire Me",
                                )
                            }
                            Spacer(modifier = Modifier.width(50.dp))
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                NavBarText(
                                    text = "Projects",
                                )
                                Spacer(modifier = Modifier.width(20.dp))
                                Image(
                                    painterResource(Res.drawable.compose_multiplatform),
                                    contentDescription = null,
                                    modifier = Modifier.size(10.dp)
                                )
                            }
                        }
                    }
                })

            Box(contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize().weight(0.2f).background(color = Color.Black),
                content = {
//                    Row {
//                        Column {
//                            NavBarText(
//                                text = "Projects \nStatistics 2025",
//                                color = Color.White,
//                                fontSize = 18.sp,
//                                fontWeight = FontWeight.SemiBold
//                            )
//                            Card(
//                                modifier = Modifier,
//                                colors = CardDefaults.cardColors(Color(0xFFfb8500))
//                            ) {
//                                NavBarText(
//                                    fontWeight = FontWeight.W400,
//                                    fontSize = 12.sp,
//                                    modifier = Modifier.padding(
//                                        horizontal = 24.dp, vertical = 12.dp
//                                    ),
//                                    color = Color.White,
//                                    text = "Know More",
//                                )
//                            }
//                        }
//                        Column {
//
//                        }
//                    }
                })

        }
        Column(
            modifier = Modifier.fillMaxSize().weight(1f).background(color = Color(0xFFd5bdaf))
        ) {

        }
    }
}

