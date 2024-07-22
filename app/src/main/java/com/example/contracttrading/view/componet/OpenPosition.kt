package com.example.contracttrading.view.componet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun OpenPosition() {
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.background(
				color = contentColorFor(backgroundColor = Color.Red)
			)

	) {
		// Text(text = "Hello world")
		BuildCardContractTrading()
	}
}