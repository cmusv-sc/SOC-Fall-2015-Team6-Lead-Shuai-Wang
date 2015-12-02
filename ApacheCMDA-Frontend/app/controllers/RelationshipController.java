package controllers;

import controllers.Application;
import play.mvc.*;
import util.APICall;
import util.APICall.ResponseType;
import views.html.*;

import play.data.*;
import play.libs.Json;
import play.*;
import static play.data.Form.*;

import models.*;
import models.metadata.UserService;

/**
 * Created by wang on 12/2/15.
 */
public class RelationshipController extends Controller {

    public static Result getFriendsList() {
        return ok(friendsList.render("firends"));
    }

    public static Result getGroup() {
        return ok(groups.render("group"));
    }
}
