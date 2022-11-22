package sm.project.servingwebcontent.repo;

import org.springframework.data.repository.CrudRepository;
import sm.project.servingwebcontent.model.Message;

public interface MessageRepo extends CrudRepository<Message, Integer> {

}
