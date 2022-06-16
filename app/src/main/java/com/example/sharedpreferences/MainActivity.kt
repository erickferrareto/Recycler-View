package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sharedpreferences.model.AdapterProduto
import com.example.sharedpreferences.model.Produto

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView_produtos : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView_produtos = findViewById(R.id.recyclerView_Produtos)
        recyclerView_produtos.layoutManager = LinearLayoutManager(this)
        recyclerView_produtos.setHasFixedSize(true)

        val lista_produtos : MutableList<Produto> = mutableListOf()
        val adapter_produto = AdapterProduto(this, lista_produtos)

        recyclerView_produtos .adapter = adapter_produto

        val produto1 = Produto(
            R.drawable.ssd,
            "SSD SanDisk Plus 480GB",
            "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias de armazenamento de estado sólido é a marca de confiança dos profissionais da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.\n",
            "R\$ 450,00"
        )
        lista_produtos.add(produto1)

        val produto2 = Produto(
            R.drawable.gabinete,
            "Gabinete Gamer",
            "A série Carbide SPEC-DELTA RGB é uma caixa ATX de torre média de vidro temperado com estilo angular impressionante, fluxo de ar potente e três ventiladores de refrigeração RGB incluídos.\n",
            "R\$ 799,00"
        )
        lista_produtos.add(produto2)

        val produto3 = Produto(
            R.drawable.memoria,
            "Memória Ram Corsair  8GB DDR4 ",
            "Memória Corsair Vengeance LPX, 8GB, 2666MHz, DDR4, C16, Preto.",
            "R\$ 369,00"
        )
        lista_produtos.add(produto3)

        val produto4 = Produto(
            R.drawable.placadevideo,
            "GeForce RTX 3090 24GB",
            "Os blocos de construção para a GPU mais rápida e eficiente do mundo, o novo Ampere SM traz 2X a taxa de transferência do FP32 e maior eficiência de energia.\n",
            "R\$ 18.499,00"
        )
        lista_produtos.add(produto4)


        val produto5 = Produto(
            R.drawable.teclado,
            "Teclado Mecânico Gamer T-Dagger Corvette",
            "Teclado Mecânico Gamer T-Dagger Corvette, LED Rainbow, Switch Outemu DIY Blue, ABNT2 - T-TGK302 -BL (PT-BLUE).",
            "R\$ 229,00"
        )
        lista_produtos.add(produto5)

        val produto6 = Produto(
            R.drawable.processador,
            "R\$ 229,00",
            "Os novos processadores da 10ª geração oferecem atualizações de desempenho incríveis para melhorar a produtividade e proporcionar entretenimento surpreendente.\n",
            "R\$ 1050,00"
        )
        lista_produtos.add(produto6)
    }
}