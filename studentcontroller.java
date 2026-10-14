package com.kiet.student.controller;

import org.springframework.web.bind.annotation.*;
import com.kiet.student.Model.Student;

import java.util.ArrayList;
import java.util.List;

@RestController 
@RequestMapping ("/students")
public class studentcontroller {
    List<Student> user = new ArrayList<>();

    @PostMapping
    public String addUser(@RequestBody Student u) {
        user.add(u);
        return "Student Added "+ u.getName();
    }

    @GetMapping
    public List<Student> getUser() {
        return user;
    }   

    @GetMapping ("/{id}")
    public Student getUserById(@PathVariable Long id) {
        for (Student u : user) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    @DeleteMapping ("/{id}")
    public String deleteUserById(@PathVariable Long id) {
        for (Student u : user) {
            if (u.getId().equals(id)) {
                user.remove(u);
                return "User Deleted "+ id;
            }
        }
        return "User Not Found";
    }

    @GetMapping ("/search")
    public List<Student> searchUser(@RequestParam String branch, @RequestParam int year ) {
        List<Student> result = new ArrayList<>();
        for (Student u : user) {
            if (u.getBranch().equalsIgnoreCase(branch) && u.getYear() == year) {
                result.add(u);
            }
        }
        return result;

    }

	@GetMapping ("/topper")
	public List<Student> getTopper(@RequestParam double cgpa) {
		List<Student> result = new ArrayList<>();
		for (Student u : user) {
			if (u.getCgpa() >= cgpa) {
				result.add(u);
			}
		}
		return result;
	}

}
