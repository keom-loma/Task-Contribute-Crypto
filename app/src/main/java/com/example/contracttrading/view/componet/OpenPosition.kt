package com.example.contracttrading.view.componet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.contracttrading.R

@Composable
fun OpenPosition() {
	val startColor = colorResource(id = R.color.no_data_gradient1)
	Surface(
		modifier = Modifier
			.fillMaxSize()
			.background(
				color = contentColorFor(backgroundColor = Color.Transparent)
			)


	) {
		Box(
			modifier = Modifier
				.background(
					brush = Brush.linearGradient(
						colors = listOf(startColor, startColor),
						start = Offset.Zero,
						end = Offset.Infinite
					)
				)
				.padding(
					8.dp
				)
		) {
			Column {
				BuildCardContractTrading(
					redColor = R.color.colorBTCActive,
					greenColor = R.color.colorBTCDeActive,
					percentage = 0.0
				)
				Row(
					modifier = Modifier
						.fillMaxWidth()
						.padding(horizontal = 0.dp, vertical = 4.dp),
					verticalAlignment = Alignment.CenterVertically
				) {

					BuildLeftSideMarketOther()
					Box(
						modifier = Modifier
							.fillMaxWidth()
							.fillMaxSize()
							.weight(1f)
							.background(color = colorResource(id = R.color.no_data_gradient1))
					) {
						Text(text = "Jupyter One")
					}
				}
			}
		}
	}
}
