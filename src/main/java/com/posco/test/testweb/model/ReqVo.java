package com.posco.test.testweb.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReqVo {
    public Long id;
    public String name;
    public String patterns;
    public String json;
}
