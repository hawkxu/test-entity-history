package win.zqxu.test.spring.entity.history;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/history")
public class HistoryController {
  @Autowired
  private HistoryRepository repo;

  @GetMapping
  public List<HistoryEntity> read() {
    return repo.findAll();
  }
}
