import { BiographyLibrary, SciFiLibrary, TechnologyLibrary } from "./listiners";

import { MainLibrary } from "./publisher";

const mainLibrary = new MainLibrary()
const biographyLibrary = new BiographyLibrary()
const technologyLibrary = new TechnologyLibrary()
const scifiLibrary = new SciFiLibrary()

biographyLibrary.listBooks()
technologyLibrary.listBooks()
scifiLibrary.listBooks()

mainLibrary.addSubscriber(biographyLibrary)

mainLibrary.addSubscriber(technologyLibrary)

mainLibrary.addSubscriber(scifiLibrary)

console.log('-----------------')

mainLibrary.addNewBook({
    title: 'Biografia de Steve Jobs',
    category: 'biography'
})

mainLibrary.addNewBook({
    title: 'Clean Code',
    category: 'tech'
})

mainLibrary.addNewBook({
    title: 'Star Wars',
    category: 'sci-fi'
})

biographyLibrary.listBooks()
technologyLibrary.listBooks()
scifiLibrary.listBooks()

console.log('-----------------')