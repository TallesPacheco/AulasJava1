import java.util.*;

public class Except {

    public static void main(String[] args){

//       try {
//           int x = 1;
//           int y = 100 / x;
//
//           String[] strings = {"", "", "", ""};
//
//           System.out.println(strings[5]);
//
//       } catch (ArithmeticException a){
//           System.out.println(a.getMessage());
//       } catch (IndexOutOfBoundsException ar){
//           System.out.println(ar.getMessage());
//           System.out.println(ar.toString());
//           System.out.println(ar.getCause());
//           System.out.println(ar.getLocalizedMessage());
//       } catch (Exception ex){
//           System.out.println(ex.getMessage());
//       }

//        System.out.println("passou");

//        String[] strings = {"", "", "", ""};
//
//        List<String> list = Arrays.asList(strings);
//        Collections.shuffle(list);
//
//        for (String str : list) {
//            System.out.println(str);
//        }

















//            System.out.println ("Resultado: " + y);
//        try{
//            int y = 100 / x;
//            System.out.println ("Resultado: " + y);
//        }
//        catch (ArithmeticException e){  System.out.println ("Operação inválida!");
//            System.out.println("\n Detalhes do erro: "+ e.getMessage());
//        }















        try {
            Pessoa p = new Pessoa();
            System.out.println("Digite a idade");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            p.setIdade(i);
//            p.setCpf("0000000000");
        } catch (InputMismatchException in){
            System.out.println (in.getMessage());
        }catch (Exception ex){
            System.out.println (ex.getMessage());
//            System.out.println("\n Detalhes do erro: "+ e.getMessage());
        }

        System.out.println("Fim");
    }



}
