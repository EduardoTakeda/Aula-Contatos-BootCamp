package com.example.contatosbootc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContacstAdapter(val contactsList: ArrayList<Contact>): RecyclerView.Adapter<ContacstAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContacstAdapter.ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.contact_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContacstAdapter.ViewHolder, position: Int) {
        holder.bindItem(contactsList[position])
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItem(contact: Contact) {
            val textName= itemView.findViewById<TextView>(R.id.contact_name)
            val textPhones= itemView.findViewById<TextView>(R.id.contact_phone_number)

            textName.text= contact.name
            textPhones.text= contact.phoneNumber
        }
    }
}