package win.zqxu.test.spring.entity.history;

import org.springframework.context.ApplicationContext;

public class BeanUtils {
  private static ApplicationContext context;

  static void initApplicationContext(ApplicationContext context) {
    BeanUtils.context = context;
  }

  public static <T> T getBean(Class<T> requiredType) {
    return context.getBean(requiredType);
  }
}
