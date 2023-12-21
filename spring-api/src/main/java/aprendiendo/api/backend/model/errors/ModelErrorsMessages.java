package aprendiendo.api.backend.model.errors;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import java.util.Date;

public class ModelErrorsMessages {

    private String message;
    private Date date;
    private HttpStatus httpStatus;
    private HttpStatusCode httpStatusCode;

    public ModelErrorsMessages() {
    }

    public HttpStatusCode getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(HttpStatusCode httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
