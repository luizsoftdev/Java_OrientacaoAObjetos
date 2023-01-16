public class TestaBanco{

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.nome = "Paulo Silveira";
        cliente1.cpf = "111.111.111-11";
        cliente1.profissao = "programador";

        Conta conta3 = new Conta();
        conta3.deposita(100);

        //asssocia o cliente1 a conta3
        conta3.titular = cliente1;
        System.out.println(conta3.titular.nome);
    }

}
