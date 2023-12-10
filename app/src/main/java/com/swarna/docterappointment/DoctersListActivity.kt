package com.swarna.docterappointment

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.swarna.docterappointment.ui.theme.DocterAppointmentTheme

class DoctersListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DocterAppointmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 640.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-8).dp,
                    y = (-107).dp)
                .requiredWidth(width = 375.dp)
                .requiredHeight(height = 812.dp)
                .background(color = Color.White)
        ) {
            Spacer(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 72.dp,
                        y = 0.dp)
                    .requiredSize(size = 24.dp))
            Spacer(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 48.dp,
                        y = 0.dp)
                    .requiredSize(size = 24.dp))
            Spacer(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 48.dp,
                        y = 747.dp)
                    .requiredSize(size = 24.dp))
            Text(
                text = "Doctor List",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 22.dp,
                        y = 339.dp))
            Image(
                painter = painterResource(id = R.drawable.rectangle1),
                contentDescription = "Rectangle 1",
                contentScale = ContentScale.Inside,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 34.dp,
                        y = 131.dp)
                    .requiredWidth(width = 308.dp)
                    .requiredHeight(height = 190.dp))

            val localContext = LocalContext.current
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 754.dp)
                    .requiredWidth(width = 375.dp)
                    .requiredHeight(height = 63.dp)
            )

            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 9.dp,
                        y = 368.dp)
                    .requiredWidth(width = 346.dp)
                    .requiredHeight(height = 111.dp)
                    .clip(shape = RoundedCornerShape(9.dp))
                    .background(color = Color.White)

                    .clickable {
                        localContext.startActivity(
                            Intent(localContext, DetailScreenActivity::class.java)
                        )
                    }
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 9.dp,
                        y = 491.dp)
                    .requiredWidth(width = 346.dp)
                    .requiredHeight(height = 111.dp)
                    .clip(shape = RoundedCornerShape(9.dp))
                    .background(color = Color.White)
                    .clickable {
                        localContext.startActivity(
                            Intent(localContext, DetailScreenActivity::class.java)
                        )
                    }
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 9.dp,
                        y = 628.dp)
                    .requiredWidth(width = 346.dp)
                    .requiredHeight(height = 111.dp)
                    .clip(shape = RoundedCornerShape(9.dp))
                    .background(color = Color.White))

//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.healthiconsuiuserprofile),
//                contentDescription = "healthicons:ui-user-profile",
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 321.dp,
//                        y = 758.dp)
//                    .requiredWidth(width = 28.dp)
//                    .requiredHeight(height = 25.dp))

//            Image(
//                painter = painterResource(id = R.drawable.materialsymbolsecgheart),
//                contentDescription = "material-symbols:ecg-heart",
//                colorFilter = ColorFilter.tint(Color.White),
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 128.dp,
//                        y = 758.dp)
//                    .requiredSize(size = 24.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 56.dp,
                        y = 282.dp)
                    .requiredWidth(width = 261.dp)
                    .requiredHeight(height = 39.dp)
                    .clip(shape = RoundedCornerShape(9.dp))
                    .background(color = Color.White))

//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.rectangle2),
                contentDescription = "Rectangle 2",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 19.dp,
                        y = 378.dp)
                    .requiredWidth(width = 121.dp)
                    .requiredHeight(height = 90.dp)
                    .clip(shape = RoundedCornerShape(9.dp)))
            Image(
                painter = painterResource(id = R.drawable.rectangle16),
                contentDescription = "Rectangle 16",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 19.dp,
                        y = 502.dp)
                    .requiredWidth(width = 121.dp)
                    .requiredHeight(height = 90.dp)
                    .clip(shape = RoundedCornerShape(9.dp)))
            Text(
                text = "Dr. Aksar Deb",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 161.dp,
                        y = 392.dp)
                    .requiredWidth(width = 156.dp))
            Text(
                text = "Dr. Akhtar Deb",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 161.dp,
                        y = 516.dp)
                    .requiredWidth(width = 156.dp))
            Text(
                text = "Dentist Apollo",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 161.dp,
                        y = 409.9999990463257.dp)
                    .requiredWidth(width = 109.dp))
            Text(
                text = "Dentist Apollo",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 161.dp,
                        y = 534.dp)
                    .requiredWidth(width = 109.dp))
            Text(
                text = "Atianta Ga 31399",
                color = Color(0xffa49a9a),
                style = TextStyle(
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 161.dp,
                        y = 421.99999952316284.dp)
                    .requiredWidth(width = 109.dp))
            Text(
                text = "Atianta Ga 31399",
                color = Color(0xffa49a9a),
                style = TextStyle(
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 161.dp,
                        y = 546.dp)
                    .requiredWidth(width = 109.dp))
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
            Text(
                text = "Online Doctor",
                color = Color.Black,
                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 103.dp, y = 68.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 307.dp, y = 418.9999987605436.dp)
                    .requiredWidth(width = 35.dp)
                    .requiredHeight(height = 33.dp)
                    .clip(shape = RoundedCornerShape(9.dp))
                    .background(color = Color(0xff29317e)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 306.9998779296875.dp, y = 543.dp)
                    .requiredWidth(width = 35.dp)
                    .requiredHeight(height = 33.dp)
                    .clip(shape = RoundedCornerShape(9.dp))
                    .background(color = Color(0xff29317e)))
            Spacer(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 313.dp, y = 437.99999809265137.dp)
                    .requiredSize(size = 24.dp))
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
            Text(
                text = "5.0(3259 Review)",
                color = Color(0xffa49a9a),
                style = TextStyle(
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 245.dp,
                        y = 458.dp))
            Text(
                text = "5.0(3259 Review)",
                color = Color(0xffa49a9a),
                style = TextStyle(
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 245.dp,
                        y = 582.dp))
            Text(
                text = "5.0(3259 Review)",
                color = Color(0xffa49a9a),
                style = TextStyle(
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 236.dp,
                        y = 717.dp))
            Image(
                painter = painterResource(id = R.drawable.rectangle18),
                contentDescription = "Rectangle 18",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 9.dp,
                        y = 639.dp)
                    .requiredWidth(width = 121.dp)
                    .requiredHeight(height = 90.dp)
                    .clip(shape = RoundedCornerShape(9.dp)))
            Text(
                text = "Dentist Apollo",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 151.dp,
                        y = 671.dp)
                    .requiredWidth(width = 109.dp))
            Text(
                text = "Atianta Ga 31399",
                color = Color(0xffa49a9a),
                style = TextStyle(
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 151.dp,
                        y = 683.dp)
                    .requiredWidth(width = 109.dp))
