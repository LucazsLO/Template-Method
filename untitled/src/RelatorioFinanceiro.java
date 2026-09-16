import java.util.List;

public class RelatorioFinanceiro extends RelatorioBase {

    @Override
    protected List<Object[]> obterDados() {
        System.out.println("Buscando dados financeiros...");
        return List.of();
    }

    @Override
    protected void formatarSaida() {
        System.out.println("Formatando relatório financeiro...");
    }

}
