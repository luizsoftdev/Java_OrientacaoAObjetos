

public class CriaConta {

    public static void main(String[] args) {
        //o new aloca memória para armazenar um novo objeto
        Conta primeiraConta = new Conta(); // a variável primeiraConta aqui é uma referência a um objeto do tipo Conta
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;
        System.out.println(segundaConta.saldo);

        System.out.println("primeira conta tem: " + primeiraConta.saldo);
        System.out.println("segunda conta tem: " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        System.out.println(primeiraConta.titular);

        System.out.println(segundaConta.agencia);
        segundaConta.agencia = 146;

        System.out.println("agora a segunda conta é da agência: " + segundaConta.agencia);

        if (primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        } else{
            System.out.println("contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
