package com.example.demo.client;

import com.example.demo.data.ArmEntry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@FeignClient(name = "${feign.name}", url = "${feign.url}")
public interface ArmClient {

    @RequestMapping(method = RequestMethod.GET, value = "/Elosnapshot/GetAllResults")
    Map<String, List<ArmEntry>> getAllResults();
}
