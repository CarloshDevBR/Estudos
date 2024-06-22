interface IProduct {
    getPrice(): number;
    getName(): string;
}

class TShirt implements IProduct {
    private name = 'Camiseta'
    private price = 49.90

    getPrice(): number {
        return this.price
    }

    getName(): string {
        return this.name
    }
}