package com.ramses.ToDo.Tasks;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskFACADE extends CrudRepository<TaskDTO, Long>{

}
//@Service
//public class TaskFACADE{
//	private Map<Long, TaskDTO> tasks = new HashMap<>();
//	
//	public TaskDTO create(TaskDTO taskDTO) {
//		 Long proximoId = tasks.keySet().size()+1L;
//		 taskDTO.setID(proximoId);
//		 tasks.put(proximoId,taskDTO);
//		 return taskDTO;
//	}
//	
//	public TaskDTO update(Long id,TaskDTO taskDTO) {
//		tasks.put(id, taskDTO);
//		
//		return taskDTO;
//	}
//	
//	public TaskDTO getByID(Long id) {		
//		return tasks.get(id);
//	}
//	
//	public String delete(Long id) {
//		tasks.remove(id);
//		return "Deletado com sucesso";
//	}
//}
