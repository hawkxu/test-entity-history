package win.zqxu.test.spring.entity.history;

import javax.persistence.EntityManager;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

public class HistoricalListener {
  private static boolean PRE_PERSIST_MANUAL_ID = true;

  public static void setPrePersistManulId(boolean prePersistManulId) {
    PRE_PERSIST_MANUAL_ID = prePersistManulId;
  }

  @PrePersist
  public void prePersist(Object entity) {
    if (PRE_PERSIST_MANUAL_ID && entity instanceof ManualIdEntity)
      saveHistory(entity);
  }

  @PostPersist
  public void postPersist(Object entity) {
    if (!PRE_PERSIST_MANUAL_ID || !(entity instanceof ManualIdEntity))
      saveHistory(entity);
  }

  private void saveHistory(Object entity) {
    EntityManager em = BeanUtils.getBean(EntityManager.class);
    HistoryEntity history = new HistoryEntity();
    history.setName(entity.getClass().getName());
    history.setAction("CREATE");
    history.setEntityId((Integer) em.getEntityManagerFactory()
        .getPersistenceUnitUtil().getIdentifier(entity));
    em.persist(history);
  }
}
