public class TesteReferencias {

    public static void main(String[] args) {

        Funcionario g2 = new Gerente();
        g2.setNome("Marcelo");

        g2.autentica(2222);
        System.out.println(g2.getNome());
    }
}
