package win.zqxu.test.spring.entity.history;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HistoryEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long recid;
  @Column(length = 80)
  private String name;
  @Column(length = 10)
  private String action;
  private int entityId;

  public long getRecid() {
    return recid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public int getEntityId() {
    return entityId;
  }

  public void setEntityId(int entityId) {
    this.entityId = entityId;
  }
}
