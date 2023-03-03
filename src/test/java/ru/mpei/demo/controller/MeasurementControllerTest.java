package ru.mpei.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import ru.mpei.demo.model.Measurement;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MeasurementControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    public void getById() throws Exception {
        Measurement expected = new Measurement(12, 12, 12, 22, 22, 22);
        expected.setId(2);

        mockMvc.perform(MockMvcRequestBuilders.get("/measurement/get?id=2"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(content().string(mapper.writeValueAsString(expected)))
                .andExpect(status().is(200));
    }


    @Test
    public void saveTest() throws Exception {
        Measurement expected = new Measurement(12, 12, 12, 22, 22, 22);

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/measurement/add?equipmentId=1")
                        .content(mapper.writeValueAsString(expected))
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().is(200));
    }

}