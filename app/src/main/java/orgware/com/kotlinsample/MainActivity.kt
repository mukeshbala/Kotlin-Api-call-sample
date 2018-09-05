package orgware.com.kotlinsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import orgware.com.kotlinsample.app.RetrofitInterface
import orgware.com.kotlinsample.model.CategoriesItem
import orgware.com.kotlinsample.model.SampleResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {


    var categoryList: List<CategoriesItem>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_sample.text = "Loading...."
        txt_sample.visibility = View.VISIBLE
        rv_sample_list.visibility = View.GONE
        rv_sample_list.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        getSampleApi()
    }

    private fun getSampleApi() {

        val retrofit = Retrofit.Builder().baseUrl("http://139.59.74.62/api/").addConverterFactory(GsonConverterFactory.create()).build()
        val retrofitInterface = retrofit.create(RetrofitInterface::class.java!!)
        val mCall = retrofitInterface.getCategories()

        mCall.enqueue(object : Callback<SampleResponse> {
            override fun onResponse(call: Call<SampleResponse>, response: Response<SampleResponse>) {
                if (response.isSuccessful) {
                    val sampleResponse = response?.body()
                    Toast.makeText(applicationContext, sampleResponse!!.success, Toast.LENGTH_SHORT).show()
//                    txt_sample.text = sampleResponse.success
                    txt_sample.visibility = View.GONE
                    rv_sample_list.visibility = View.VISIBLE

                    categoryList = (sampleResponse.data!!.categories as List<CategoriesItem>?)
                    val sampleAdapter = SampleAdapter(categoryList, { categoriesItem: CategoriesItem -> partItemClicked(categoriesItem) })
                    rv_sample_list.adapter = sampleAdapter
                } else {
                    Toast.makeText(applicationContext, "Api failure", Toast.LENGTH_SHORT).show()
                    txt_sample.text = "Api failure"
                    txt_sample.visibility = View.VISIBLE
                    rv_sample_list.visibility = View.GONE
                }
            }

            override fun onFailure(call: Call<SampleResponse>, t: Throwable) {

                Toast.makeText(this@MainActivity, "" + t.message, Toast.LENGTH_SHORT).show()
                txt_sample.text = "" + t.message
                txt_sample.visibility = View.VISIBLE
                rv_sample_list.visibility = View.GONE

            }
        })


    }

    private fun partItemClicked(categoriesItem: CategoriesItem) {


    }
}
