package com.swarna.docterappointment

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.swarna.docterappointment.ui.theme.DocterAppointmentTheme

class DetailScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DocterAppointmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 640.dp)
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.rectangle4),
            contentDescription = "Rectangle 4",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 11.dp,
                    y = 0.dp)
                .requiredWidth(width = 337.dp)
                .requiredHeight(height = 237.dp)
                .clip(shape = RoundedCornerShape(9.dp)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 49.dp,
                    y = 217.dp)
                .requiredWidth(width = 261.dp)
                .requiredHeight(height = 39.dp)
                .clip(shape = RoundedCornerShape(9.dp))
                .background(color = Color.White))
        Text(
            text = "Dr .Jenny Wilson",
            color = Color.Black,
            style = TextStyle(
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 87.dp,
                    y = 223.dp))
        Text(
            text = "Neurologist",
            color = Color.Black,
            style = TextStyle(
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 101.dp,
                    y = 236.dp)
                .requiredWidth(width = 61.dp)
                .requiredHeight(height = 13.dp))
//        Image(
//            painter = painterResource(id = R.drawable.call),
//            contentDescription = "Vector",
//            modifier = Modifier
//                .fillMaxSize())
        Text(
            text = "5.0",
            color = Color.Black,
            style = TextStyle(
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 255.dp,
                    y = 236.dp)
                .requiredWidth(width = 17.dp)
                .requiredHeight(height = 13.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 34.dp,
                    y = 425.dp)
                .requiredWidth(width = 52.dp)
                .requiredHeight(height = 63.dp)
                .clip(shape = RoundedCornerShape(9.dp))
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 94.dp,
                    y = 425.dp)
                .requiredWidth(width = 51.dp)
                .requiredHeight(height = 63.dp)
                .clip(shape = RoundedCornerShape(9.dp))
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 159.dp,
                    y = 425.dp)
                .requiredWidth(width = 52.dp)
                .requiredHeight(height = 63.dp)
                .clip(shape = RoundedCornerShape(9.dp))
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 225.dp,
                    y = 425.dp)
                .requiredWidth(width = 52.dp)
                .requiredHeight(height = 63.dp)
                .clip(shape = RoundedCornerShape(9.dp))
                .background(color = Color.White))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 284.dp,
                    y = 426.dp)
                .requiredWidth(width = 52.dp)
                .requiredHeight(height = 63.dp)
                .clip(shape = RoundedCornerShape(9.dp))
                .background(color = Color.White))
        Text(
            text = "About ",
            color = Color.Black,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 277.dp))
        Text(
            text = "Date",
            color = Color.Black,
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 16.dp,
                    y = 375.dp)
                .requiredWidth(width = 54.dp)
                .requiredHeight(height = 29.dp))
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color(0xffa49a9a),
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium)
                ) {append("Reference site about Lorem Ipsum, giving information on its origins, as well as a random Lipsum generator")}
                withStyle(style = SpanStyle(
                    color = Color.Black,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium)) {append(" Learn More")}},
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 19.dp,
                    y = 310.9999990463257.dp)
                .requiredWidth(width = 272.dp)
                .requiredHeight(height = 38.dp))
        Text(
            text = "sun 12",
            color = Color.Black,
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 50.dp,
                    y = 428.dp)
                .requiredWidth(width = 26.dp)
                .requiredHeight(height = 36.dp))
        Text(
            text = "mon13",
            color = Color.Black,
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 104.dp,
                    y = 428.dp)
                .requiredWidth(width = 34.dp)
                .requiredHeight(height = 36.dp))
        Text(
            text = "Tue14",
            color = Color.Black,
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 171.dp,
                    y = 428.dp)
                .requiredWidth(width = 28.dp)
                .requiredHeight(height = 36.dp))
        Text(
            text = "Wed15",
            color = Color.Black,
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 234.dp,
                    y = 428.dp)
                .requiredWidth(width = 33.dp)
                .requiredHeight(height = 36.dp))
        Text(
            text = "Thu17",
            color = Color.Black,
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 296.dp,
                    y = 428.dp)
                .requiredWidth(width = 31.dp)
                .requiredHeight(height = 36.dp))
        val context = LocalContext.current
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 9.dp,
                    y = 544.dp)
                .requiredWidth(width = 342.dp)
                .requiredHeight(height = 58.dp)
                .clip(shape = RoundedCornerShape(9.dp))
                .clickable {
                    context.startActivity(Intent(context, PaymentActivity::class.java))
                }
                .background(color = Color(0xff29317e))
             )
        Text(
            text = "Book Appointment",
            color = Color.White,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 74.dp,
                    y = 552.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    DocterAppointmentTheme {
        Greeting2("Android")
    }
}