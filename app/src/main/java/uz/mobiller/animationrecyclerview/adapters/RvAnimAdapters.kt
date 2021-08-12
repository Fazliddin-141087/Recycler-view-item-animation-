package uz.mobiller.animationrecyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.core.view.ViewPropertyAnimatorListener
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_anim.view.*
import uz.mobiller.animationrecyclerview.R
import uz.mobiller.animationrecyclerview.models.Anim
import java.util.ArrayList

class RvAnimAdapters(var context: Context,var animList: ArrayList<Anim>) : RecyclerView.Adapter<RvAnimAdapters.Vh>() {

    inner class Vh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(anim: Anim) {
            Picasso.get().load(anim.imgUrl).into(itemView.img)
            itemView.txt.text = anim.name
            itemView.animation=AnimationUtils.loadAnimation(context,R.anim.anim1)

            itemView.setOnClickListener {
                Toast.makeText(itemView.context, "${anim.name}", Toast.LENGTH_SHORT).show()
            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_anim, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(animList[position])
    }

    override fun getItemCount(): Int = animList.size
}