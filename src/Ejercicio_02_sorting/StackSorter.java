package Ejercicio_02_sorting;
import Materia.controllers.StackG;

public class StackSorter {
    public static void sortStack(StackG<Integer> stack){
        StackG<Integer> pilaAuxiliar = new StackG<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!pilaAuxiliar.isEmpty() && pilaAuxiliar.peek() > temp) {
                stack.push(pilaAuxiliar.pop());
            }

            pilaAuxiliar.push(temp);
        }

        while (!pilaAuxiliar.isEmpty()) {
            stack.push(pilaAuxiliar.pop());
        }
    }
}
