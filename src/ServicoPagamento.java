public interface ServicoPagamento {

    Double calculaTaxa(Double valor);
    Double calculaJuros(Double valor, int parcelas);
}
