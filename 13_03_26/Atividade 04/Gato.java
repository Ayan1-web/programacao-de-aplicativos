public class Gato extends Animal{
    private String cor;

    public Gato(String cor, String nome, double peso){
        super(nome, peso);
        this.cor = cor;
    }

    @Overload
    public void mostrarAnimal(){
        System.out.println("Cor: "+this.cor+getNome());
    }
}
