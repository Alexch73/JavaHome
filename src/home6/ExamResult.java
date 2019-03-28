package home6;

public class ExamResult{
    String ex;
    int marks;

    public ExamResult(String ex, int marks) {
        this.ex = ex;
        this.marks = marks;
    }

    @Override
    public String toString() {
        if ( marks > 2) return ex + " сдал";
        else return ex + " не сдал";
    }
}