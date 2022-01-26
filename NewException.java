public class NewException extends Exception{
    private String exceptionMessage;
    public NewException(String exceptionMessage){
        this.exceptionMessage = exceptionMessage;
    }
    public String getExceptionMessage(){
        return exceptionMessage;
    }
}
