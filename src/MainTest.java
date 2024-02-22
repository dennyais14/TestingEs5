import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    Main test1 = new Main();

    @Test
    public void getYearPlusOne() {
        String date1 = "2023-03-01T13:00Z";
        OffsetDateTime data1 = OffsetDateTime.parse(date1);
        OffsetDateTime data2 = data1.plusYears(1);
        OffsetDateTime result = test1.getDatePlusYearOne(data1);
        assertEquals(data2, result);
    }

    @Test
    public void getMonthMinusOne() {
        String date1 = "2023-03-01T13:00Z";
        OffsetDateTime data1 = OffsetDateTime.parse(date1);
        OffsetDateTime data2 = data1.minusMonths(1);
        OffsetDateTime result = test1.getDateMinusMonthOne(data1);
        assertEquals(data2, result);
    }
}