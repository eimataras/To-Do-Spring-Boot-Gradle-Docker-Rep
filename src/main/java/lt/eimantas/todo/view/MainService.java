package lt.eimantas.todo.view;

import lt.eimantas.todo.model.ItemDTO;
import org.springframework.data.repository.CrudRepository;

public interface MainService extends CrudRepository<ItemDTO, Integer> {
}
