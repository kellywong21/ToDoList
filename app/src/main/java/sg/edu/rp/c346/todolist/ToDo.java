package sg.edu.rp.c346.todolist;

public class ToDo {
    private String TODO;
    private String date;

    public ToDo(String TODO, String date) {
        this.TODO = TODO;
        this.date = date;
    }

    public String getTODO() {
        return TODO;
    }

    public void setTODO(String TODO) {
        this.TODO = TODO;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String toString(){
        return(getTODO()+getDate());
    }
}
