package calculadora;

/**
 * <strong>Projeto Calculadora</strong>
 * * <p>Esta classe fornece operações matemáticas básicas como soma, subtração, 
 * multiplicação e divisão, além de um método principal que seleciona a operação 
 * desejada com base em um operador informado pelo usuário.</p>
 * <p>Esse projeto é utilizado para demonstrar:</p>
 * <ul>
 * <li>Técnicas de revisão estática (caixa branca)</li>
 * <li>Técnicas de revisão (caixa branca)</li>
 * <li>Aplicação de refatoração em código Java</li>
 * <li>Documentação com Javadoc</li>
 * </ul>
 * * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>, 
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 * * @author Mateus Franco
 * @version 1.0
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     * * @param a O primeiro operando
     * @param b O segundo operando
     * @return O resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número do primeiro.
     *
     * @param a O primeiro operando (minuendo)
     * @param b O segundo operando (subtraendo)
     * @return O resultado da subtração de {@code a} e {@code b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a O primeiro operando
     * @param b O segundo operando
     * @return O resultado da multiplicação de {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número pelo segundo.
     *
     * @param a O primeiro operando (dividendo)
     * @param b O segundo operando (divisor)
     * @return O resultado da divisão de {@code a} por {@code b}
     * @throws IllegalArgumentException se o divisor {@code b} for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * <p>Executa a operação matemática solicitada com base no operador informado.</p>
     * * <p>Operadores aceitos:</p>
     * <ul>
     * <li>"+" : Soma</li>
     * <li>"-" : Subtração</li>
     * <li>"*" : Multiplicação</li>
     * <li>"/" : Divisão</li>
     * </ul>
     * <p>Qualquer operador inválido resulta em exceção.</p>
     * * @param a O primeiro operando
     * @param b O segundo operando
     * @param operador Símbolo da operação desejada
     * @return O resultado da operação correspondente ao operador informado
     * @throws IllegalArgumentException se o operador não for um símbolo válido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}