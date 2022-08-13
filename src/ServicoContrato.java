import java.time.LocalDate;

public class ServicoContrato {
    private ServicoPagamento servicoPagamento;

    public ServicoContrato(ServicoPagamento servicoPagamento) {
        this.servicoPagamento = servicoPagamento;
    }

    public void fazerContrato(Contrato contrato, int meses){

        Double divisaoBruta = contrato.getValor() / meses;

        for (int i = 0; i < meses; i++) {
            Double aux = divisaoBruta;
            aux = aux + servicoPagamento.calculaJuros(aux, (i+1));
            aux += servicoPagamento.calculaTaxa(aux);
            addParcela(aux, contrato.getData().plusMonths(i+1), contrato);
        }
    }

    public static void addParcela(Double valor, LocalDate data, Contrato contrato){
        Parcela parcela = new Parcela(valor, data);
        contrato.getParcelas().add(parcela);
    }
}