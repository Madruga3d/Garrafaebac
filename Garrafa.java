public class Garrafa {

        private String material;
        private double capacidade; // em litros
        private double quantidadeAtual; // em litros

        public Garrafa(String material, double capacidade) {
            this.material = material;        this.capacidade = capacidade;
            this.quantidadeAtual = 0;   }


        public void encher(double quantidade) {
            if (quantidadeAtual + quantidade <= capacidade) {
                quantidadeAtual += quantidade;            System.out.println("Garrafa cheia com " + quantidade + " litros.");
            } else {            System.out.println("Excesso de capacidade! Não é possível adicionar " + quantidade + " litros.");
            }
        }
        public void esvaziar(double quantidade) {
            if (quantidadeAtual >= quantidade) {
                quantidadeAtual -= quantidade;

                System.out.println("Garrafa esvaziada com" + quantidade + " litros.");
            } else {            System.out.println("Não há quantidade suficiente para esvaziar.");        }    }
        public double getQuantidadeAtual() {        return quantidadeAtual;    }    public String getMaterial() {
            return material;    }    public double getCapacidade() {        return capacidade;    }


    }



