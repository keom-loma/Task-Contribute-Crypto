package com.example.contracttrading.data

data class ContractTradingModel(
	val id: Int,
	val name: String
)


object ContractTradingData {
	val listData = listOf(
		ContractTradingModel(id = 0, name = "Open Position"),
		ContractTradingModel(id = 1, name = "Position(BTC)"),
		ContractTradingModel(id = 2, name = "Delegation"),
		ContractTradingModel(id = 3, name = "History"),
		ContractTradingModel(id = 4, name = "ContractFlowing Water(BTC)"),
	)
}
