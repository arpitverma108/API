package eu.tutorials.api

import Product
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MyAdapter(val context: Activity, val productList: List<Product>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var title: TextView
        var imageView: ImageView

        init {
            title = itemView.findViewById(R.id.headline_text)
            imageView = itemView.findViewById(R.id.product_image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.eachitem, parent, false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = productList[position]
        holder.title.text = currentItem.title
        //imageview, how to show image in image view if the image is in form of url, 3rd party library
        //using picasso in this case
        Picasso.get().load(currentItem.thumbnail).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}
