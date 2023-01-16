public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta conta4 = new Conta();

        System.out.println(conta4.getSaldo());

        conta4.titular = new Cliente();
        //conta4.titular para de ser null após ser instanciado acima
        System.out.println(conta4.titular);

        conta4.titular.nome = "Marcela";
        System.out.println(conta4.titular.nome);
    }
}
