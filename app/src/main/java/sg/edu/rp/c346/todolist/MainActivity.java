package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewToDo;
    ArrayList<ToDo> ToDoList;
    ArrayAdapter aaToDoList;
    CustomAdapter adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewToDo = findViewById(R.id.listViewToDo);
        ToDoList = new ArrayList<>();
        ToDo MSA = new ToDo("MSA", "1/7/2019");
        ToDo haircut = new ToDo("Go for haircut", "22/9/2019");
        ToDo concert = new ToDo("Go Concert", "20/07/2019");

        ToDoList.add(MSA);
        ToDoList.add(haircut);
        ToDoList.add(concert);

        aaToDoList = new ArrayAdapter(this,android.R.layout.simple_list_item_1,ToDoList);
        listViewToDo.setAdapter(aaToDoList);
        adapter = new CustomAdapter(this, R.layout.row,ToDoList);
        listViewToDo.setAdapter(adapter);




    }
}
