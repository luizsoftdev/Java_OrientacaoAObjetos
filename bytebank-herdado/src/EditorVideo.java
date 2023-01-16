
public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        //System.out.println("chamando o método do editor de vídeo");
        return super.getBonificacao() + 100.0;
    }

}