package my.id.zaxx.fakeit

import com.google.gson.annotations.SerializedName

data class ResponseFake(

	@field:SerializedName("total")
	val total: Int? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class DataItem(

	@field:SerializedName("name")
	val name: String? = null
)
