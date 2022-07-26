package com.pharma.viotic.adaptor


import android.content.Context
import com.smarteist.autoimageslider.SliderViewAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pharma.viotic.R
import kotlinx.android.synthetic.main.image_item.view.*
import uk.co.senab.photoview.PhotoViewAttacher




class SliderAdapterExample(val context: Context, val mSliderItems: IntArray) :
    SliderViewAdapter<SliderAdapterExample.SliderAdapterVH>() {
   // private val context: Context



//    fun deleteItem(position: Int) {
//        mSliderItems.removeAt(position)
//        notifyDataSetChanged()
//    }
//
//    fun addItem(sliderItem: Int) {
//        mSliderItems.add(sliderItem)
//        notifyDataSetChanged()
//    }

    override fun onCreateViewHolder(parent: ViewGroup): SliderAdapterVH {
        val inflate: View =
            LayoutInflater.from(parent.context).inflate(R.layout.image_item, null)
        return SliderAdapterVH(inflate)
    }

    override fun onBindViewHolder(viewHolder: SliderAdapterVH, position: Int) {
        val sliderItem: Int = mSliderItems[position]
        val pAttacher: PhotoViewAttacher
        pAttacher = PhotoViewAttacher(viewHolder.itemView.itemigae)
        pAttacher.update()
        viewHolder.itemView.itemigae.setImageResource(mSliderItems[position])
       // viewHolder.textViewDescription.setText(sliderItem.getDescription())
//        viewHolder.textViewDescription.textSize = 16f
//        viewHolder.textViewDescription.setTextColor(Color.WHITE)
//        Glide.with(viewHolder.itemView)
//            .load(sliderItem.getImageUrl())
//            .fitCenter()
//            .into(viewHolder.imageViewBackground)
//        viewHolder.itemView.setOnClickListener(object : OnClickListener() {
//            fun onClick(v: View?) {
//                Toast.makeText(context, "This is item in position $position", Toast.LENGTH_SHORT)
//                    .show()
//            }
//        })
    }

    override fun getCount(): Int {
        //slider view count could be dynamic size
        return mSliderItems.size
    }

    inner class SliderAdapterVH(itemView: View) : ViewHolder(itemView) {
//       //var itemView: View
//       lateinit var imageitem: ImageView
////        var imageGifContainer: ImageView
////        var textViewDescription: TextView
////
//      init {
//        imageitem = itemView.findViewById(R.id.imageicon)
////            imageGifContainer = itemView.findViewById(R.id.iv_gif_container)
////            textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider)
////            this.itemView = itemView
//        }
    }

//    init {
//        this.context = context
//    }
}