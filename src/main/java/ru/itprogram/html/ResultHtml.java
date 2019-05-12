package ru.itprogram.html;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResultHtml {
    public static void print(HttpServletResponse resp, double result) throws IOException {
        resp.getWriter().write(
                "<!DOCTYPE html>\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>Результат</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "    <h2>Результат = " + result + "</h2> \n" +
                        "</body>\n" +
                        "</html>"
        );
    }
}
