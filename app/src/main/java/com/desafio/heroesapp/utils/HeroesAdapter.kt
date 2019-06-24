//package com.desafio.heroesapp.utils
//
//import android.app.Activity
//import android.support.v7.widget.RecyclerView
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import com.desafio.heroesapp.R
//
////Inner Classes
//class HeroesAdapter(private var configList: List<ConfigItem>, val context: Activity) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        val view = LayoutInflater.from(context).inflate(R.layout.hero_cell, parent, false)
//        return ConfigViewHolder(view)
//    }
//
//    override fun getItemCount(): Int {
//        return configList.size
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//
//        val h = holder as ConfigViewHolder
//        val title = configList[position].title
//        h.titleConfig.text = title
//        h.switch.isChecked = user?.isOnline == 2
//
//        h.switch.setOnCheckedChangeListener { _, isChecked ->
//
//            if (isChecked) {
//                user?.isOnline = 2 //Modo Online
//                user?.save()
//                return@setOnCheckedChangeListener
//            }
//
//            user?.isOnline = 1 //Modo Offline
//            user?.save()
//            return@setOnCheckedChangeListener
//        }
//    }
//}
//
////Unidades ViewHolder
//inner class ConfigViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//    val titleConfig = itemView.findViewById<TextView>(R.id.title_config)!!
//    val switch = itemView.findViewById<Switch>(R.id.config_switch)!!
//}