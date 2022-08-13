public class ServicoPaypal implements ServicoPagamento{
    private Double taxa = 0.02;
    private Double juros = 0.01;
    
    @Override
    public Double calculaTaxa(Double valor) {
        return valor * taxa;
    }
    
    @Override
    public Double calculaJuros(Double valor, int parcelas) {
        return valor * juros * parcelas;
    }
}