public class DemoPersonas {
  public static void main(String[] args) {
    Persona gente[] = new Persona[30];
    for (int i = 0; i < 30; i++) {
      gente[i] = new Persona();
      gente[i].setNombre();
      gente[i].setPago(i);
      System.out.print(gente[i].getNombre() + " : ");
      if (gente[i].getPago()) {
        System.out.println("Debes pagar la inscripción!");
      } else {
        System.out.println("Tu inscripcion es gratuita!");
      }
    }
  }
}
