package ru.itprogram;

import ru.itprogram.html.ResultHtml;
import ru.itprogram.html.WelcomeHtml;
import ru.itprogram.service.CalculationService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {
    private static final String VALUE_A = "valA";
    private static final String VALUE_B = "valB";
    private static final String ACTION = "action";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        if (req.getParameter(VALUE_A) == null
                || req.getParameter(VALUE_B) == null
                || req.getParameter(ACTION) == null) {
            WelcomeHtml.print(resp);
        } else {
            CalculationService calculationService = new CalculationService();
            ResultHtml.print(resp, calculationService.getResult(
                    req.getParameter(VALUE_A),
                    req.getParameter(VALUE_B),
                    req.getParameter(ACTION)));
        }
    }
}
