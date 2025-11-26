package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // 1. Testes de operações válidas
        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        // 2. Teste de Divisão por Zero (exceção esperada)
        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 3. Teste de Operador Inválido (exceção esperada)
        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}