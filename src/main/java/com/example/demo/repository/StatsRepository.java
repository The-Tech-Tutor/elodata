package com.example.demo.repository;

import com.example.demo.data.Stats;
import com.example.demo.data.StatsPk;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StatsRepository extends PagingAndSortingRepository<Stats, StatsPk> {

}
