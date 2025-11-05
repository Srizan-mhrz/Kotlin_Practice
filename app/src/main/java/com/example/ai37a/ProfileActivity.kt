package com.example.ai37a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ai37a.ui.theme.AI37ATheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileBody()

        }
    }
}

@Composable
fun ProfileBody() {
    Scaffold { padding->
        Column (
             modifier = Modifier.fillMaxSize()
                .background(color = Color.White)
                .padding(padding)
        ){
            Row(
                horizontalArrangement =Arrangement.SpaceBetween ,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_keyboard_arrow_left_24),
                    contentDescription = null
                )
                Text("Shrijan Maharjan", style = TextStyle(fontWeight = FontWeight.ExtraBold), fontSize = 20.sp)
                Icon(
                    painter = painterResource(R.drawable.baseline_more_horiz_24),
                    contentDescription = null

                    )
            }
            Row (
                horizontalArrangement =Arrangement.SpaceAround ,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ) {
               Image(
                   painter = painterResource(R.drawable.img_1),
                   contentDescription = null,
                   modifier = Modifier.height(100.dp).width(100.dp).clip(CircleShape),
                   contentScale = ContentScale.Crop
               )
                Column (horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("1K", style = TextStyle(fontWeight = FontWeight.ExtraBold))
                    Text("Posts",style = TextStyle(fontWeight = FontWeight.ExtraBold))
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("3M",style = TextStyle(fontWeight = FontWeight.ExtraBold))
                    Text("Followers",style = TextStyle(fontWeight = FontWeight.ExtraBold))
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Text("275",style = TextStyle(fontWeight = FontWeight.ExtraBold))
                    Text("Following",style = TextStyle(fontWeight = FontWeight.ExtraBold))
                }
            }
            Column(
                modifier = Modifier.padding(top = 15.dp, start = 20.dp)
            ) {
                Text("Love and Peace things I never got.\nError 404 : Bio not found\nNot a secret, just not your business.\nShe lives the poetry she cannot write ",style = TextStyle(fontWeight = FontWeight.SemiBold))

            }
            Row( modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
            ) {
                Button(onClick = {}, modifier = Modifier.width(150.dp)) {
                    Text("Follow")
                }
                Button(onClick = {}, modifier = Modifier.width(150.dp)) {
                    Text("Message")
                }
                Button(onClick = {}, modifier = Modifier.width(70.dp)) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_more_horiz_24),
                        contentDescription = null

                    )
                    }


            }

        }

    }

}

@Preview
@Composable
fun ProfileBodyPreview() {
    ProfileBody()


}