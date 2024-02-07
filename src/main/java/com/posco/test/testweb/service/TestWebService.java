package com.posco.test.testweb.service;


import com.posco.test.testweb.entity.Job;
import com.posco.test.testweb.model.ReqVo;
import com.posco.test.testweb.respository.TestWebRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TestWebService {
    private final TestWebRepository testWebRepository;
    public void save(ReqVo reqVo){
        testWebRepository.save(Job.builder()
        .id(reqVo.getId())
        .jobname(reqVo.getName())
        .patterns(reqVo.getPatterns())
        .jsontext(reqVo.getJson())
        .regdt(LocalDateTime.now())
        .build());
    }
    public List<Job> search() {
        return testWebRepository.findAll();
    }
    public Job search(String id) {
        return testWebRepository.findById(Long.parseLong(id)).orElseThrow(
                ()->new RuntimeException("error")
        );
    }

}
