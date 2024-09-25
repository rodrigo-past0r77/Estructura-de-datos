public class EvaluacionBalance {
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '{' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == '}' && top != '{') || (ch == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {

        String test = "{(a+b) * (c+d)}";
        String test2 ="{(a + b) * (c + d)";
        String test3 = "\n" + "    public void printStack() {\n" +
                "        System.out.println(\"-----\");\n" +
                "        for (int i = data.size() - 1; i >= 0; i--) {\n" +
                "            System.out.println(data.get(i) + \"\\n|---|\");\n" +
                "        }\n" +
                "    }";
        String test4 = "\n" + "public class Main {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"Hello world!\");\n" +
                "    }\n";

        System.out.println("Ecuacion 1: " + test);
        System.out.println("¿Está balanceado? " + isBalanced(test) + "\n");

        System.out.println("Ecuacion 2: " + test2);
        System.out.println("¿Está balanceado? " + isBalanced(test2) + "\n");

        System.out.println("Codigo 1: " + test3);
        System.out.println("¿Está balanceado? " + isBalanced(test3) + "\n");

        System.out.println("Codigo 2: " + test4);
        System.out.println("¿Está balanceado? " + isBalanced(test4));








    }
}

