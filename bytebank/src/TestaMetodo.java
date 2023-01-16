public class TestaMetodo {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 100;
        conta1.deposita(50);
        System.out.println("Valor da conta1: " + conta1.saldo);

        boolean conseguiuRetirar = conta1.saca(50);
        System.out.println("Valor da conta1 após saque: " + conta1.saldo);
        //System.out.println(conseguiuRetirar);

        Conta conta2 = new Conta();
        conta2.deposita(1000);
        System.out.println("valor da conta 2: " + conta2.saldo);

        boolean sucessoTransferencia = conta2.transfere(300, conta1);
        if(sucessoTransferencia){
            System.out.println("transferêcia feita com sucesso");
        }
        else{
            System.out.println("faltou dinheiro");
        }
        System.out.println("valor da conta 2 após transferência: " + conta2.saldo);
        System.out.println("valor da conta 1 após transferência: " + conta1.saldo);
    }
}
