package com.example.CompanyService.service;


import java.util.List;

import com.example.CompanyService.dto.IpoDto;

public interface IpoService
{
    public List<IpoDto> findAll();
    public IpoDto findById(String id);
    public IpoDto save(IpoDto ipoDto);
    public IpoDto update(IpoDto ipoDto);
    public void deleteById(String id);
}
