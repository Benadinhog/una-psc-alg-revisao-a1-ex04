public class SimuladorTributario {


    public static double calcularImpostoAntigo(double valorFaturamento, int aliquotaBase) {
        return valorFaturamento * (aliquotaBase / 100.0);
    }

    public static double calcularImpostoProposto(double valorFaturamento, int aliquotaProposta) {
        return valorFaturamento * (aliquotaProposta / 100.0);
    }

    public static double calcularDiferenca(double impostoAntigo, double impostoProposto) {
        return impostoProposto - impostoAntigo;
    }


    public void statusDialogo(boolean acessoAoGoverno) {
        if (acessoAoGoverno) {
            System.out.println("STATUS: Diálogo aberto. Há espaço para negociação.");
        } else {
            System.out.println("STATUS: Fintechs reclamam de falta de acesso ao governo. Risco de derrota política.");
        }
    }


    public static void main(String[] args) {
        double faturamento = 50000000.00;

        System.out.println("=== Análise de Tributação de Fintechs ===\n");
        System.out.printf("Faturamento Base: R$ %.2f%n%n", faturamento);

        System.out.println("-- Proposta A (9% -> 15%) --");
        double impostoA_antigo = calcularImpostoAntigo(faturamento, 9);
        double impostoA_proposto = calcularImpostoProposto(faturamento, 15);
        double aumentoA = calcularDiferenca(impostoA_antigo, impostoA_proposto);
        System.out.printf("Imposto Antigo (9%%): R$ %.2f%n", impostoA_antigo);
        System.out.printf("Imposto Proposto (15%%): R$ %.2f%n", impostoA_proposto);
        System.out.printf("Aumento de Imposto: R$ %.2f%n%n", aumentoA);

        System.out.println("-- Proposta B (15% -> 20%) --");
        double impostoB_antigo = calcularImpostoAntigo(faturamento, 15);
        double impostoB_proposto = calcularImpostoProposto(faturamento, 20);
        double aumentoB = calcularDiferenca(impostoB_antigo, impostoB_proposto);
        System.out.printf("Imposto Antigo (15%%): R$ %.2f%n", impostoB_antigo);
        System.out.printf("Imposto Proposto (20%%): R$ %.2f%n", impostoB_proposto);
        System.out.printf("Aumento de Imposto: R$ %.2f%n%n", aumentoB);

        System.out.println("-- Análise de Diálogo --");
        SimuladorTributario simulador = new SimuladorTributario();
        simulador.statusDialogo(true);
        simulador.statusDialogo(false);
    }
}