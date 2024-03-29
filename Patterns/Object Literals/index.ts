const keyPressed = 'arrowLeft'

const acceptedMoves = {
    arrowUp: () => console.log('moveu pra cima'),
    arrowDown: () => console.log('moveu pra baixo'),
    arrowLeft: () => console.log('moveu pra esquerda'),
    arrowRight: () => console.log('moveu pra direita')
}

const moveFunction = (keyPressed: string) => {
    const action = acceptedMoves[keyPressed]

    action()
}

moveFunction(keyPressed)