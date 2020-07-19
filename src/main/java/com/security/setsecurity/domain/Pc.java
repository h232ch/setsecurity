package com.security.setsecurity.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pc {

    @Id
    @GeneratedValue
    @Setter
    private Long id;

    private String ip;
    private String time;
    private String status;

//    @Builder
//    public Pc(String ip, String time, String status){
//        this.ip = ip;
//        this.time = time;
//        this.status = status;
//    }


}
