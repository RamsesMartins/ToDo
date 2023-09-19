package com.ramses.ToDo.Tasks;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
public class TaskAPI {
	@Autowired
	private TaskFACADE taskFacade;
	
	@PostMapping
	@ResponseBody
	public TaskDTO create(@RequestBody TaskDTO taskDTO) throws Exception{
		if(taskDTO.getTitle().isEmpty()) {
			throw new Exception("Não é válido valores nulos");
		}
		return taskFacade.save(taskDTO);
	}
	 
	@GetMapping("/{tarefa_id}")
	//@ResponseBody 
	public ModelAndView showTaskById(@PathVariable("tarefa_id") Long ID) {
		ModelAndView mvn = new ModelAndView();
		mvn.setViewName("/home/task");
		TaskDTO task = taskFacade.findById(ID).get();
		mvn.addObject("task", task);
		return mvn;
	}
	@GetMapping
	//@ResponseBody
	public ModelAndView showAll() {
		ModelAndView mvn = new ModelAndView();
		mvn.setViewName("/home/index");
		ArrayList<TaskDTO> task = (ArrayList<TaskDTO>) taskFacade.findAll();
		mvn.addObject("tasks", task);
		return mvn;
	}
	
	//@PutMapping("/{task_id}")
	@PatchMapping("/{task_id}")
	@ResponseBody
	public TaskDTO doneTask(@PathVariable("task_id") Long ID) throws Exception{
		if(taskFacade.findById(ID).isEmpty()){
			throw new Exception("Não exites tasks com este ID");
		}
		
		TaskDTO task = taskFacade.findById(ID).get();
		task.setStatus(true);
		taskFacade.save(task);
		return task;
	}
	
	@GetMapping("/add")
	public ModelAndView showFormTask() {
		ModelAndView mvn = new ModelAndView("home/form");
		return mvn;
	}
	
}
