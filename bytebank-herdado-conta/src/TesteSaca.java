public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123,321);
        conta.deposita(200.0);

        try{
            conta.saca(210.0);
        }catch(SaldoInsuficienteException e){
            System.out.println("Exceção: " + e.getMessage());
        }


        System.out.println(conta.getSaldo());
    }
}
