/**
 * 
 */
package org.yukthi.edutool.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.yukthi.edutool.entity.Student;
import org.yukthi.edutool.exception.ServiceException;
import org.yukthi.edutool.service.StudentService;

/**
 * @author jayaram
 *
 */
@Controller
@RequestMapping(value="Students")
public class StudentRest {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping(method=RequestMethod.POST)
	public int createSttudent(@RequestBody Student student) throws ServiceException
	{
		studentService.addStudent(student);
		return 1;
	}
}
