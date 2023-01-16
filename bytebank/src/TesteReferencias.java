public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        //FAZENDO DUAS REFERÊNCIAS AO MESMO OBJETO
        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda: " + segundaConta.saldo);

        segundaConta.saldo +=100;
        System.out.println("saldo da segunda: " + segundaConta.saldo);

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("mesma conta");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
