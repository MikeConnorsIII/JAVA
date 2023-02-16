package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class Course {
	    
	    @RequestMapping("m/{track}/{module}/{lesson}")
	    public String showLesson(@PathVariable("track") String track, 
	            @PathVariable("module") String module, 
	        @PathVariable("lesson") String lesson){
	        return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
	    }

	}

