const getFactorial = (number: number) => {
    console.log(number) // 3, 2, 1

    if (number === 1) {
        return 1
    }

    return number * getFactorial(number - 1)
}

getFactorial(3)