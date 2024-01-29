package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) //Class에 붙는 타입?
@Retention(RetentionPolicy.RUNTIME) // 해당 에너테이션이 언제까지 유지할 지 알려주는 에너테이션
@Documented
public @interface MyExcludeComponent {
}
