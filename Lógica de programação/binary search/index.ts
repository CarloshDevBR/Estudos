const arr =  [2, 3, 4 ,5 ,6, 7, ,10, 15, 20, 25]

type BinarySearchProps = {
    number: number;
    array: (number | undefined)[]
}

const BinarySearch = ({ number, array }: BinarySearchProps) => {
    let low = 0
    let high = array.length

    do {
        const media = Math.floor((low + high) / 2)

        const value = array[media]

        if (value === number) {
            return media
        }

        if (value! > number) {
            high = media
        }

        if (value! < number) {
            low = media + 1
        }

        console.log({value, media, low, high})
    } while (low < high);

    return -1
}

console.log(BinarySearch({ number: 5, array: arr }))