package com.example.article

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ArticleScreen(modifier: Modifier = Modifier) {
    Column(modifier) {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                "Compose simplifies and accelerates UI development on Android with less code, " +
                "powerful tools, and intuitive Kotlin APIs.",
            textAlign = TextAlign.Justify,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. " +
                "You call Compose functions to say what elements you want and the Compose " +
                "compiler does the rest. Compose is built around composable functions. " +
                "These functions let you define your app's UI programmatically because they " +
                "let you describe how it should look and provide data dependencies, rather " +
                "than focus on the process of the UI's construction.",
            textAlign = TextAlign.Justify,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(name = "Light", showBackground = true, showSystemUi = true)
@Preview(name = "Dark", showBackground = true, showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ArticlePreview() {
    ArticleTheme {
        Surface(color = MaterialTheme.colorScheme.background) { ArticleScreen() }
    }
}
