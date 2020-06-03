package Question;

public class Question {
    public String prompt;
    public String answer;

    public Question(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
    }
    public void answerInfo(){
        System.out.println("Pytanie brzmiało: " + prompt +"\n"+
                " Prawidłowa odpowiedź to: " + answer);
    }
}
