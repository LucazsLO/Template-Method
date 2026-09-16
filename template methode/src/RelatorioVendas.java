import java.util.List;


public class RelatorioVendas extends RelatorioBase {

    @Override
    protected List<Object[]> obterDados() {
        System.out.println("Buscando dados de vendas...");
        return List.of();
    }

    @Override
    protected void formatarSaida() {
        System.out.println("Formatando relatório de vendas...");
    }

    @Override
    protected void exportar() {
        System.out.println("Exportando relatório para Excel...");
    }
}
