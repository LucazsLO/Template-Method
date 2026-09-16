import java.util.List;


public abstract class RelatorioBase {

    public final void gerar() {
        obterDados();
        processar();
        formatarSaida();
        exportar();
    }

    protected abstract List<Object[]> obterDados();

    protected abstract void formatarSaida();

    protected void processar() {
        System.out.println("Processando os dados...");
    }

    protected void exportar() {
        System.out.println("Exportando relatório para PDF...");
    }
}
