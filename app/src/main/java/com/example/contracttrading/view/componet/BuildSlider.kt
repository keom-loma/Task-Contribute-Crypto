package com.example.contracttrading.view.componet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.contracttrading.R

@Composable
fun BuildSlider() {
	var sliderPosition by remember { mutableFloatStateOf(0f) }
	Column {
		Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
			Text(
				text = "0%",
				style = TextStyle(
					color = Color.White,
					fontSize = 12.sp,
					fontWeight = FontWeight.W400
				)
			)
			Text(
				text = "${sliderPosition.toInt()}%",
				style = TextStyle(
					color = Color.White,
					fontSize = 12.sp,
					fontWeight = FontWeight.W400
				)
			)
		}
		Slider(
			value = sliderPosition,
			onValueChange = { sliderPosition = it },
			valueRange = 0f..100f,
			steps = 100,
			modifier = Modifier
				.fillMaxWidth()
				.background(color = Color.Transparent),
			colors = SliderDefaults.colors(
				activeTickColor = colorResource(id = R.color.colorBTCActive),
				inactiveTickColor = Color.White,
				thumbColor = colorResource(id = R.color.colorBTCActive),
				disabledThumbColor = Color.Cyan,
				activeTrackColor = colorResource(id = R.color.colorBTCActive),
				inactiveTrackColor = Color.LightGray
			)
		)

	}
}