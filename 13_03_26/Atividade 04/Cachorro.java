public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String raca, String nome, double peso){
        super(nome, peso);
        this.raca = raca;
    }

    @Overload
    public void mostrarAnimal(){
        System.out.println("Raça: "+this.raca+getNome());
    }
}