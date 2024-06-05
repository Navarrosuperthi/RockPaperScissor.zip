import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        // Definindo as opções do jogo
        String[] options = {"Pedra", "Papel", "Tesoura"};
        
        // Criando um objeto Random para gerar números aleatórios
        Random random = new Random();
        
        // Simulando o jogo várias vezes
        for (int i = 0; i < 10; i++) { // Altere o número 10 para quantas vezes desejar simular o jogo
            // Gerando um número aleatório entre 0 e 2 (inclusive)
            int randomNumber = random.nextInt(3);
            
            // Exibindo a escolha aleatória
            System.out.println("Jogador escolheu: " + options[randomNumber]);
        }
    }
}