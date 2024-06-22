function informarDados(id: number, nome: string, email?: string) {
    console.table({
        id,
        nome,
        email
    })
}

informarDados(1, 'Carlos', 'carlos@gmail.com')