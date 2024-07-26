package exceptions

fun main() {
    a()
}

fun a() {
    try {
        b()
    } catch (err: B) {
        throw A(err)
    }
}

fun b() {
    throw B()
}

class A(cause: Throwable): RuntimeException(cause)

class B: RuntimeException()