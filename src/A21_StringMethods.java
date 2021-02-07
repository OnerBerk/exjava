public class A21_StringMethods {
    public static void main(String[] args) {
        String name = "oner";

        if (name.equals("oner")){
            System.out.println("1. bienvenue " + name);
        }

        if (name.equals("ONER")){
            System.out.println("2. bienvenue" + name);
        }else {
            System.out.println("2. Qui etes vous ?");
        }

        if (name.equalsIgnoreCase("ONER")){
            System.out.println("3. bienvenue " + name);
        }

        System.out.printf("The lenght of '%s' is %d\n", name, name.length() );
    }
}
