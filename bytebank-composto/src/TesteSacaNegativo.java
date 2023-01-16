public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta5 = new Conta();
        conta5.deposita(100);
        System.out.println(conta5.saca(200));

        //queremos proibir que o código abaixo seja executado
        //para que o usuário só faça alterações por meio de métodos
        //conta.saldo = conta.saldo  -101;
        //System.out.println(conta.saldo);

        System.out.println(conta5.getSaldo());




    }
}
