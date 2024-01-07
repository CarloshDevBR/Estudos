interface PersonFactory {
    name: string;
    surname: string;
    nameSurname?: string
}

// Factory + Dependency Injection
function factoryPerson(name: string, surname: string) {
    let person: PersonFactory = { name, surname}

    const nameSurname = () => {
        return `${person.name} ${person.surname}`
    }

    person.nameSurname = nameSurname()
    
    return person
}

let personA = factoryPerson('Carlos', 'Henrique') // args
console.log(personA)

let personB = factoryPerson('Andrea', 'Alvarado') // args
console.log(personB)