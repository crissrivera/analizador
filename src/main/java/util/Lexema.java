package util;

public class Lexema {

    String token;
    String tipoLexema;

    public Lexema(String token, String tipoLexema) {
        this.token = token;
        this.tipoLexema = tipoLexema;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTipoLexema() {
        return tipoLexema;
    }

    public void setTipoLexema(String tipoLexema) {
        this.tipoLexema = tipoLexema;
    }
}
