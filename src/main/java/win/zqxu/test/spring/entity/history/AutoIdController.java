package win.zqxu.test.spring.entity.history;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auto-id")
public class AutoIdController {
  @Autowired
  private AutoIdRepository repo;

  @PostMapping
  public AutoIdEntity create() {
    AutoIdEntity entity = new AutoIdEntity();
    entity.setCounter(1);
    return repo.save(entity);
  }
}
