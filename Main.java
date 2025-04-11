public class Main {
    public static void main(String[] args) {
        Garrafa garrafa = new Garrafa("Plástico", 2.0);
        garrafa.encher(1.5); // Enchendo a garrafa com 1.5 litros
        System.out.println("Quantidade atual: " + garrafa.getQuantidadeAtual() + " litros.");
        garrafa.esvaziar( 0.5); // Esvaziando 0.5 litros
         System.out.println("Quantidade atual: " + garrafa.getQuantidadeAtual() + " litros.");    }
}


