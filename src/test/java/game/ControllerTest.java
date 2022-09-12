package game;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(Controller.class)
public class ControllerTest {
  @Autowired
  private MockMvc mvc;

  @Test
  public void hello() throws Exception {
    this.mvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().string("Hello World!"));
  }
}
