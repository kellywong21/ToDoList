package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDo> todoList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDo> objects) {

        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        todoList = objects;

    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent,false);
        TextView tvToDo = rowView.findViewById(R.id.tvToDo);
        TextView tvDate = rowView.findViewById(R.id.tvDate);
        ToDo todo = todoList.get(position);
        tvToDo.setText(todo.getTODO());
        tvDate.setText(todo.getDate());
        return rowView;

    }

}
