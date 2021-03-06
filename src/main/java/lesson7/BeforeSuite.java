package lesson7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 1. Область действия аннотаци @Retention. Аннотация видна всем RUNTIME
@Retention(RetentionPolicy.RUNTIME)
// 2/ Для чего применяется аннотация. Для каких элеменетов?
@Target({ElementType.METHOD})
public @interface BeforeSuite {

}
