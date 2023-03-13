package hello.typeconverter.formatter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MyNumberFormatterTest {

    MyNumberFormatter formatter = new MyNumberFormatter();
    @Test
    void parse() throws ParseException {
        Number result = formatter.parse("1,000,000", Locale.KOREA);
        assertThat(result).isEqualTo(1000000L); //parse결과가 Long이다.
    }

    @Test
    void print() {
        String result = formatter.print(1000000, Locale.KOREA);
        assertThat(result).isEqualTo("1,000,000");
    }
}