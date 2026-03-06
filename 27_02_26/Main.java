public class Main {
public static void main(String[] args) {
    
    //ALUNOS
    Aluno a = new Aluno("", 18, "RUY");
    Aluno b = new Aluno("", 19, "KMI");
    Aluno c = new Aluno("", 18, "TRE");
    Aluno d = new Aluno("", 19, "AAB");
    Aluno e = new Aluno("", 18, "OPQ");

    //DEFININDO NOMES
    a.setName("Ayan");
    b.setName("Jorge");
    c.setName("Felipe");
    d.setName("Caio");
    e.setName("Eduardo");
    
    //DADOS DOS ALUNOS
    System.out.print(a.getName() +" "+a.getAge()+" "+a.getRegistration());
    System.out.print(b.getName() +" "+b.getAge()+" "+b.getRegistration());
    System.out.print(c.getName() +" "+c.getAge()+" "+c.getRegistration());
    System.out.print(d.getName() +" "+d.getAge()+" "+d.getRegistration());
    System.out.print(e.getName() +" "+e.getAge()+" "+e.getRegistration());
}    
}
