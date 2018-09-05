package orgware.com.kotlinsample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import orgware.com.kotlinsample.model.CategoriesItem



class SampleAdapter(val categoryList: List<CategoriesItem>?, val clickManager: (CategoriesItem) -> Unit) :
        RecyclerView.Adapter<SampleAdapter.SampleViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleAdapter.SampleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_categories, parent, false)
        return SampleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categoryList!!.size

    }

    override fun onBindViewHolder(holder: SampleAdapter.SampleViewHolder, position: Int) {

        holder.bindListitems(categoryList!![position], clickManager)

    }

    class SampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindListitems(categoriesItem: CategoriesItem, clickManager: (CategoriesItem) -> Unit) {
            val txtId = itemView.findViewById<TextView>(R.id.txt_id)
            val txtName = itemView.findViewById<TextView>(R.id.txt_name)

            txtId.text = "" + categoriesItem.id
            txtName.text = categoriesItem.name
        }

    }

}