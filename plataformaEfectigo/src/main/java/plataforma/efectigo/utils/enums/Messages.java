package plataforma.efectigo.utils.enums;

public enum Messages {
    LOGIN_ERROR("La contraseña es incorrecta. Vuelve a intentarlo o da clic en '¿Olvidaste tu contraseña?' para restablecerla."),
    SUCCESSFUL_CREDIT_APPLICATION("Tu solicitud se envió con éxito"),
    REQUEST_CANCELED("Solicitud cancelada");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
