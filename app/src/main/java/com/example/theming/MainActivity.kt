package com.example.theming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.theming.ui.theme.ThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThemingTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    theming(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun theming(modifier: Modifier = Modifier) {
    val appModifier = modifier
        .fillMaxWidth()
        .padding(8.dp)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text =  "Some text and a button :D",
            style = MaterialTheme.typography.headlineSmall,
            modifier = appModifier
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = appModifier
        )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary) // Fixed Button color property
        ) {
            Text("Orange button")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ThemingTheme {
        theming() // Fixed preview function
    }
}
