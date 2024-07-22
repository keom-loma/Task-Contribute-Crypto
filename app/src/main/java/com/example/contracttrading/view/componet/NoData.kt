package com.example.contracttrading.view.componet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contracttrading.R


@Composable
fun NoData(resourceId: Int, contentDescription: String?, labelTitle: String) {
	val startColor = colorResource(id = R.color.no_data_gradient1)
	val endColor = colorResource(id = R.color.no_data_gradient2)
	Box(
		modifier = Modifier
			.fillMaxSize()
			.background(
				brush = Brush.linearGradient(
//					colors = listOf(startColor, endColor),
					colors = listOf(startColor, startColor),
					start = Offset.Zero,
					end = Offset.Infinite
				)
			)
			.padding(
				top = 100.dp
			),

		contentAlignment = Alignment.Center,

		) {
		Column(
			horizontalAlignment = Alignment.CenterHorizontally,

			) {
			LocalSvgImage(resourceId = resourceId, contentDescription = contentDescription)
			Spacer(modifier = Modifier.padding(top = 16.dp))
			Text(
				text = labelTitle.toString(),
				textAlign = TextAlign.Center,
				style = MaterialTheme.typography.h4.copy(
					color = Color.White,
					fontSize = 12.sp,
					fontWeight = FontWeight.W400,

					)
			)
		}
	}
}