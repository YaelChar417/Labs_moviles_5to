package com.app.pokedexapp.presentation.common.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ErrorView(
    message: String,
    onRetry: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(
            imageVector = Icons.Default.Warning,
            contentDescription = null,
            modifier = Modifier.size(48.dp),
            tint = MaterialTheme.colorScheme.error,
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = message,
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = onRetry) {
            Text(text = "Retry")
        }
    }
}

// --------------------------------------------------------
// Preview de la vista de error
// --------------------------------------------------------
@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Composable
fun ErrorViewPreview() {
    MaterialTheme {
        ErrorView(
            message = "Something went wrong",
            onRetry = { },
        )
    }
}

// --------------------------------------------------------
// Preview en modo oscuro
// --------------------------------------------------------
@Preview(showBackground = true)
@Composable
fun ErrorViewDarkPreview() {
    MaterialTheme {
        ErrorView(
            message = "Network connection failed",
            onRetry = { },
        )
    }
}

// --------------------------------------------------------
// Preview con mensaje largo
// --------------------------------------------------------
@Preview(
    showBackground = true,
    widthDp = 200,
)
@Composable
fun ErrorViewLongMessagePreview() {
    MaterialTheme {
        ErrorView(
            message = "A very long message that should wrap in many lines to test the UI",
            onRetry = { },
        )
    }
}

// --------------------------------------------------------
// Preview con diferentes tamaños
// --------------------------------------------------------
@Preview(
    showBackground = true,
    widthDp = 400,
    heightDp = 200,
)
@Composable
fun ErrorViewWidePreview() {
    MaterialTheme {
        ErrorView(
            message = "Error in landscape mode",
            onRetry = { },
            modifier = Modifier.fillMaxSize(),
        )
    }
}
