package com.ladislav.todolist;

import com.ladislav.todolist.datamodel.TodoData;
import com.ladislav.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

/**
 * Created by Ladislav on 1/26/2017.
 */
public class DialogController {
    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsField;
    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResults(){
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsField.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        TodoItem item = new TodoItem(shortDescription, details, deadlineValue);
        TodoData.getInstance().addTodoItem(item);
        return item;
    }
}
