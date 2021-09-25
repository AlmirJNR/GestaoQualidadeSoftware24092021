package pratica2409.questao1;

public class Trapezio {
    float altura;
    float baseMaior;
    float baseMenor;

    Trapezio(float altura, float baseMaior, float baseMenor) {
        this.altura = altura;
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
    }
    
    //Metodo que Retorna a area do do trapezio
    public float calcularArea() {
        return ((baseMaior + baseMenor) * altura / 2);
    }

    //Metodo que Retorna a Mediana de Euler
    public float calcularMedianaEuler() {
        return ((baseMaior - baseMenor) / 2);
    }
}
