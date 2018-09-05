package orgware.com.kotlinsample.model

import com.google.gson.annotations.SerializedName

data class Data(

	@field:SerializedName("categories")
	val categories: List<CategoriesItem?>? = null
)