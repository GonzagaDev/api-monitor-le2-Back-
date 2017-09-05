package entidades;

public class ResponseService {
    private Object data;
    private String sucess;
    private String message;

    public ResponseService() {
    }

    public ResponseService(Object data, String sucess, String message) {
        this.data = data;
        this.sucess = sucess;
        this.message = message;

    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getSucess() {
        return sucess;
    }

    public void setSucess(String sucess) {
        this.sucess = sucess;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseService{" +
                "data=" + data +
                ", sucess=" + sucess +
                ", message='" + message + '\'' +
                '}';
    }
}
