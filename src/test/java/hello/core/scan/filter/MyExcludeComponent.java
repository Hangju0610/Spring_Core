package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) //Class에 붙는 타입?
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
