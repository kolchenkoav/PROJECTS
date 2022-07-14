public class Main {
    public static void main(String[] args) {
        String [] roles = {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }


    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sb = new StringBuilder();
        String role = "";
        for (int i = 0; i < roles.length; i++) {
            role = roles[i] + ":";
            sb.append(role + "\n");
            int position = 0;
            for (int j = 0; j < textLines.length; j++) {
                position++;
                String text = textLines[j];
                if (text.startsWith(role)) {
                    text = text.substring(role.length() + 1);
                    sb.append(position + ") " + text + "\n");
                }
            }
            if (i < roles.length) {
                sb.append("\n");
            }
        }
        return sb.toString().trim();
    }

    public static String printTextPerRole2(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        String toBeDeleted = "";
        for (int i = 0; i < roles.length; i++) {
            toBeDeleted = roles[i] + ":";
            result.append(toBeDeleted);
            for (int j = 0; j < textLines.length; j++){
                if (textLines[j].startsWith(toBeDeleted)) {
                    textLines[j] = textLines[j].replaceFirst(toBeDeleted, "");
                    result.append(String.format("\n%d)%s", j + 1, textLines[j]));
                }
            }
            result.append("\n\n");
        }
        return result.toString().trim();
    }
}
