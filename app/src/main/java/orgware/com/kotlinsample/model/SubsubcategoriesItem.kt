package orgware.com.kotlinsample.model

import com.google.gson.annotations.SerializedName

data class SubsubcategoriesItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("parent")
	val parent: String? = null,

	@field:SerializedName("subparent_id")
	val subparentId: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("brand_id")
	val brandId: Int? = null,

	@field:SerializedName("pdf")
	val pdf: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("parent_id")
	val parentId: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("qr_code")
	val qrCode: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("subparent")
	val subparent: String? = null
)