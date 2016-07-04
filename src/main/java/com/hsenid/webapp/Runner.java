package com.hsenid.webapp;

/**
 * Created by hsenid on 5/24/16.
 */

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class Runner {
    @Scheduled(fixedRate=2000,initialDelay = 5000)
    public void run(){
        System.out.println("run()");
    }
}
