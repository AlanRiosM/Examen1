//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Juego[] arrayJuegos = new Juego[]{
                    new Juego("Acción", 16, "Mortal Kombat"),
                    new Juego("RPG", 14, "Final Fantasy")
            };

            for (Juego juego : arrayJuegos) {
                juego.MostrarInformacion();
                System.out.println(); // Nueva línea para separar la información de los juegos
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido una excepción: " + e.getMessage());
        }
    }
}