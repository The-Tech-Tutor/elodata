package com.example.demo.repository;

import com.example.demo.client.ArmClient;
import com.example.demo.data.ArmEntry;
import com.example.demo.data.Stats;
import com.example.demo.service.StatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StatsServiceImpl implements StatsService {

    private final ArmClient armClient;
    private final StatsRepository statsRepository;

    @Override
    public void saveStats() {
        List<Stats> statsList = new ArrayList<>();

        Map<String, List<ArmEntry>> dataMap = armClient.getAllResults();

        for(Map.Entry<String, List<ArmEntry>> list : dataMap.entrySet()) {
            for(ArmEntry armEntry : list.getValue()) {
                Stats stats = new Stats();
                stats.setId(armEntry.getId());
                stats.setWeightClassId(armEntry.getWeightClassId());
                stats.setDivision(armEntry.getDivision());
                stats.setArm(armEntry.getArm());
                stats.setFirstName(armEntry.getFirstName());
                stats.setLastName(armEntry.getLastName());
                stats.setElo(armEntry.getElo());
                statsList.add(stats);
            }
        }

        statsRepository.saveAll(statsList);
    }
}
