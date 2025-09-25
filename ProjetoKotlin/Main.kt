class ContaBancaria(val titular: String, private var saldo: Double) {

    fun getSaldo(): Double = saldo

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("$titular depositou R$ $valor")
        } else {
            println("Valor de depósito inválido para $titular")
        }
    }

    fun sacar(valor: Double) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor
            println("$titular sacou R$ $valor")
        } else {
            println("Miguel tentou sacar R$ 3000.0, Saque inválido para $titular")
        }
    }
}

fun main() {
    val conta1 = ContaBancaria("Lucas", 1000.0)
    val conta2 = ContaBancaria("Victor", 500.0)
    val conta3 = ContaBancaria("Miguel", 2000.0)

    conta1.depositar(200.0)
    conta2.sacar(100.0)
    conta3.sacar(3000.0)

    println("Saldo de ${conta1.titular}: R$ ${conta1.getSaldo()}")
    println("Saldo de ${conta2.titular}: R$ ${conta2.getSaldo()}")
    println("Saldo de ${conta3.titular}: R$ ${conta3.getSaldo()}")
}