package com.example.sharedpreferences.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sharedpreferences.R

class AdapterProduto(private val context : Context, private val produtos : MutableList<Produto>) : RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val item_list = LayoutInflater.from(context).inflate(R.layout.hardware_item, parent, false)
        val holder = ProdutoViewHolder(item_list)
        return holder
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome_produto
        holder.desc.text = produtos[position].descricao
        holder.preco.text = produtos[position].preco
    }

    override fun getItemCount(): Int = produtos.size

    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val foto = itemView.findViewById<ImageView>(R.id.foto_produto)
            val nome = itemView.findViewById<TextView>(R.id.nome_produto)
            val desc = itemView.findViewById<TextView>(R.id.descricao_produto)
            val preco = itemView.findViewById<TextView>(R.id.preco_produto)
    }
}