package models

/**
 * Created by IntelliJ IDEA.
 * User: dick
 * Date: 7/27/11
 * Time: 4:02 PM
 * To change this template use File | Settings | File Templates.
 */

case class SignupDetails(name: String = "John Smith", email: String = "john@smith.com",
                         shirtSize: String = "L", releaseSigned: Boolean = false)