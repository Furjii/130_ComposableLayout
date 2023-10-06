package com.example.pertemuan_2

import android.os.Bundle
import android.os.Message
import android.text.style.LineHeightSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan_2.ui.theme.Pertemuan_2Theme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pertemuan_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TampilLayar(
                        pesan = getString(R.string.greeting),
                        dari = getString(R.string.name)
                    )
                }
            }
        }
    }
}

@Composable
fun TampilText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center, modifier = modifier
    ) {
        Text(
            color = Color.Black,
            text = message,
            fontSize = 80.sp,
            lineHeight = 110.sp,
            textAlign = TextAlign.Center
        )

        Text(
            color = Color.Blue,
            text = from,
            fontSize = 70.sp,
            modifier = modifier
                .padding(15.dp)
                .align(alignment = Alignment.CenterHorizontally)

        )

    }
}

@Composable
fun TampilLayar(pesan: String, dari: String) {
    val image = painterResource(R.drawable.img)
    Box {

        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.fillMaxSize()
        )
        TampilText(
            message = pesan, from = dari, modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}