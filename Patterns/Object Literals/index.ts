type KeysProps = 'arrowUp' | 'arrowRight' | 'arrowDown' | 'arrowLeft'

const movePlayer = {
    arrowUp: () => console.log('moveu pra cima'),
    arrowRight: () => console.log('moveu pra direita'),
    arrowDown: () => console.log('moveu pra baixo'),
    arrowLeft: () => console.log('moveu pra esquerda')
}

function handleKeyPress(key: KeysProps) {
    const move = movePlayer[key]

    move()
}

handleKeyPress('arrowUp')