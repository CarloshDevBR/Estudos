// ==> boolean primitive
type TarefaProps = {
    concluida: boolean;
    pendente: boolean;
}

const tarefa: TarefaProps = {
    concluida: false,
    pendente: true
}

console.log(tarefa.concluida)
console.log(tarefa.pendente)