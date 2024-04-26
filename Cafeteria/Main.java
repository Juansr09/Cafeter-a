package Cafeteria;

//Clase para mostrar los 3 tipos de café
public class Main {
 public static void main(String[] args) {
     //café espresso
     CafeEspresso espresso = new CafeEspresso(2500 , "Vaso pequeño", "Espresso", "Crema");

     // café latte
     CafeLatte latte = new CafeLatte(3500, "Vaso mediano", "Latte", "Leche Entera");

     // café mocha
     CafeMocha mocha = new CafeMocha(4500, "Vaso grande", "Mocha", "Chocolate caliente");

     // Imprime las características del café espresso
     System.out.println("Café: " + espresso.getTipo());
     System.out.println("Precio: $" + espresso.getPrecio());
     System.out.println("Envase: " + espresso.getEnvase());
     System.out.println("Ingredientes Extra: " + espresso.getIngredientesExtra());

     // Imprime las características del café latte
     System.out.println("\nCafé: " + latte.getTipo());
     System.out.println("Precio: $" + latte.getPrecio());
     System.out.println("Envase: " + latte.getEnvase());
     System.out.println("Ingredientes Extra: " + latte.getLeche());

     // Imprimiendo las características del café mocha
     System.out.println("\nCafé: " + mocha.getTipo());
     System.out.println("Precio: $" + mocha.getPrecio());
     System.out.println("Envase: " + mocha.getEnvase());
     System.out.println("Ingredientes Extra: " + mocha.getChocolate());
 }
}
