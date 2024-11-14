package info.hermiths.chatapp.ui.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import info.hermiths.chatapp.R
import info.hermiths.chatapp.model.MessageEntity
import info.hermiths.chatapp.ui.presentation.viewmodel.ChatScreenViewModel


@Composable
fun MsgTypeContent(
    message: MessageEntity,
    viewModel: ChatScreenViewModel,
    navController: NavController,
    fromUser: Boolean
) {
    when (message.msgType) {
        1 -> {
            if (fromUser) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (!message.sendSuccess) {
                        Image(painter = painterResource(R.drawable.send_fail),
                            contentDescription = "send fail",
                            modifier = Modifier
                                .size(16.dp)
                                .clickable {
                                    viewModel.reSendMessage(message.clientMsgID)
                                })
                        Spacer(Modifier.width(9.dp))
                    }

                    Surface(
                        color = Color(0xff0054FC).copy(alpha = 0.1f), modifier = Modifier.clip(
                            RoundedCornerShape(
                                topStart = 12.dp, bottomStart = 12.dp, bottomEnd = 12.dp,
                            )
                        )
                    ) {
                        Text(
                            text = message.msgBody,
                            modifier = Modifier.padding(12.dp),
                            style = TextStyle(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.W400,
                                color = Color(0xff000000)
                            )
                        )
                    }
                }
            } else {
                Surface(
                    color = Color.White, modifier = Modifier.clip(
                        RoundedCornerShape(
                            topEnd = 12.dp,
                            bottomStart = 12.dp,
                            bottomEnd = 12.dp,
                        )
                    )
                ) {
                    Text(
                        text = message.msgBody,
                        modifier = Modifier.padding(12.dp),
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.W400,
                            color = Color(0xff000000)
                        )
                    )
                }
            }
        }

        2 -> {
            DecryptedOrNotImageView(message, fullScreen = false, onClick = {
                navController.navigate("${NavRoute.MEDIA_VIEWER}/${message.clientMsgID}")
            })
        }

        3 -> {
            Box(contentAlignment = Alignment.Center) {
                DecryptedOrNotImageView(message, fullScreen = false, onClick = {
                    navController.navigate("${NavRoute.MEDIA_VIEWER}/${message.clientMsgID}")
                })
                Image(
                    painterResource(R.drawable.play),
                    contentDescription = "",
                    modifier = Modifier.size(32.dp)
                )
            }
        }

        else -> {
            Text("Not implement yet. --->>> { ${message.msgType} }")
        }
    }
}
