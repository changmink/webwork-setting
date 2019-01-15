import com.opensymphony.xwork.Action;

public class HelloAction implements Action {
    private String message;

    public String execute() throws Exception {
        this.message = "Hello world!";
        return SUCCESS;
    }

    public String getMessage() {
        return message;
    }

}
