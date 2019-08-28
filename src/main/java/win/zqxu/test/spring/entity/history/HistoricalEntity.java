package win.zqxu.test.spring.entity.history;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(HistoricalListener.class)
public abstract class HistoricalEntity {
  
}
