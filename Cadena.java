package Package1;

public class Cadena {
    public void ejercicio (){

        int caracter;
        int total=0;
        String cadenas = "    1  2 3  4  5   u  6   y 7   i         ";
        String cad = cadenas.trim();
        String[] parts = cad.split(" ");
        for (int i=0; i < parts.length;i++) {

            try {
                caracter = Integer.parseInt(parts[i]);
                total = total + caracter;
            } catch (NumberFormatException ex) {
                System.out.println(parts[i]+" no es numero");
            }

        }
        System.out.println(total);
    }
}
