package win.zqxu.test.spring.entity.history;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
@AutoConfigureDataJpa
public class ApplicationTests implements ApplicationContextAware{
  @Autowired
  private MockMvc mock;

  @Override
  public void setApplicationContext(ApplicationContext context) {
    BeanUtils.initApplicationContext(context);
  }
  
	@Test
	public void test() throws Exception {
	  mock.perform(post("/auto-id")).andDo(print());
    mock.perform(post("/manual-id")).andDo(print());
    mock.perform(get("/history")).andDo(print());
    HistoricalListener.setPrePersistManulId(false);
    mock.perform(post("/manual-id")).andDo(print());
    mock.perform(get("/history")).andDo(print());
	}
}
