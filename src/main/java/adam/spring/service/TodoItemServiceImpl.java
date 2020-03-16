package adam.spring.service;

import adam.spring.model.TodoData;
import adam.spring.model.TodoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class TodoItemServiceImpl implements TodoItemService{

    //fields
    @Getter
    private final TodoData data = new TodoData();

    //public methods
    @Override
    public void addItem(TodoItem todoItem) {
        data.addItem(todoItem);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem todoItem) {
        data.updateItem(todoItem);
    }

}