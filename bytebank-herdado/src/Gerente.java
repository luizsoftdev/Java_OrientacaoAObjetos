
//Ao herdar, a classe filha ganha todas as
// características (atributos) e todas as funcionalidades (métodos)
// da classe mãe
public class Gerente extends FuncionarioAutenticavel {

    //extends = Gerente é um funcionário. Gerente herda do funcionário

//    public boolean autentica(int senha) {
//        if (this.senha == senha) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    private String login;
//    //Um novo método, que pode variar na quantidade ou tipos
//    // de parâmetros, é uma SOBRECARGA de métodos
//    public boolean autentica(String login, int senha) {
//        if (this.senha == senha && this.login == login) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    //aqui temos uma REESCRITA DE UM MÉTODO DA CLASSE MÃE
    public double getBonificacao() {
        System.out.println("chamando o método de bonificação do gerente");
        return super.getSalario(); //super pois a variável está definida na classe mãe
    }


}