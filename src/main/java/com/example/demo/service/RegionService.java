package com.example.demo.service;

import com.example.demo.entity.Region;
import com.example.demo.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {
    @Autowired
    private RegionRepository regionRepository;

    //按id查找
    public Region findById(Integer id){return regionRepository.findById(id).get();}
    //查找全部
    public List<Region> findAll(){ return regionRepository.findAll(); }

}
