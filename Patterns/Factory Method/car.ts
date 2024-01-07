type Car = {
    model: string,
    enginer: string
}

type CarPrototype = {
    showDetails(): void
}

const carPrototype: CarPrototype = {
    showDetails(): void {
        console.log(this)
    }
}

// Factory
const carFactory = (model: string, enginer: string) => {
    const idAsAPrivateMember = Math.floor(Math.random() * 1000) // closure (escopo lexical)

    const carObj = Object.create(carPrototype)

    return Object.assign(carObj, {
        id: idAsAPrivateMember,
        model,
        enginer
    })
}

const car1 = carFactory('Fusca', 'V8')
car1.showDetails()

const car2 = carFactory('Celta', 'ABD1233')
car2.showDetails()