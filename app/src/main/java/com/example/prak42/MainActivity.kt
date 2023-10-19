package com.example.prak42

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prak42.ui.theme.Prak42Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Prak42Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(40.dp),
            horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(
            text = "Ammar Fatwa Syuhada",
            fontSize = 40.sp)
        Spacer(modifier = Modifier.padding(10.dp))
        BoxHeader()
        Spacer(modifier = Modifier.padding(20.dp))
        Lokasi()
        Spacer(modifier = Modifier.padding(20.dp))
        BoxHeader1()

    }
}

@Composable
fun BoxHeader(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Cyan))
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()) 
        {
            Image(
                painter = painterResource(id = R.drawable.background), 
                contentDescription = "", 
                modifier = Modifier.size(200.dp) )
            Text(
                text = "Rain", 
                fontSize = 25.sp,
                modifier = Modifier.padding(10.dp)
                )
        }
    }
}

@Composable
fun Lokasi(){
    Text(
        text = "19 C",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        )
    Row {
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_location_on_24),
            contentDescription = "",
            modifier = Modifier.padding(5.dp)
            )
        Text(
            text = "Yogyakarta",
            fontSize = 30.sp,
            )
    }
    Text(
        text = "Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp
        )
}

@Composable
fun BoxHeader1(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Cyan))
    {
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
            ) {
            Column(
                modifier = Modifier
                    .padding(30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                Text(
                    text = "Humidity",
                    textAlign = TextAlign.Center
                    )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "98%",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                    )
                Spacer(modifier = Modifier.padding(20.dp))
                Text(
                    text = "04.00",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                    )

            }

        }
        Row(
            horizontalArrangement =Arrangement.End,
            modifier = Modifier.fillMaxWidth()
            ) {
            Column(
                modifier = Modifier
                    .padding(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
                ) {
                Text(
                    text = "UV Index",
                    textAlign = TextAlign.Center
                    )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "90%",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                    )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Sunrise",
                    textAlign = TextAlign.Center
                    )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "05.00 AM",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                    )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Prak42Theme {
        Home()
    }
}