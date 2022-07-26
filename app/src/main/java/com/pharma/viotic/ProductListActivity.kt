package com.pharma.viotic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar

import androidx.recyclerview.widget.LinearLayoutManager
import com.pharma.viotic.adaptor.Custom_ProductList
import com.pharma.viotic.model.Products
import kotlinx.android.synthetic.main.activity_product_details.*
import java.util.ArrayList
import kotlinx.android.synthetic.main.activity_product_list.*
import kotlinx.android.synthetic.main.activity_product_list.view.*

class ProductListActivity : AppCompatActivity() {
    var m_productList: MutableList<Products> = ArrayList<Products>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)
      val toolbar1 : Toolbar =findViewById(R.id.toolbar)
        setSupportActionBar(toolbar1)
        supportActionBar!!.setTitle("Product List")
        toolbar1.setNavigationIcon(R.drawable.abc_ic_ab_back_material)
        toolbar1.setNavigationOnClickListener(View.OnClickListener {
            onBackPressed()
        })
        val lmanager= LinearLayoutManager(this@ProductListActivity, LinearLayoutManager.VERTICAL,false)
        product_list.layoutManager=lmanager
        ProductList()
        val cs= Custom_ProductList(this@ProductListActivity,m_productList)
        product_list.adapter=cs
    }

    fun ProductList()
    {
        var a0= Products(1,"VioRelief Cough Syrup",getString(R.string.cough_pro),90.00,"coufsyrup.png","key features key news khd","efhy rty tyt  rt ty  t  ty  r ty y ")
        var a1= Products(1,"VioRelief Cough Syrup",getString(R.string.cough_pro),90.00,"coufsyrup.png","","")
        var a2= Products(1,"VioRelief Cough Syrup",getString(R.string.cough_pro),90.00,
            "coufsyrup.png","","")
        var a3= Products(1,"VioRelief Cough Syrup",getString(R.string.cough_pro),90.00,"coufsyrup.png","","")

        var a4= Products(1,"VioRelief Cough Syrup",getString(R.string.cough_pro),
            90.00,"coufsyrup.png","","")
        var a5= Products(1,"VioRelief Cough Syrup",getString(R.string.cough_pro),90.00,"coufsyrup.png","","")
        var a6= Products(1,"VioRelief Cough Syrup",getString(R.string.cough_pro),90.00,"coufsyrup.png","","")
        var a7= Products(1,"VioRelief Cough Syrup",getString(R.string.cough_pro),90.00,"coufsyrup.png","","")

        m_productList.add(a0)
        m_productList.add(a1)
        m_productList.add(a2)
        m_productList.add(a3)
        m_productList.add(a4)
        m_productList.add(a5)
        m_productList.add(a6)
        m_productList.add(a7)

    }
}