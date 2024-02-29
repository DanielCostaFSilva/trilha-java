public class Cliente {
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private float saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

//    public void criarCliente(Cliente cliente){
//
//    }

    @Override
    public String toString() {

        return "Olá " + nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta " +numeroConta+" e seu saldo "+saldo+" já está disponível para saque";


    }
}
