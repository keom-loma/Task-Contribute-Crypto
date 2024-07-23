package com.example.contracttrading.view.componet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contracttrading.R

@Composable
fun BuildLeftSideMarketOther() {
	Row(
		modifier = Modifier
			.fillMaxWidth()
			.padding(horizontal = 16.dp, vertical = 8.dp),
		verticalAlignment = Alignment.CenterVertically
	) {
		Box(
			modifier = Modifier
				.fillMaxWidth()
				.fillMaxSize()
				.weight(1f)
				.background(color = colorResource(id = R.color.no_data_gradient1))
		) {
			Column(
				modifier = Modifier
					.fillMaxWidth()
					.background(color = Color.Transparent),
				horizontalAlignment = Alignment.Start,
			) {
				Box(
					modifier = Modifier
						.clip(RoundedCornerShape(10.dp))
						.background(color = colorResource(id = R.color.color_bg_contract_trading))
				) {
					Row(
						verticalAlignment = Alignment.CenterVertically,
						horizontalArrangement = Arrangement.Center
					) {
						Box(
							modifier = Modifier
								.weight(1f)
								.background(color = colorResource(id = R.color.color_bg_contract_trading))
						) {
							Demo_ExposedDropdownMenuBox()
						}
						Box(modifier = Modifier.weight(1f)) {
							Demo_ExposedDropdownMenuBox()
						}
					}
				}
				Spacer(modifier = Modifier.padding(top = 10.dp))
				Text(
					text = "Price", style = TextStyle(
						color = Color.White,
						fontSize = 14.sp,
						fontWeight = FontWeight.W400
					)
				)
				Spacer(modifier = Modifier.padding(top = 10.dp))
				Box(
					modifier = Modifier
						.clip(RoundedCornerShape(4.dp))
						.fillMaxWidth()
						.background(
							color = colorResource(id = R.color.color_bg_contract_trading)
						)
						.padding(horizontal = 31.dp, vertical = 5.dp),
					contentAlignment = Alignment.Center

				) {
					Text(
						text = "Market Price", style = TextStyle(
							fontSize = 12.sp,
							fontWeight = FontWeight.W400,
							color = colorResource(id = R.color.colorBTCActive)
						)
					)
				}
				Spacer(modifier = Modifier.padding(top = 10.dp))
				Box(
					modifier = Modifier
						.clip(RoundedCornerShape(4.dp))
						.fillMaxWidth()
						.background(
							color = colorResource(id = R.color.color_bg_contract_trading)
						)
						.padding(5.dp),
					contentAlignment = Alignment.Center

				) {
					Row(
						modifier = Modifier.fillMaxWidth(),
						horizontalArrangement = Arrangement.SpaceBetween
					) {
						Text(
							text = "Quantity", style = TextStyle(
								fontSize = 12.sp,
								fontWeight = FontWeight.W400,
								color = colorResource(id = R.color.grey)
							)
						)
						Text(
							text = "Leaf",
							style = TextStyle(
								fontSize = 10.sp,
								fontWeight = FontWeight.W400,
								color = colorResource(id = R.color.white)
							),
						)
					}
				}
				Spacer(modifier = Modifier.padding(top = 16.dp))
				BuildSlider()
				Spacer(modifier = Modifier.padding(top = 10.dp))
				Row(
					modifier = Modifier.fillMaxWidth(),
					horizontalArrangement = Arrangement.SpaceBetween
				) {
					Text(text = "Occupy Margin", style = TextStyle(color = Color.White))
					Text(text = "0.000", style = TextStyle(color = Color.White))
				}
				Spacer(modifier = Modifier.padding(top = 10.dp))
				Box(
					modifier = Modifier
						.clip(RoundedCornerShape(20.dp))
						.fillMaxWidth()
						.background(
							brush = Brush.linearGradient(
								colors = listOf(
									colorResource(id = R.color.colorBTCActive),
									colorResource(
										id = R.color.colorBTCActiveG
									)
								),
								start = Offset.Zero,
								end = Offset.Infinite
							)
						)
						.padding(
							horizontal = 25.dp, vertical = 8.dp
						),
					contentAlignment = Alignment.Center
				) {
					Text("BUY(bullish)", style = TextStyle(color = Color.White))
				}

				Spacer(modifier = Modifier.padding(top = 10.dp))
				Row(
					modifier = Modifier.fillMaxWidth(),
					horizontalArrangement = Arrangement.SpaceBetween
				) {
					Text(text = "Occupy Margin", style = TextStyle(color = Color.White))
				}
				Spacer(modifier = Modifier.padding(top = 10.dp))
				Box(
					modifier = Modifier
						.clip(RoundedCornerShape(20.dp))
						.fillMaxWidth()
						.background(
							brush = Brush.linearGradient(
								colors = listOf(
									colorResource(id = R.color.colorBTCDeActive),
									colorResource(
										id = R.color.colorBTCDeActiveG
									)
								),
								start = Offset.Zero,
								end = Offset.Infinite
							)
						)
						.padding(
							horizontal = 25.dp, vertical = 8.dp
						),
					contentAlignment = Alignment.Center
				) {
					Text("SELL(bearish)", style = TextStyle(color = Color.White))
				}
				Spacer(modifier = Modifier.padding(top = 10.dp))
				Text("Short 0 leaf", style = TextStyle(color = Color.White))
				Spacer(modifier = Modifier.padding(top = 10.dp))
				HorizontalDivider()
				Spacer(modifier = Modifier.padding(top = 10.dp))
				Row {
					Text(buildAnnotatedString {
						withStyle(style = SpanStyle(color = Color.White)) {
							append("Open Position")

						}
						withStyle(style = SpanStyle(color = colorResource(id = R.color.colorBTCActive))) {
							append(" USDT")
						}
					})
					Spacer(modifier = Modifier.padding(start = 6.dp))
					Box(
						modifier = Modifier
							.clip(RoundedCornerShape(10.dp))

							.background(
								brush = Brush.linearGradient(
									colors = listOf(
										colorResource(id = R.color.sky),
										colorResource(
											id = R.color.skyG
										)
									),
									start = Offset.Zero,
									end = Offset.Infinite
								)
							)
							.padding(3.dp)
					) {
						Text(
							text = "Transfer",
							style = TextStyle(color = Color.White, fontSize = 10.sp)
						)
					}

				}
			}
		}

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