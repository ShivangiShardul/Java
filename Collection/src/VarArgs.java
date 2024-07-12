class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Manik"));
        System.out.println(concatenate("Great","Work"));
        System.out.println(concatenate("You","are","Awesome"));
    }

    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
