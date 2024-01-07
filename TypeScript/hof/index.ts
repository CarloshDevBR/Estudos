function getMultiplier(multiplier: number) {
    return (aNumber: number) => {
        return aNumber * multiplier
    }
}

const double = getMultiplier(2)(2)
const triple = getMultiplier(2)(3)
const quadruple = getMultiplier(2)(4)