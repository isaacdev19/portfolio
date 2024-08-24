package com.example.rickmorty.ui.main.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rickmorty.R

@Preview
@Composable
fun UpperPanel() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth().padding(12.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.rickmorty),
            contentDescription = "Upper panel image",
            Modifier.padding(start = 20.dp).size(80.dp)
        )
        Text(
            text = "CHARACTERS",
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(top = 20.dp),
        )
    }
}