package com.example.tarefasapp.Objetos

public class Item(
    val nome: String,
    val descricao: String,
    val subItens: MutableList<Item>?
) {
    var expandido = false
    var deletado = false
    var concluido = false

    fun expandir() {
        if(subItens.isNullOrEmpty()) {
            expandido = !expandido
        }
    }

    fun voltarTarefaInicio() {
        // vai voltar para a tela inicial com as tarefas
    }

    fun deletar() {
        deletado = true
        // deletar da exibição das tarefas, não é permanente
    }

    fun concluir() {
        concluido = true
        // vai mudar apenas a cor para identificação
    }

    fun exibirDescricao() {
        if(expandido) {
            println(descricao)
            // expandir para ver subItens
        }
    }
}
