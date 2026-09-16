public class Main {
    public static void main(String[] args) {
        System.out.println(" Relatório de Vendas");
        RelatorioBase relatorioVendas = new RelatorioVendas();
        relatorioVendas.gerar();

        System.out.println("\n Relatório Financeiro");
        RelatorioBase relatorioFinanceiro = new RelatorioFinanceiro();
        relatorioFinanceiro.gerar();
    }
}