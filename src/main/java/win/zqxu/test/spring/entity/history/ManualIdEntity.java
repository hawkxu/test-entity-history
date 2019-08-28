package win.zqxu.test.spring.entity.history;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ManualIdEntity extends HistoricalEntity {
  @Id
  private int id;
  private int counter;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }
}
