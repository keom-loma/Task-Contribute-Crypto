package com.example.contracttrading.view.componet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun BuildLeftRightMarketOther() {
	Column {
		Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
			Text(text = "Price")
			Text(text = "Quantity")
		}
		LazyColumn {
			items(10) {
				Row(
					modifier = Modifier.fillMaxWidth(),
				) {
					Text(text = it.toString())
					Text(text = it.toString())
				}
			}
		}
	}
}