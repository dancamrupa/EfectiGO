package plataforma.efectigo.exceptions;

public class InvalidMessageException extends AssertionError {

  public InvalidMessageException(String message, Throwable cause) {
    super(message, cause);
  }
}
