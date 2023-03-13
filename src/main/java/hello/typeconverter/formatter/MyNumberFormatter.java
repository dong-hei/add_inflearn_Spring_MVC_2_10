package hello.typeconverter.formatter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.Formatter;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

@Slf4j
public class MyNumberFormatter implements Formatter<Number> {

    @Override
    public Number parse(String text, Locale locale) throws ParseException {
        log.info("text={}, locale={}", text, locale);
        // 1,000 -> 1000 중간에 쉼표를 적용하려면 NumberFormat을 사용하면 된다.
        NumberFormat format = NumberFormat.getInstance(locale);
        //Parse는 문자를 숫자로 변환해 준다

        Number parse = format.parse(text);
        return format.parse(text);
    }

    @Override
    public String print(Number object, Locale locale) {
        log.info("text={}, locale={}", object, locale);
        return NumberFormat.getInstance(locale).format(object);
    }
}
