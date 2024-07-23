package com.example.contracttrading.view.componet

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contracttrading.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Demo_ExposedDropdownMenuBox() {
	val context = LocalContext.current
	val coins = arrayOf("BTC", "USDT", "BNB", "ETH", "PPE", "XRP", "DOGE")
	var expanded by remember { mutableStateOf(false) }
	var selectedText by remember { mutableStateOf(coins[0]) }

	Box(
		modifier = Modifier
//			.fillMaxWidth()
//			.background(color = colorResource(id = R.color.color_bg_contract_trading))
			.background(color = Color.Red)

	) {
		ExposedDropdownMenuBox(
			modifier = Modifier.background(color = Color.Red),
			expanded = expanded,
			onExpandedChange = {
				expanded = !expanded
			}
		) {

			Row(modifier = Modifier.background(color = Color.Blue)) {
				TextField(
					value = selectedText,
					onValueChange = {},
					readOnly = true,
					trailingIcon = {
						Icon(
							imageVector = Icons.Default.ArrowDropDown,
							contentDescription = "Back", tint = Color.White
						)
					},
					modifier = Modifier
						.menuAnchor()
						.background(color = colorResource(id = R.color.color_bg_contract_trading))
						.height(48.dp),
					textStyle = TextStyle(
						fontSize = 12.sp,
						color = Color.White,
						platformStyle = PlatformTextStyle(
							includeFontPadding = false
						)
					),
					colors = TextFieldDefaults.textFieldColors(
						containerColor = Color.Transparent, // Set the container color to Transparent
					)
				)
			}
			ExposedDropdownMenu(
				expanded = expanded,
				onDismissRequest = { expanded = false },
			) {
				coins.forEach { item ->
					DropdownMenuItem(
						text = { Text(text = item) },
						onClick = {
							selectedText = item
							expanded = false
							Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
						}
					)
				}
			}
		}
	}
}