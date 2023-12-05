package com.net.springboot.demo.mysbapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for team.leader.name and team.name
    @Value("${team.leader.name}")
    private String teamLeaderName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for teamInfo
    @GetMapping("/team-info")
    public String getTeamInfo() {
        return "Team Leader: " + teamLeaderName + ", Team Name: " + teamName;
    }

    //expose "/" for saying hello
    @GetMapping("/")
    public String sayHello(){
        return "Yo there!!!";
    }

    //expose new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    //expose a new endpoint for fortune
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!!!";
    }

}
