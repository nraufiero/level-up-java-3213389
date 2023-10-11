package com.linkedin.javacodechallenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static List<String> findStudentsWithIncompleteVolunteerEvents(
            List<String> students,
            Map<String, List<String>> attendeesMapping) {
        // TODO: implement function
        Map<String, Integer> studentEvents = new HashMap<>(); 
        for(String student : students) {
                studentEvents.put(student,0);
        }
        for(String event : attendeesMapping.keySet()) {
                for(String name : attendeesMapping.get(event)) {
                        if(students.contains(name))
                                studentEvents.put(name, studentEvents.get(name) + 1);
                } 
        }
        return studentEvents.entrySet().stream()
                .filter(e -> e.getValue() < 2)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> students = List.of("Sally", "Polly", "Molly",
                "Tony", "Harry");

        Map<String, List<String>> attendeesMapping = Map.of("Farmer's Market", List.of("Sally", "Polly"),
                "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
                "Midnight Breakfast", List.of("Polly", "Molly"));

        System.out.println(findStudentsWithIncompleteVolunteerEvents(
                students, attendeesMapping));
    }

}
