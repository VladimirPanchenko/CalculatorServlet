package ru.itprogram.html;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WelcomeHtml {
    public static void print(HttpServletResponse resp) throws IOException {
            resp.getWriter().write(
                    "<!DOCTYPE html>\n" +
                            "<html>\n" +
                            "<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <title>Калькулятор</title>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "    <form method=\"GET\">\n" +
                            "        <input type=\"text\" name=\"valA\"/>\n" +
                            "        <select name=\"action\">\n" +
                            "            <option value=\"+\">+</option>\n" +
                            "            <option value=\"-\">-</option>\n" +
                            "            <option value=\"*\">*</option>\n" +
                            "            <option value=\"/\">/</option>\n" +
                            "        </select>\n" +
                            "        <input type=\"text\" name=\"valB\"/>\n" +
                            "        <input type=\"submit\" name=\"submit\"/>\n" +
                            "    </form>\n" +
                            "</body>\n" +
                            "</html>"
            );
    }
}
