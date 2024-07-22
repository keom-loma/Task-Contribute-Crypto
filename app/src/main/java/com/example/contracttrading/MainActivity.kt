package com.example.contracttrading

import BuildAppBarComponent
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.contracttrading.data.ContractTradingData
import com.example.contracttrading.ui.theme.ContractTradingTheme
import com.example.contracttrading.view.componet.BuildTabBarList
import com.example.contracttrading.view.componet.TabContent

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			val startColor = colorResource(id = R.color.no_data_gradient1)
			ContractTradingTheme {
				Scaffold(
					modifier = Modifier.fillMaxSize(),
					topBar = {
						BuildAppBarComponent(labelTitle = "Contract Trading") {}
					},
				) { innerPadding ->
					Surface(
						modifier = Modifier
							.padding(innerPadding)
							.background(color = startColor)
					) {
						PreviewList()
					}
				}
			}
		}
	}
}


@SuppressLint("ResourceAsColor")
@Preview(showBackground = true)
@Composable
fun PreviewList() {
	val startColor = colorResource(id = R.color.no_data_gradient1)
	val endColor = colorResource(id = R.color.no_data_gradient2)
	val labelColorTabBar = colorResource(id = R.color.color_label_tab_bar)
	ContractTradingTheme {
		Box(
			modifier = Modifier
				.background(color = startColor)
		) {
			BuildTabBarList(
				listItemTabBar = ContractTradingData.listData,
				startColor = startColor,
				labelColorTabBar = labelColorTabBar,
				selectedContentColor = Color(R.color.color_label_tab_bar),
				unselectedContentColor = Color.White,
				getLabel = { it.name },
				getContent = {
					{
						TabContent(index = it.id)
					}
				}
			)
		}
	}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	ContractTradingTheme {
	}
}