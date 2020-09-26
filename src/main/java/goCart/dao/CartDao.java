package goCart.dao;
import java.io.IOException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import goCart.model.Cart;
import goCart.model.CartItem;

@Repository
public class CartDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Cart getCartById(int cartId) {
        Cart cart = null;
        try (Session session = sessionFactory.openSession()) {
            cart = session.get(Cart.class, cartId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cart;
    }
}

