package com.pharma.viotic.adaptor


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.RecyclerView
import com.pharma.viotic.ProductDetails
import com.pharma.viotic.R
import com.pharma.viotic.model.Products

import kotlinx.android.synthetic.main.custom_product.view.*

class Custom_ProductList(
    val context: AppCompatActivity,
    val list: List<Products>
) : RecyclerView.Adapter<Custom_ProductList.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.custom_product, viewGroup, false)
        return ViewHolder(v)
    }

    //    @Override
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: Products = list[position];
        holder.itemView.imageicon.setImageResource(R.drawable.logo)
        holder.itemView.productname.setText(list.get(position).m_productname)
        holder.itemView.description.setText(HtmlCompat.fromHtml(list.get(position).m_productDetails,HtmlCompat.FROM_HTML_MODE_LEGACY))
        holder.itemView.keyfeature.setText(list.get(position).m_productDetails)
//      holder.itemView.carddetails.setOnClickListener(View.OnClickListener {
//            val intent = Intent(context,ProductDetails::class.java)
//            context.startActivity(intent)
//
//            val intent = Intent(context, ProductDetails::class.java)
//            intent.putExtra("object", list.get(position))
//            return intent
//        })
//        holder.itemView.imageicon.setImageResource(R.drawable.logo)
//        holder.itemView.imageicon.setImageResource(R.drawable.logo)


    }



    override fun getItemCount(): Int {
        return list.size
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


    }

}