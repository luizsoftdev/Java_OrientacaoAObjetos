public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Nico Steppot");
        funcionario.setCpf("283.819.273-08");
        funcionario.setSalario(2600.00);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());
    }
}
