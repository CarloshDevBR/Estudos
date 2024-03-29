interface MainLibraryContract {
    addNewBook(book: BookContract): void;
    notifyAllSubscribers(book: BookContract): void
}

export interface BookContract {
    title: string;
    category: string
}

export interface SubContract {
    update(book: BookContract): void
}

export class MainLibrary implements MainLibraryContract {
    #subscribers: SubContract[] = []

    addSubscriber(sub: SubContract) {
        this.#subscribers.push(sub)
    }

    addNewBook(book: BookContract) {
        this.notifyAllSubscribers(book)
    }

    notifyAllSubscribers(book: BookContract) {
        this.#subscribers.forEach((sub) => {
            sub.update(book)
        })
    }
}