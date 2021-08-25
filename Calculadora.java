
package tp1_ejercicio1;


public class Calculadora {
    //Atributos
    private float num1;
    private float num2;
    private float resultado;


    public Calculadora(float num1, float num2, float resultado){
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }
    //Metodos
    public float suma(){
        this.resultado = this.num1 + this.num2;
        return(this.resultado);
    }
    
    public float resta(float num1, float num2){
        return(num1 - num2);
    }
    
    public float multiplicacion(float num1, float num2){
        return(num1 * num2);
    }
    
    public float division(float num1, float num2){
        return(num1 / num2);
    }
    
}

