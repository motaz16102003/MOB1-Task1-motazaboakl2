package com.example.taskdone

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskDoneScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = null
        )
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = "Nice work!",
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}

@Preview(name = "Light", showBackground = true, showSystemUi = true)
@Preview(name = "Dark", showBackground = true, showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun TaskDonePreview() {
    TaskDoneTheme {
        Surface(color = MaterialTheme.colorScheme.background) { TaskDoneScreen() }
    }
}
