package com.security.setsecurity.application;

import com.security.setsecurity.domain.Pc;
import com.security.setsecurity.interfaces.PcService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.StringContains.containsString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PcController.class)
public class PcControllerTest {

    @Autowired
    private MockMvc mvc;


    @MockBean
    private PcService pcService;

    @Test
    public void list() throws Exception{
        List<Pc> pcs = new ArrayList<>();
        pcs.add(Pc.builder()
                .id(1004L)
                .ip("10.10.10.10")
                .time("10.10.10.10")
                .status("Ok")
                .build());

        System.out.println(pcs.get(0).getId());

        given(pcService.getPcs()).willReturn(pcs);

        mvc.perform(get("/pcs"))
                .andExpect(status().isOk());

    }

}