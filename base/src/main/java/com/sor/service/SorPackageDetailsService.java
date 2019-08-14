package com.sor.service;

import com.sor.entity.SorPackageDetails;

import java.util.List;

public interface SorPackageDetailsService {
    public List<SorPackageDetails> findById(String id);
}
