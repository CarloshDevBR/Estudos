// ==> Uso básico do Type Object
const pessoa = {
    nome: 'Carlos',
    sobrenome: 'Silva',
    idade: 21,
    funcao: 'Software Enginer'
}

// ==> Object com parâmetros de função (eles podem ser anônimos)
function onboarding01(funcionario: { nome: string }) {
    return `Seja bem-vindo ${funcionario.nome}`
}

onboarding01({ nome: 'Carlos' })

// ==> Object nomeados
interface Pessoa {
    nome: string
    funcao: string
}

// ==> Object como type alias
type Salario = {
    nome: string,
    salario: number
}

// ==> Optional no Object
interface Hobby {
    nome: string;
    hobby?: string;
}

// ==> Propriedade 'readonly' (serve para não permitir alterações no object)
interface InfoPessoa {
    nome: string;
    idade: number;
    readonly email: string;
}

// ==> TIpos de extensões (heranças)
interface Mae {
    nome: string
}

interface Pai {
    sobrenome: string
}

interface Filho extends Mae, Pai {
    idade: number
}

const filho: Filho = {
    nome: 'Carlos',
    sobrenome: 'Silva',
    idade: 21
}

// ==> Interseções
interface Cachorro {
    tipo: string
}

interface Gato {
    tipo: string
}

type Animal = Cachorro & Gato

// ==> Generic Objects
type Usuario = {
    nome: string;
    email: string;
}

const usuario: Usuario = {
    nome: 'Glaucia Lemos',
    email: 'algumacoisa@gmail.com',
}

type Admin = {
    nome: string;
    email: string;
    admin: boolean
}

const admin: Admin = {
    nome: 'Glaucia Lemos',
    email: 'algumacoisa@gmail.com',
    admin: true
}

function acessarSistema<T>(usuario: T): T {
    return usuario
}

acessarSistema<Usuario>(usuario)
acessarSistema<Admin>(admin)
