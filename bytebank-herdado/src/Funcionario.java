public class Funcionario {

    private String nome;
    private String cpf;
    private double salario; //o ideal sempre é ser private

    public double getBonificacao(){
        //perceba que dessa forma abaixo, o texto seria printado ao chamar os métodos filhos de getBonificacao,
        //pois nos tipos Gerente e Editor de vídeo eu chamo o getBonificacao de Funcionario usando "super"
        //System.out.println("Chamando o método do funcionário");
        return this.salario * 0.05;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
