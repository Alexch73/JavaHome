package home6;


public class Pupil {
    int id;

    public Pupil(int id) {
        this.id = id;
    }

    ExamResult[] examResults = new ExamResult[2];


  public void setExams(String ex[], int marks[]) {


        if (ex.length == marks.length) {
            for (int i = 0; i < ex.length; i++) {
                if ((marks[i] > 0) && (marks[i] < 6)) {
                    examResults[i] = new ExamResult(ex[i], marks[i]);
                } else System.out.println("Некорректная оценка");
            }
        } else System.out.println("неправильно задано количество предметов");
    }

    @Override
    public String toString() {
        StringBuilder results = new StringBuilder();
        for (int i = 0; i < examResults.length; i++){
            results.append("\n");
            results.append(examResults[i].toString());
        }
        return "Студент " + id + results;
    }
}