package com.pengsoo.home;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class MemberDto {

	
	private String id;
	private String name;
	private String email;
	private int age;
}
