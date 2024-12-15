package med.voll.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest // Indica que este é um teste focado em controllers
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private HelloController helloController;

    @Test
    void testOlaMundoDeveRetornarMensagemDeSucesso() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("sucess"));
        helloController.olaMundo().entrySet();
    }
}