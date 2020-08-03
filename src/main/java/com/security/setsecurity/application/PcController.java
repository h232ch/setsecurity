package com.security.setsecurity.application;

import com.security.setsecurity.domain.Pc;
import com.security.setsecurity.interfaces.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class PcController {

    @Autowired
    private PcService pcService;

    @GetMapping("/pcs")
    public List<Pc> list(){
        List<Pc> pcs = pcService.getPcs();
        return pcs;
    }

    @GetMapping("/pcs/{id}")
    public Pc detail(@PathVariable("id") Long id){
        Pc pc = pcService.getPc(id);
        return pc;
    }

    @PostMapping("/pcs")
    public ResponseEntity<?> create(@RequestBody Pc resource)
        throws URISyntaxException {
        Pc pc = pcService.addPc(
                Pc.builder()
                .ip(resource.getIp())
                .mac(resource.getMac())
                .time(resource.getTime())
                .status(resource.getStatus())
                .build()
        );

        URI location = new URI("/pcs/"+pc.getId());
        return ResponseEntity.created(location).body("{}");
    }





}
