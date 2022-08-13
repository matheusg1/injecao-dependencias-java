import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    int numero;
    Double valor;
    LocalDate data;
    List<Parcela> parcelas = new ArrayList<>();

    public Contrato(int numero, Double valor, LocalDate data) {
        this.numero = numero;
        this.valor = valor;
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }
}