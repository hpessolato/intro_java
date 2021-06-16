// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {

        calcularAreaModoExtenso();
        calcularAreaModoCurto();

    }

    public static void calcularAreaModoCurto() {
        System.out.println("Cálculo de Áreas Modo Curto");

        int largura = 5;
        int comprimento = 4;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");
    }

    public static void calcularAreaModoExtenso() {
        System.out.println("Cálculo de Áreas Modo Extenso");

        // Cálculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 6;
        comprimento = 9;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de "
                + comprimento + "m a área é de " + largura * comprimento + "m²");

    }
}

