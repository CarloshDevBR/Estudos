import { BookContract } from "./publisher"

export class BiographyLibrary {
    #books: string[] = []

    update(book: BookContract) {
        if (book.category === 'biography') {
            this.#books.push(book.title)
        }
    }

    listBooks() {
        console.log('BiographyLibrary: ', this.#books)
    }
}

export class TechnologyLibrary {
    #books: string[] = []

    update(book: BookContract) {
        if (book.category === 'tech') {
            this.#books.push(book.title)
        }
    }

    listBooks() {
        console.log('TechnologyLibrary: ', this.#books)
    }
}

export class SciFiLibrary {
    #books: string[] = []

    update(book: BookContract) {
        if (book.category === 'sci-fi') {
            this.#books.push(book.title)
        }
    }

    listBooks() {
        console.log('ScifiLibrary: ', this.#books)
    }
}