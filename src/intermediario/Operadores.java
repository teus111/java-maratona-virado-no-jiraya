package intermediario;

public class Operadores {
    public static void main (String[] arms) {
        int senhaDeMateus = 242414;
        String emailDeMateus = "mateusveiga75@gmail.com";

        int senhaDigitada = 253414;
        String emailDigitado = "mateusveiga75@gmail.com";

        boolean senhaCorreta = senhaDigitada == senhaDeMateus;
        boolean emailCorreto = emailDigitado.equals(emailDeMateus);

        if (senhaCorreta && emailCorreto) {
            System.out.println("Login correto!");
        } else {
            System.out.println("E-mail ou senha incorretos!");
        }
    }


}


