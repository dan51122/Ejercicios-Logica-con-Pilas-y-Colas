package Ejercicio_01_sign;
import Materia.controllers.StackG;

public class SignValidator {

    public Boolean isValid(String s){
        StackG<Character> stack = new StackG<>();
        for (int i = 0; i < s.length(); i++) {
            char caracter = s.charAt(i);

            if (caracter == '(' || caracter == '{' || caracter == '[') {
                stack.push(caracter);
            } else if (caracter == ')' || caracter == '}' || caracter == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((caracter == ')' && top != '(') ||(caracter == '}' && top != '{') ||(caracter == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return false;
    }
}
