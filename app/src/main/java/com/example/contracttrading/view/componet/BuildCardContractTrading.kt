package com.example.contracttrading.view.componet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contracttrading.R


@Preview(showBackground = true)
@Composable
fun BuildCardContractTrading() {
	val bgCardContractTrading = colorResource(id = R.color.color_bg_contract_trading)
	val bgSubCardContractTrading = colorResource(id = R.color.color_bg_sub_contract_trading)
	val colorBTCActive = colorResource(id = R.color.colorBTCActive)
	val colorWhite = colorResource(id = R.color.white)
	val colorUSDTDeActive = colorResource(id = R.color.colorBTCDeActive)
	val sky = colorResource(id = R.color.sky)
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.clip(RoundedCornerShape(10.dp))
			.background(color = bgCardContractTrading)
			.padding(0.dp)
	) {
		Column(modifier = Modifier.padding(10.dp)) {
			Text(
				buildAnnotatedString {
					withStyle(style = ParagraphStyle(lineHeight = 30.sp)) {
						withStyle(style = SpanStyle(color = colorBTCActive)) {
							append("BTC")
						}
						withStyle(style = SpanStyle(color = colorWhite)) {
							append("/")
						}
						withStyle(
							style = SpanStyle(
								fontWeight = FontWeight.Bold, color = colorUSDTDeActive
							)
						) {
							append("USDT")
						}
					}
				},
				style = TextStyle(color = Color.White)
			)
			Box(
				modifier = Modifier
					.fillMaxWidth()
					.padding(top = 10.dp, bottom = 10.dp)
					.clip(RoundedCornerShape(10.dp))
					.background(color = bgSubCardContractTrading)
			) {
				Column(
					modifier = Modifier.padding(10.dp),
				) {
					Row(
						verticalAlignment = Alignment.Top
					) {
						Box(
							modifier = Modifier
								.weight(1f)
								.background(color = Color.Transparent)
						) {

							Text(
								buildAnnotatedString {
									withStyle(
										style = ParagraphStyle(
											lineHeight = 18.sp,
											textAlign = TextAlign.Start
										)
									) {
										withStyle(style = SpanStyle(color = colorWhite)) {
											append("User  Rights")
										}
										withStyle(style = SpanStyle(color = colorBTCActive)) {
											append("(USDT)")
										}
									}
								},
							)
						}
						Box(
							modifier = Modifier
								.weight(1f)
								.background(color = Color.Transparent)
						) {
							Text(
								buildAnnotatedString {
									withStyle(
										style = ParagraphStyle(
											lineHeight = 18.sp,
											textAlign = TextAlign.Center
										)
									) {
										withStyle(
											style = SpanStyle(
												color = colorBTCActive, fontSize = 14.sp,
												fontWeight = FontWeight.W500
											)
										) {
											append("Unrealized profit and loss")
										}
										withStyle(
											style = SpanStyle(
												color = colorUSDTDeActive,
												fontSize = 14.sp,
												fontWeight = FontWeight.W500,

												),
										) {
											append("(USDT)")
										}

									}
								},
							)
						}
						Box(
							modifier = Modifier
								.weight(1f)
								.background(color = Color.Transparent),
							contentAlignment = Alignment.Center,

							) {
							Row() {
								Text(
									text = "Risk Rate",
									style = TextStyle(color = Color.White),
									textAlign = TextAlign.Center,
									maxLines = 2,
									overflow = TextOverflow.Ellipsis
								)
								Spacer(modifier = Modifier.padding(horizontal = 2.dp))
								Icon(
									imageVector = Icons.Default.Info,
									contentDescription = "Info",
									tint = sky,
									modifier = Modifier.size(16.dp)
								)
							}
						}


					}
					Spacer(modifier = Modifier.padding(top = 10.dp))
					Row(
						verticalAlignment = Alignment.Top
					) {
						Box(
							modifier = Modifier
								.weight(1f)
								.background(color = Color.Transparent)
						) {

							Text(
								buildAnnotatedString {
									withStyle(
										style = ParagraphStyle(
											lineHeight = 18.sp,
											textAlign = TextAlign.Start
										)
									) {
										withStyle(style = SpanStyle(color = colorWhite)) {
											append("---")
										}
									}
								},
							)
						}
						Box(
							modifier = Modifier
								.weight(1f)
								.background(color = Color.Transparent)
						) {

						}
						Box(
							modifier = Modifier
								.weight(1f)
								.background(color = Color.Transparent),
							contentAlignment = Alignment.Center,

							) {
							Row(horizontalArrangement = Arrangement.SpaceBetween) {
								Text(
									text = "0",
									style = TextStyle(color = Color.White),
									textAlign = TextAlign.Center,
									maxLines = 2,
									overflow = TextOverflow.Ellipsis
								)
								Text(
									text = "%",
									style = TextStyle(color = Color.White),
									textAlign = TextAlign.End,
									maxLines = 2,
									overflow = TextOverflow.Ellipsis
								)
							}
						}

					}
				}
			}
		}
	}
}