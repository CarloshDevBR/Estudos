// ==> Numeric Enum
enum Idioma {
    Portugues,
    Espanhol,
    Ingles,
    Frances
}

// ==> String Enum
enum Equipe {
    Carlos = 'Front end',
    Manoel = 'Back end',
    João = 'UX UI',
    Fernanda = 'QA'
}

enum Dia {
    Segunda = 'SEG',
    Terça = 'TER',
    Quarta = 'QUA',
    Quinta = 'QUI',
    Sexta = 'SEX',
    Sabado = 'SAB',
    Domingo = 'DOM'
}

// ==> Como podemos acessar um valor de um Enum com uma chave: (usando o const)
const enum Comida {
    Hamburger,
    Massa,
    Pizza,
    Torta,
    Churrasco
}

function comida(c: Comida) {
    return 'Comidas apetitosas'
}

console.log(comida(Comida.Pizza))

// ==> Quando se usar
enum Tarefa {
    Todo,
    Progress,
    Done
}

const concluidaTarefa = {
    id: 1,
    status: Tarefa.Done,
    descricao: 'Parabéns! Tarefa concluída com sucesso!'
}

if (concluidaTarefa.status === Tarefa.Done) {
    console.log('Enviar e-mail: Tarefa concluída!')
}