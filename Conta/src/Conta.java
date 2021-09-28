public class Conta {

    int numero; 
    String titular;
    double saldo;

    void saca(double quantidade) {
        this.saldo -= quantidade;
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }

}
