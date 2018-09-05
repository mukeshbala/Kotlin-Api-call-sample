package orgware.com.kotlinsample.model

import com.google.gson.annotations.SerializedName

data class SampleResponse(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("success")
	val success: String? = null
)