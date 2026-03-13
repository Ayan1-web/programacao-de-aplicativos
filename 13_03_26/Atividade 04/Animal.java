public class Animal {
 private String nome;
 private double peso;
 
 public Animal(){

 }

public Animal(String nome, double peso){
    this.nome = nome;
    this.peso = peso;
}

public String getNome(){
    return nome;
}

public void mostrarAnimal(String nome, double peso){
    System.out.println("Nome: "+nome);
    System.out.println("Peso em quilos: "+peso);
}

}
