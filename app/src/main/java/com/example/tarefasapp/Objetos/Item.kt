package com.example.tarefasapp.Objetos

class Item(
    val nome: String,
    val descricao: String,
    val subItens: MutableList<Item>?
) {
    var expandido = false
    var deletado = false
    var concluido = false
    var exibirDescricao = false

    fun expandir() {
        if(subItens.isNullOrEmpty()) {
            expandido = !expandido
        }
    }

    fun deletar() {
        deletado = true
    }

    fun concluir() {
        concluido = true
    }

    fun exibirDescricao() {
        if(expandido) {
            println(descricao)
        }
    }
}
