package com.microstream.service;

import com.microstream.model.FullName;
import org.springframework.stereotype.Component;

import com.microstream.model.MicroStream;

@Component
public interface MicrostreamService {

	MicroStream getInfo();

	MicroStream getCustomInfo(String courseName, String courseType, FullName instructorName);

}