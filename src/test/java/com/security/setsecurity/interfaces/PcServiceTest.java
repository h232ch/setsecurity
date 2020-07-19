package com.security.setsecurity.interfaces;


import com.security.setsecurity.domain.Pc;
import com.security.setsecurity.domain.PcRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

public class PcServiceTest {

    @InjectMocks
    private PcService pcService;

    @Mock
    private PcRepository pcRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        mockPcRepository();
    }

    private void mockPcRepository(){
        List<Pc> pcs = new ArrayList<>();
        Pc pc = Pc.builder()
                .id(1004L)
                .ip("10.10.10.10")
                .time("10.10.10.10")
                .status("Ok")
                .build();
        pcs.add(pc);
        given(pcRepository.findAll()).willReturn(pcs);
        given(pcRepository.findById(1004L))
                .willReturn(Optional.of(pc));
    }

    @Test
    public void getPc(){
        Pc pc = pcService.getPc(1004L);
        assertThat(pc.getId()).isEqualTo(1004L);
    }

    @Test
    public void getPcs(){
        List<Pc> pcs = pcService.getPcs();
        Pc pc = pcs.get(0);
        System.out.println(pc.getId());
        assertThat(pc.getId()).isEqualTo(1004L);

    }

    @Test
    public void addPc(){

        given(pcRepository.save(any())).will(invocation -> {
            Pc pc = invocation.getArgument(0);
            pc.setId(1004L);
            return pc;
        });

        Pc pc = Pc.builder()
                .ip("10.10.10.10")
                .time("10.10.10.10")
                .status("Ok")
                .build();

        Pc created = pcService.addPc(pc);
        assertThat(created.getId()).isEqualTo(1004L);
    }

}