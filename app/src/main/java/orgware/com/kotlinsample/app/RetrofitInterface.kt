package orgware.com.kotlinsample.app

import orgware.com.kotlinsample.model.SampleResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface RetrofitInterface {
    @GET("categories")
    fun getCategories(): Call<SampleResponse>
}