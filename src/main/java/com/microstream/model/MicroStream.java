package com.microstream.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString
@EqualsAndHashCode
public class MicroStream {

	private String courseName;
	private String courseType;
	private FullName instructorName;
//	private FullName instrutorName;
	
//	public MicroStream(String courseName, String courseType, String instructorName) {
//		super();
//		this.courseName = courseName;
//		this.courseType = courseType;
//		this.instructorName = instructorName;
//	}

	// All possible set of constructors


//	public MicroStream(String instructorName) {
//		this.instructorName = instructorName;
//	}


	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "MicroStream{" + "courseName='" + courseName + '\'' + ", courseType='" + courseType + '\'' + ", instructorName='" + instructorName + '\'' + '}';
	}
}
