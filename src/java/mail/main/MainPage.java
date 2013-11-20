package mail.main;

import mail.base.BasePage;
import mail.session.AuthenticatedWebPage;
import mail.session.SignInSession;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import tour.order.OrderPage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Valentin
 */
public final class MainPage extends BasePage implements AuthenticatedWebPage {

    public MainPage() {

        SignInSession session = getMySession();

        add(new Label("myLabel", "Welcome :" + session.getUser().toString()));
        add(new BookmarkablePageLink<OrderPage>("OrderPage", OrderPage.class));

    }

    private SignInSession getMySession() {
        return (SignInSession) getSession();
    }
}