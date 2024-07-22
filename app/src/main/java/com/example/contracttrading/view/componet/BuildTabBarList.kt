package com.example.contracttrading.view.componet

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabPosition
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.contracttrading.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch


@SuppressLint("ResourceAsColor")
@OptIn(ExperimentalPagerApi::class)
@Composable
fun <T> BuildTabBarList(

	listItemTabBar: List<T>,
	startColor: Color,
	labelColorTabBar: Color,
	selectedContentColor: Color,
	unselectedContentColor: Color,
	getLabel: (T) -> String, // Function to get the label from T
	getContent: (T) -> @Composable () -> Unit // Function to get the content from T

) {

	val coroutineScope = rememberCoroutineScope()
	val pagerState = rememberPagerState()
	var selectedIndex by remember { mutableIntStateOf(0) }
	Column() {
		ScrollableTabRow(
			modifier = Modifier
				.padding(
					0.dp
				)
				.background(Color.Blue),
			selectedTabIndex = pagerState.currentPage,
			edgePadding = 0.dp,
			indicator = {
				CustomGradientTabIndicator(it, pagerState.currentPage)
			},
			divider = {}
		) {
			listItemTabBar.forEachIndexed { index, value ->
				Tab(
					modifier = Modifier
						.background(
							color = startColor
						)
						.fillMaxWidth(),
					unselectedContentColor = unselectedContentColor,
					selectedContentColor = selectedContentColor,
					selected = pagerState.currentPage == index,

					onClick = {
						coroutineScope.launch {
							pagerState.animateScrollToPage(index)
						}
						selectedIndex = index
					},
					text = {
						Box(
							modifier = Modifier
								.clip(RoundedCornerShape(2.0.dp))
								.fillMaxWidth()

						) {
							Text(
								text = getLabel(value),
								style = TextStyle(color = if (selectedIndex == index) labelColorTabBar else Color.White)
							)
						}
					}
				)
			}
		}
		HorizontalPager(
			count = listItemTabBar.size,
			state = pagerState,
			modifier = Modifier
				.weight(1f)
		) { page ->
			getContent(listItemTabBar[page])()
		}
	}
}

@Composable
fun CustomGradientTabIndicator(tabPositions: List<TabPosition>, selectedTabIndex: Int) {
	val currentTabPosition = tabPositions[selectedTabIndex]

	Box(
		Modifier
			.fillMaxSize()
			.wrapContentSize(align = Alignment.BottomStart)
			.offset(x = currentTabPosition.left)
			.width(currentTabPosition.width)
			.padding(horizontal = 30.dp)
			.height(2.dp)
			.clip(RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp))
			.background(color = colorResource(id = R.color.color_label_tab_bar))
	)
}

@Composable
fun TabContent(index: Int) {
	when (index) {
		0 -> {
			OpenPosition()

			/*	NoData(
					resourceId = R.drawable.empty_box_1,
					labelTitle = index.toString(),
					contentDescription = null
				)*/
		}

		1 -> {
			NoData(
				resourceId = R.drawable.empty_box_1,
				labelTitle = index.toString(),
				contentDescription = null
			)
		}

		2 -> {
			NoData(
				resourceId = R.drawable.empty_box_1,
				labelTitle = index.toString(),
				contentDescription = null
			)
		}

		3 -> {
			NoData(
				resourceId = R.drawable.empty_box_1,
				labelTitle = index.toString(),
				contentDescription = null
			)
		}

		4 -> {
			NoData(
				resourceId = R.drawable.empty_box_1,
				labelTitle = index.toString(),
				contentDescription = null
			)
		}
	}
}


