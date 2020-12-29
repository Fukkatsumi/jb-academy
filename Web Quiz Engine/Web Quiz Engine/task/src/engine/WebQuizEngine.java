//package engine;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.Arrays;
//import java.util.Objects;
//
//@RestController
//@SpringBootApplication
//public class WebQuizEngine {
//
//    public static void main(String[] args) {
//        SpringApplication.run(WebQuizEngine.class, args);
//    }
//
//
//
//}
//
//@Service
//class SolveService {
//    public Solve passQuiz() {
//        return new Solve(true, "Congratulations, you're right!");
//    }
//
//    public Solve failQuiz() {
//        return new Solve(false, "Wrong answer! Please, try again.");
//    }
//
//}
//
//class Quiz {
//    private String title;
//    private String text;
//    private String[] options;
//
//    public Quiz() {
//    }
//
//    public Quiz(String title, String text, String[] options) {
//        this.title = title;
//        this.text = text;
//        this.options = options;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public String[] getOptions() {
//        return options;
//    }
//
//    public void setOptions(String[] options) {
//        this.options = options;
//    }
//
//    public String toString() {
//        return "Quiz{" +
//                "title='" + title + '\'' +
//                ", text='" + text + '\'' +
//                ", options=" + java.util.Arrays.toString(options) +
//                '}';
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//        Quiz quiz = (Quiz) object;
//        return java.util.Objects.equals(title, quiz.title) && java.util.Objects.equals(text, quiz.text) && java.util.Arrays.equals(options, quiz.options);
//    }
//
//    public int hashCode() {
//        int result = Objects.hash(super.hashCode(), title, text);
//        result = 31 * result + Arrays.hashCode(options);
//        return result;
//    }
//}
//
//class Solve {
//    private boolean success;
//    private String feedback;
//
//    public Solve() {
//
//    }
//
//    public Solve(boolean success, String feedback) {
//        this.success = success;
//        this.feedback = feedback;
//    }
//
//    public boolean isSuccess() {
//        return success;
//    }
//
//    public void setSuccess(boolean success) {
//        this.success = success;
//    }
//
//    public String getFeedback() {
//        return feedback;
//    }
//
//    public void setFeedback(String feedback) {
//        this.feedback = feedback;
//    }
//
//    public String toString() {
//        return "Solve{" +
//                "success=" + success +
//                ", feedback='" + feedback + '\'' +
//                '}';
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//        Solve solve = (Solve) object;
//        return success == solve.success && java.util.Objects.equals(feedback, solve.feedback);
//    }
//
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), success, feedback);
//    }
//}
