package com.example.contracttrading.view.componet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun LocalSvgImage(resourceId: Int, contentDescription: String?) {

	val painter = painterResource(id = resourceId)
	Image(
		painter = painter,
		contentDescription = contentDescription,
		modifier = Modifier.size(130.dp)
	)
}