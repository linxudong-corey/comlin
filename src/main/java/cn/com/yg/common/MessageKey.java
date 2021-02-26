package cn.com.yg.common;

import com.google.common.base.CaseFormat;
import java.io.IOException;
import java.util.Formattable;
import java.util.Formatter;
import java.util.ResourceBundle;

public interface MessageKey extends Formattable {
    default String prefix() {
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, this.getClass().getSimpleName());
    }

    String name();

    default String key() {
        return this.prefix() + '.' + this.name();
    }

    default String message() {
        ResourceBundle rb = ResourceBundle.getBundle("i18n/" + this.prefix());
        String n = this.name();
        return rb.containsKey(n) ? rb.getString(n) : n;
    }

    default void formatTo(Formatter formatter, int flags, int width, int precision) {
        try {
            formatter.out().append(this.message());
        } catch (IOException var6) {
            throw Errors.wrap(var6);
        }
    }
}
