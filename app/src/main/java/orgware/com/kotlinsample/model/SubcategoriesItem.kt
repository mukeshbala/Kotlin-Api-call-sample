package orgware.com.kotlinsample.model

import com.google.gson.annotations.SerializedName

data class SubcategoriesItem(

	@field:SerializedName("parent")
	val parent: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("parent_id")
	val parentId: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("subsubcategories")
	val subsubcategories: List<Any?>? = null,

	@field:SerializedName("id")
	val id: Int? = null
)