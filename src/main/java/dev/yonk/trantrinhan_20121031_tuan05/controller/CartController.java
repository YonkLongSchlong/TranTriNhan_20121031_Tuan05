package dev.yonk.trantrinhan_20121031_tuan05.controller;

import dev.yonk.trantrinhan_20121031_tuan05.models.Cart;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "CartController", urlPatterns = "/CartController")
public class CartController extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action != null && !action.isEmpty()) {
            if (action.equals("add")) {
                addToCart(req);
            } else if (action.equals("Delete")) {
                deleteCart(req);
            } else if (action.equals("Update")) {
                updateCart(req);
            }
        }
        resp.sendRedirect("/ShoppingCart.jsp");
    }

    protected void deleteCart (HttpServletRequest req) {
        HttpSession session = req.getSession();
        String itemIndex = req.getParameter("itemIndex");
        Object objCart = session.getAttribute("cart");
        Cart cart = null;

        if (objCart != null) {
             cart = (Cart) objCart;
        } else {
            cart = new Cart();
        }
        cart.deleteCartItem(itemIndex);
    }

    protected void updateCart (HttpServletRequest req) {
        HttpSession session = req.getSession();
        String quantity = req.getParameter("quantity");
        String itemIndex = req.getParameter("itemIndex");
        Object objCart = session.getAttribute("cart");
        Cart cart = null;

        if (objCart != null) {
            cart = (Cart) objCart;
        } else {
            cart = new Cart();
        }
        cart.updateCartItem(quantity, itemIndex);
    }

    protected void addToCart (HttpServletRequest req) {
        HttpSession session = req.getSession();
        String modelNo = req.getParameter("modelNo");
        String description = req.getParameter("description");
        String price = req.getParameter("price");
        String quantity = req.getParameter("quantity");

        Object objCart = session.getAttribute("cart");
        Cart cart = null;

        if (objCart != null) {
            cart = (Cart) objCart;
        } else {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }

        cart.addCartItem(modelNo, description, price, quantity);

    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
