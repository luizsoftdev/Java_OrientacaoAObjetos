
//Conta é uma classe abstrata, não é um objeto "concreto", logo adicionando
//"abstract", impedimos que ela seja instanciada em outos lugares do código
public abstract class Conta {

    //ATRIBUTOS(OU CAMPOS OU PROPRIEDADES)
    protected double saldo; //é público para os filhos
    private int agencia;
    private int numero;
    private Cliente titular; //Composição

    //static sinaliza que o atributo é da classe em si
    private static int total = 0;


    //O java só me dá o construtor padrão se eu não tiver criado nenhum
    //Construtor padrão, é uma rotina de inicialização, executado apenas quando o objeto é criado
    public Conta(int agencia, int numero){
        //colocamos Conta.total pois total é um atributo da classe
        Conta.total++;

        //System.out.println("O total de contas é " + total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.getAgencia());
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException{
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    //Não é necessário ter um setSaldo() pois já temos funções
    //que deixam desnecessário criar um setter para saldo
    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <=0){
            System.out.println("O número não pode ter valor negativo ou nulo");
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("A agência não pode ter valor negativo ou nulo");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    //é um método estático pois é um método geral da classe
    //lembrando que não pode usar "this" dentro de um método estático
    //nem nada que referencie this
    public static int getTotal() {
        return Conta.total;
    }
}