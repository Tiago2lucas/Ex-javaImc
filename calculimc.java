package Ex;

import java.text.DecimalFormat;

public class calculimc {
    private double altura;
    private double peso;

    public calculimc(double peso, double altura) {

        setAltura(altura);
        setPeso(peso);
    }

    public void calcularImc() {
        double imc = this.getPeso() / (this.getAltura() * this.getAltura());
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedImc = df.format(imc);

        double pesoIdeal = 24.9 * (altura * altura);

        double diferencaPeso = pesoIdeal - this.getPeso(); // Calcula a diferença de peso

        if (imc <= 18.5 && peso <= 58.7) {
            System.out.println("Você está abaixo do peso: " + ", seu peso: " + formattedImc);
            System.out.println("Você precisa ganhar " + df.format(diferencaPeso) + " kg para atingir o peso ideal.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você está no peso ideal.");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Você está acima do sobrepeso.");
            System.out.println("Você precisa perder " + df.format(diferencaPeso) + " kg para atingir o peso ideal.");
        } else if (imc >= 30) {
            System.out.println("Você está na categoria de obesidade.");
            System.out.println("Você precisa perder " + df.format(diferencaPeso) + " kg para atingir o peso ideal.");
        }

        System.err.println("O valor do seu IMC é " + formattedImc);

    }

    /**
     * @return float return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return float return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

}
