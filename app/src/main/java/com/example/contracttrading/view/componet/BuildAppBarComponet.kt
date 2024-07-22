import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import com.example.contracttrading.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuildAppBarComponent(labelTitle: String, onClick: () -> Unit) {
	val startColor = colorResource(id = R.color.no_data_gradient1)
	val endColor = colorResource(id = R.color.no_data_gradient2)
	TopAppBar(
		colors = TopAppBarDefaults.smallTopAppBarColors(
			containerColor = Color.Transparent
		),
		modifier = Modifier.background(
			brush = Brush.linearGradient(
				colors = listOf(startColor, startColor),
				start = Offset.Zero,
				end = Offset.Infinite
			)
		),

		title = {
			Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
				Text(
					text = labelTitle, style = TextStyle(
						color = Color.White
					)
				)
			}
		},
		navigationIcon = {
			IconButton(
				onClick = { onClick() },
				colors = IconButtonDefaults.iconButtonColors(contentColor = Color.Black)
			) {
				Icon(
					Icons.AutoMirrored.Filled.List,
					contentDescription = "Back",
					tint = Color.White
				)

			}
		},
		actions = {
			IconButton(onClick = {}) {

			}
		},
	)
}