package adam.spring.service;

import adam.spring.model.TodoData;
import adam.spring.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem todoItem);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem todoItem);
    TodoData getData();

}
