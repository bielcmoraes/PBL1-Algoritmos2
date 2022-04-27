import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> linha = new ArrayList<String>();
    ArrayList<ArrayList<String>> matriz = new ArrayList<ArrayList<String>>();
    linha.add("0 0");
    linha.add("0 1");
    linha.add("0 2");
    matriz.add(linha);
    linha.set(0, "1 0");
    linha.set(1, "1 1");
    linha.set(2, "1 2");
    matriz.add(linha);
    System.out.println("chegou");
  }
}