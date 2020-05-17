package builder;

/**
 * Builder DP demo - creational pattern
 */
public class Demo1 {
    public static void main(String[] args) {
        String hell= "Hello";
        System.out.println("<p>" + hell + "</p>");
        String[] words = {"hello", "world"};
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        for(String word : words) {
            sb.append(String.format("<li> %s </li>\n", word));
        }
        sb.append("</ul>");
        System.out.println(sb);
    }
}
