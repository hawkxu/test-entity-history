package win.zqxu.test.spring.entity.history;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ManualIdRepository extends JpaRepository<ManualIdEntity, Integer>{
  @Query("SELECT coalesce(MAX(m.id), 0) FROM ManualIdEntity m")
  public int getMaxId();
}
