import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzato per l'Italia
//Crea dei test per questo esercizio
//i test verificano il metodo
//che aggiunge un anno alla data1
//e il metodo che toglie alla data1 1 mese
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        data1 = getDatePlusYearOne(data1);
        data1 = getDateMinusMonthOne(data1);
        data1 = data1.plusDays(7);
        DateTimeFormatter date1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withLocale(Locale.ITALY).withZone(ZoneId.of("Europe/Rome"));
        String dataFormat1 = data1.format(date1);
        System.out.println(dataFormat1);
    }

    public static OffsetDateTime getDateMinusMonthOne(OffsetDateTime data1) {
        return data1.minusMonths(1);
    }

    public static OffsetDateTime getDatePlusYearOne(OffsetDateTime data1) {
        return data1.plusYears(1);
    }
}