//            Image(
//                painter = painterResource(id = R.drawable.vector),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 296.9998779296875.dp,
                        y = 680.dp)
                    .requiredWidth(width = 35.dp)
                    .requiredHeight(height = 33.dp)
                    .clip(shape = RoundedCornerShape(9.dp))
                    .background(color = Color(0xff29317e)))
//            Image(
//                painter = painterResource(id = R.drawable.call),
//                contentDescription = "Vector",
//                modifier = Modifier
//                    .fillMaxSize())
            Text(
                text = "Dr. ASLAM ALI",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 140.dp,
                        y = 653.dp)
                    .requiredWidth(width = 156.dp))
            StatusBar(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 3.dp))
        }
    }
}

@Composable
fun StatusBar(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 375.dp)
            .requiredHeight(height = 44.dp)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 335.333251953125.dp,
                    y = 17.333343505859375.dp)
                .requiredWidth(width = 24.dp)
                .requiredHeight(height = 11.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopEnd)
                    .offset(x = (-2.3280372619628906).dp,
                        y = 0.dp)
                    .requiredWidth(width = 22.dp)
                    .requiredHeight(height = 11.dp)
                    .clip(shape = RoundedCornerShape(2.6666667461395264.dp))
                    .border(border = BorderStroke(1.dp, Color(0xff424f5e)),
                        shape = RoundedCornerShape(2.6666667461395264.dp)))
//            Image(
//                painter = painterResource(id = R.drawable.cap),
//                contentDescription = "Cap",
//                alpha = 0.4f,
//                modifier = Modifier
//                    .align(alignment = Alignment.TopEnd)
//                    .offset(x = 7.152557373046875e-7.dp,
//                        y = 3.666656494140625.dp)
//                    .requiredWidth(width = 1.dp)
//                    .requiredHeight(height = 4.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopEnd)
                    .offset(x = (-4.328037261962891).dp,
                        y = 2.dp)
                    .requiredWidth(width = 18.dp)
                    .requiredHeight(height = 7.dp)
                    .clip(shape = RoundedCornerShape(1.3333333730697632.dp))
                    .background(color = Color(0xff424f5e)))
        }
//        Image(
//            painter = painterResource(id = R.drawable.wifi),
//            contentDescription = "Wifi",
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 315.1595458984375.dp,
//                    y = 17.330657958984375.dp)
//                .requiredWidth(width = 15.dp)
//                .requiredHeight(height = 11.dp))
//        Image(
//            painter = painterResource(id = R.drawable.cellularconnection),
//            contentDescription = "Cellular Connection",
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 293.218017578125.dp,
//                    y = 17.666656494140625.dp)
//                .requiredWidth(width = 17.dp)
//                .requiredHeight(height = 11.dp))
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.944149017333984.dp,
                    end = 300.199462890625.dp,
                    top = 7.dp,
                    bottom = 16.dp)
        ) {
            Text(
                text = "9:41",
                color = Color(0xff424f5e),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 15.sp,
                    letterSpacing = (-0.3).sp),
                modifier = Modifier
                    .align(alignment = Alignment.CenterStart)
                    .offset(x = 0.dp,
                        y = 5.5.dp)
                    .fillMaxWidth())
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DocterAppointmentTheme {
        Greeting("Android")
    }
}