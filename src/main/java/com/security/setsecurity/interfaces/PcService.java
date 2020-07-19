package com.security.setsecurity.interfaces;

import com.security.setsecurity.domain.Pc;
import com.security.setsecurity.domain.PcNotFoundException;
import com.security.setsecurity.domain.PcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PcService {

    private PcRepository pcRepository;

    @Autowired
    public PcService(PcRepository pcRepository){
        this.pcRepository = pcRepository;
    }

    public List<Pc> getPcs(){
        List<Pc> pcs = pcRepository.findAll();
        return pcs;
    }

    public Pc getPc(Long id){
        Pc pc = pcRepository.findById(id)
                .orElseThrow(() -> new PcNotFoundException(id));
        return pc;
    }

    public Pc addPc(Pc pc){
        return pcRepository.save(pc);
    }

}
