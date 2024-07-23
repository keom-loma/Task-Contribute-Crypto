package com.example.contracttrading.view.componet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contracttrading.R


@Composable
fun BuildCardContractTrading(redColor: Int, greenColor: Int, percentage: Double) {
	val startColor = colorResource(id = R.color.no_data_gradient1)
	val endColor = colorResource(id = R.color.no_data_gradient2)
	val colorBTCActive = colorResource(id = R.color.colorBTCActive)
	val colorWhite = colorResource(id = R.color.white)
	val colorUSDTDeActive = colorResource(id = R.color.colorBTCDeActive)
	val sky = colorResource(id = R.color.sky)
	Column(
		modifier = Modifier
			.background(color = Color.Transparent)
			.padding(horizontal = 12.dp)
	) {
		Box(
			modifier = Modifier
				.clip(RoundedCornerShape(10.dp))
				.background(color = colorResource(id = R.color.color_bg_contract_trading))
				.padding(10.dp)
				.fillMaxWidth()
		) {
			Column(
				modifier = Modifier
					.background(color = Color.Transparent)

			) {
				androidx.compose.material3.Text(
					buildAnnotatedString {
						withStyle(style = ParagraphStyle(lineHeight = 30.sp)) {
							withStyle(
								style = SpanStyle(
									color = colorBTCActive,
									fontWeight = FontWeight.W700,
									fontSize = 14.sp
								)
							) {
								append("BTC")
							}
							withStyle(
								style = SpanStyle(
									color = Color.White,
									fontWeight = FontWeight.W700,
									fontSize = 14.sp
								)
							) {
								append("/")
							}
							withStyle(
								style = SpanStyle(
									color = colorUSDTDeActive,
									fontWeight = FontWeight.W700,
									fontSize = 14.sp
								)
							) {
								append("USDT")
							}
						}
					},
					style = TextStyle(color = Color.White)
				)
				Spacer(modifier = Modifier.padding(top = 10.dp))
				Box(
					modifier = Modifier
						.clip(RoundedCornerShape(10.dp))
						.background(color = colorResource(id = R.color.color_bg_sub_contract_trading))
				) {
					Column(modifier = Modifier.padding(10.dp)) {
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
												textAlign = TextAlign.Start,
											)
										) {
											withStyle(
												style = SpanStyle(
													color = colorWhite,
													fontWeight = FontWeight.W400,
													fontSize = 12.sp,
												)
											) {
												append("User  Rights\n")
											}
											withStyle(
												style = SpanStyle(
													color = colorBTCActive,
													fontSize = 12.sp,
													fontWeight = FontWeight.W700
												)
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
													color = colorBTCActive,
													fontSize = 14.sp,
													fontWeight = FontWeight.W400
												)
											) {
												append("Unrealized profit and loss")
											}
											withStyle(
												style = SpanStyle(
													color = colorUSDTDeActive,
													fontSize = 14.sp,
													fontWeight = FontWeight.W700,

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
									.weight(1f),
								contentAlignment = Alignment.TopEnd,
							) {
								Row(
									horizontalArrangement = Arrangement.End,
								) {
									androidx.compose.material3.Text(
										text = "Risk Rate",
										style = TextStyle(
											color = Color.White,
											fontSize = 12.sp,
											fontWeight = FontWeight.W400
										),
										textAlign = TextAlign.Center,
										maxLines = 2,
										overflow = TextOverflow.Ellipsis,

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
						Spacer(modifier = Modifier.height(20.dp))
						Row(
							horizontalArrangement = Arrangement.SpaceBetween,
							verticalAlignment = Alignment.CenterVertically,
							modifier = Modifier.fillMaxWidth()
						) {
							Text(text = "--", style = TextStyle(color = Color.White))
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
												color = Color.White,
												fontSize = 14.sp,
												fontWeight = FontWeight.W500
											)
										) {
											append(percentage.toString())
										}
										withStyle(
											style = SpanStyle(
												fontSize = 14.sp,
												color = Color.White,
												fontWeight = FontWeight.W500,

												),
										) {
											append("%")
										}

									}
								},
							)
						}
					}
				}


			}
		}

	}
}