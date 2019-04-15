import java.util.Scanner;

public class Persona {
  private String Nombre;
  private boolean paga;
  private Scanner teclado;

  Persona() {
    teclado = new Scanner(System.in);
  }

  public void setPago(int num) {
    if (num < 10) {
      paga = false;
    } else {
      paga = true;
    }
  }

  public boolean getPago() {
    return paga;
  }

  public void setNombre() {
    System.out.print("Ingresa tu nombre: ");
    Nombre = teclado.nextLine();
  }

  public String getNombre() {
    return Nombre;
  }

}
