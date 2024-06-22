import br.com.bancodigital.banco.Banco;
import br.com.bancodigital.cliente.Cliente;
import br.com.bancodigital.conta.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        int agencia, numeroConta, senha;

        Banco banco = new Banco("Banco 1");
        banco.criarAgencia(123);

        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setCpf("123.456.789-10");
        cliente.setEmail("joao@example.com");

        agencia = 123;
        numeroConta = 1;
        senha = 1234;
        Conta conta = new Conta(agencia, numeroConta, cliente);
        conta.depositar(100,1);
        conta.imprimirInfoConta(agencia,numeroConta,senha);
        conta.sacar(200, senha);
        conta.imprimirInfoConta(agencia,numeroConta,senha);

    }
}
