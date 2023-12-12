package com.swarna.docterappointment.screens

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.provider.ContactsContract.Profile
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.swarna.docterappointment.DoctersListActivity
import com.swarna.docterappointment.ProfileActivity
import com.swarna.docterappointment.R
import com.swarna.docterappointment.components.AppToolbar
import com.swarna.docterappointment.components.NavigationDrawerBody
import com.swarna.docterappointment.components.NavigationDrawerHeader

import com.swarna.docterappointment.data.home.HomeViewModel
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = viewModel()) {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    homeViewModel.getUserData()

    Scaffold(
        scaffoldState = scaffoldState,

        topBar = {
            AppToolbar(toolbarTitle = stringResource(id = R.string.home),
                logoutButtonClicked = {
                    homeViewModel.logout()
                },
                navigationIconClicked = {
                    coroutineScope.launch {
                        scaffoldState.drawerState.open()
                    }
                }
            )
        },
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
        drawerContent = {
            NavigationDrawerHeader(homeViewModel.emailId.value)
            NavigationDrawerBody(navigationDrawerItems = homeViewModel.navigationItemsList,
                onNavigationItemClicked = {
                    Log.d("ComingHere","inside_NavigationItemClicked")
                    Log.d("ComingHere","${it.itemId} ${it.title}")
                })
        }

    ) { paddingValues ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(paddingValues)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {

                Box(
                    modifier = Modifier
                        .requiredWidth(width = 360.dp)
                        .requiredHeight(height = 640.dp)
                        .background(color = Color.White)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = (-8).dp,
                                y = (-106).dp)
                            .requiredWidth(width = 375.dp)
                            .requiredHeight(height = 812.dp)
                            .background(color = Color.White)
                    ) {
                        Spacer(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 48.dp,
                                    y = 0.dp)
                                .requiredSize(size = 24.dp))
                        Spacer(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 51.dp,
                                    y = 752.dp)
                                .requiredSize(size = 24.dp))

                        val context = LocalContext.current

//                        if (Build.VERSION.SDK_INT >= 23) {

                        Text(
                            text = "Home",
                            color = Color.Black,
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 130.dp,
                                    y = 59.dp))

                        val constext = LocalContext.current

                        Image(
                            painter = painterResource(id = R.drawable.baseline_person_add_24),
                            contentDescription = "Rectangle 1",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 34.dp,
                                    y = 220.dp)
                                .requiredWidth(width = 350.dp)
                                .requiredHeight(height = 151.dp))
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 232.dp,
                                    y = 438.9999990463257.dp)
                                .requiredWidth(width = 114.dp)
                                .requiredHeight(height = 33.dp)
                                .clip(shape = RoundedCornerShape(9.dp))
                                .background(color = Color(0xff29317e)))
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 232.dp,
                                    y = 562.dp)
                                .requiredWidth(width = 114.dp)
                                .requiredHeight(height = 33.dp)
                                .clip(shape = RoundedCornerShape(9.dp))
                                .background(color = Color(0xff29317e)))
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 232.dp,
                                    y = 685.dp)
                                .requiredWidth(width = 114.dp)
                                .requiredHeight(height = 33.dp)
                                .clip(shape = RoundedCornerShape(9.dp))
                                .background(color = Color(0xff29317e)))
                        
                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 56.dp,
                                    y = 282.dp)
                                .requiredWidth(width = 261.dp)
                                .clickable {
                                    constext.startActivity(Intent(constext,ProfileActivity::class.java))
                                }
                                .requiredHeight(height = 39.dp)
                                .clip(shape = RoundedCornerShape(9.dp))
                                .background(color = Color.White))
                        Text(
                            text = "Take A Profile Pic",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 15.sp),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 115.dp,
                                    y = 292.dp))

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
                            painter = painterResource(id = R.drawable.rectangle11),
                            contentDescription = "Rectangle 11",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 19.dp,
                                    y = 501.dp)
                                .requiredWidth(width = 121.dp)
                                .requiredHeight(height = 90.dp)
                                .clip(shape = RoundedCornerShape(9.dp)))
                        Image(
                            painter = painterResource(id = R.drawable.rectangle15),
                            contentDescription = "Rectangle 15",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 19.dp,
                                    y = 624.dp)
                                .requiredWidth(width = 121.dp)
                                .requiredHeight(height = 90.dp)
                                .clip(shape = RoundedCornerShape(9.dp)))
                        Text(
                            text = "Health Care Hospital",
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
                            text = "Apollo Hospital",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 161.dp,
                                    y = 515.dp)
                                .requiredWidth(width = 156.dp))
                        Text(
                            text = "Sarjan Hospital",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 161.dp,
                                    y = 638.dp)
                                .requiredWidth(width = 156.dp))
                        Text(
                            text = "Lucknow, GA 30155",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 161.dp,
                                    y = 410.dp)
                                .requiredWidth(width = 109.dp))
                        Text(
                            text = "Delhi, GA 30199",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 161.dp,
                                    y = 533.dp)
                                .requiredWidth(width = 109.dp))
                        Text(
                            text = "Allahabad, GA 30139",
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 161.dp,
                                    y = 656.dp)
                                .requiredWidth(width = 133.dp))
                        Text(
                            text = "12:00Am -12:00PM",
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
                            text = "12:00Am -12:00PM",
                            color = Color(0xffa49a9a),
                            style = TextStyle(
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 161.dp,
                                    y = 545.dp)
                                .requiredWidth(width = 109.dp))
                        Text(
                            text = "12:00Am -12:00PM",
                            color = Color(0xffa49a9a),
                            style = TextStyle(
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 161.dp,
                                    y = 668.dp)
                                .requiredWidth(width = 109.dp))
                        val localContext = LocalContext.current

                        Text(
                            text = "Appointment",
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 241.dp,
                                    y = 446.dp)
                                .requiredWidth(width = 93.dp)
                                .clickable {
                                    localContext.startActivity(
                                        Intent(localContext, DoctersListActivity::class.java)
                                    )
                                }
                        )
                        Text(
                            text = "Appointment",
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 241.dp,
                                    y = 569.dp)
                                .requiredWidth(width = 93.dp)
                                .clickable {
                                    localContext.startActivity(
                                        Intent(localContext, DoctersListActivity::class.java)
                                    )
                                }
                        )
                        Text(
                            text = "Appointment",
                            color = Color.White,
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Medium),
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 241.dp,
                                    y = 692.dp)
                                .requiredWidth(width = 93.dp)

                                .clickable {
                                    localContext.startActivity(
                                        Intent(localContext, DoctersListActivity::class.java)
                                    )
                                }

                        )


                        Image(
                            painter = painterResource(id = R.drawable.symbols_alarm),
                            contentDescription = "material-symbols:alarm",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 145.dp,
                                    y = 424.99999952316284.dp)
                                .requiredWidth(width = 16.dp)
                                .requiredHeight(height = 13.dp))
                        Image(
                            painter = painterResource(id = R.drawable.symbols_alarm),
                            contentDescription = "material-symbols:alarm",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 145.dp,
                                    y = 548.dp)
                                .requiredWidth(width = 16.dp)
                                .requiredHeight(height = 13.dp))
                        Image(
                            painter = painterResource(id = R.drawable.symbols_alarm),
                            contentDescription = "material-symbols:alarm",
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 145.dp,
                                    y = 671.dp)
                                .requiredWidth(width = 16.dp)
                                .requiredHeight(height = 13.dp))
//                        StatusBar(
//                            modifier = Modifier
//                                .align(alignment = Alignment.TopStart)
//                                .offset(x = 3.dp, y = (-1).dp))
                    }
                }
            }
        }
    }
}



/*@Composable
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
}*/

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}