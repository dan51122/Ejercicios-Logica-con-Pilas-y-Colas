import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.controllers.StackG;
public class App {
    public static void main(String[] args) throws Exception {
        SignValidator vs = new SignValidator();
        String ejemplo1 = "([]){}";
        String ejemplo2 = "({)}";

        System.out.println("Ejemplo 1: " + vs.isValid(ejemplo1));
        System.out.println("Ejemplo 2: " + vs.isValid(ejemplo2));

        StackSorter sS = new StackSorter();
        StackG<Integer> ejemplo = new StackG<>();
        ejemplo.push(5);
        ejemplo.push(1);
        ejemplo.push(4);
        ejemplo.push(2);

        System.out.print("Antes (Desordenado): ");
        ejemplo.printStack();

        sS.sortStack(ejemplo);

        System.out.print("Después (Oredenado): ");
        ejemplo.printStack();
    }
}
