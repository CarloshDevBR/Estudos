// Contrato
interface Product {
    sayHi(): void
}

// Implementação do contrato Product na classe ConcreteProduct
class ConcreteProduct implements Product {
    sayHi(): void {
        console.log('Hi')
    }
}

abstract class Creator {
    abstract factoryMethod(): Product

    createAndShow(): void {
        const product = this.factoryMethod()

        console.log(product)
    }
}

class ConcreteCreator extends Creator {
    factoryMethod(): Product {
        return new ConcreteProduct()
    }
}

const creator = new ConcreteCreator()

const product = creator.factoryMethod()

product.sayHi() // Hi

creator.createAndShow() // ConcreteProduct {}