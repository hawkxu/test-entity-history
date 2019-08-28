package win.zqxu.test.spring.entity.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manual-id")
public class ManualIdController {
  @Autowired
  private ManualIdRepository repo;

  @RequestMapping
  public ManualIdEntity create() {
    ManualIdEntity entity = new ManualIdEntity();
    entity.setId(repo.getMaxId()+1);
    entity.setCounter(1);
    return repo.save(entity);
  }
}
