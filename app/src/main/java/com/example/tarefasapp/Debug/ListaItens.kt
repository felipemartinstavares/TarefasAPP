package com.example.tarefasapp.Debug

import com.example.tarefasapp.Objetos.Item


fun main() {
    val listaItens: MutableList<Item> = mutableListOf()
    for(i in 1..5) {
        listaItens.add(
            Item("Tarefa 1", "Descricao 1", null)
        )
        listaItens.add(
            Item("Tarefa 2", "Descricao 2", null)
        )
        listaItens.add(
            Item("Tarefa 3", "Descricao 3" , listaItens)
        )
    }
    println(listaItens)
}



