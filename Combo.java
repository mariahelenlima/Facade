public class Combo {

   public void CriarCombo(int tipo) {
      if (tipo == 1) {

         Bebida bebida = new Bebida("Coca", 6, 200);
         Sobremesa sobremesa = new Sobremesa("Sorvete de creme", 10, "Medio");
         Burguer burguer = new Burguer("X-Salada", 20, 200);

         System.out.println("Super Combo");
         System.out.println(bebida);
         System.out.println(burguer);
         System.out.println(sobremesa);

         double precoTotal = bebida.getPreco() + burguer.getPreco() + sobremesa.getPreco();

         System.out.println("preço Total: " + precoTotal);

      } else if (tipo == 2) {

         Bebida bebida = new Bebida("Fanta", 6, 200);
         Sobremesa sobremesa = new Sobremesa("Sorvete de chocolate", 10, "Medio");
         Burguer burguer = new Burguer("X-calabresa", 25, 200);

         System.out.println("Combo Master");
         System.out.println(bebida);
         System.out.println(burguer);
         System.out.println(sobremesa);
         double precoTotal = bebida.getPreco() + burguer.getPreco() + sobremesa.getPreco();
         System.out.println("preço Total: " + precoTotal);

      }
   }

   @Override
   public String toString() {
      return """
             ************************************
                       Thanks 
             ************************************         
              """;
   }
}