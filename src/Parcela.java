import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
    Double valorParcela;
    LocalDate data;

    public Parcela(Double valorParcela, LocalDate data) {
        this.valorParcela = valorParcela;
        this.data = data;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        var fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return fmt1.format(data) + " - " + valorParcela + "\n";
    }
}