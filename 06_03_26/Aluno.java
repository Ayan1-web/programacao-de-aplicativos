public class Aluno{
    private String nome;
    private double[] notas;

   public Aluno(){
        
   }

    public Aluno(String nome, double[]notas){
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome(){
        return this.nome;
    }
    public double[] getNotas(){
        return this.notas;
    }
    public void setNotas(double[]notas){
        this.notas = new double[notas.length];
        for (int i=0; i<notas.length;i++){
            if (notas[i]<0 || notas[i]>10){
                double[] notas2 = this.notas;
                this.notas = new double[i-1];
                this.notas = notas2;
                System.out.println("Nota inválida");
                return;
            }
            this.notas[i] = notas[i];
        }
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public double media(){
        double soma = 0;
        for(int i =0; i< this.notas.length; i++){
            soma +=notas[i];
        }
    double calc_media = soma/notas.length;
    return calc_media;
    }
    public void resultado(double calc_media){
        if (calc_media>=7){
            System.out.println("Aprovado com a média: "+calc_media);
        }else{
            System.out.println("Reprovado com a média: "+calc_media);
        }
    }
}