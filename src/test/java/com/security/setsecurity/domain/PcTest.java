package com.security.setsecurity.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PcTest {

    @Test
    public void creation(){
        Pc pc = Pc.builder()
                .id(1004L)
                .ip("10.10.10.10")
                .time("10.10.10.10")
                .status("Ok")
                .build();

        assertThat(pc.getId()).isEqualTo(1004L);

    }

}