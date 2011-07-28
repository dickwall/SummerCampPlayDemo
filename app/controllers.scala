package controllers

import play._
import play.mvc._

object Application extends Controller {
    
    import views.Application._
    
    def index = {
        html.index()
    }
}

object SummerCampInfo extends Controller {
  import views.Application.summercamp._

  def findoutmore = {
    html.findoutmore()
  }
}

object SummerCampSignup extends Controller {
  import views.Application.summercamp._
  import models.SignupDetails

  def registrationform = {
    html.registrationform(new SignupDetails)
  }

  def register(details: SignupDetails) = {
    import play.data.validation._

    Validation.required("name", details.name)
    Validation.isTrue("releaseSigned", details.releaseSigned) message "You must sign the release form"
    Validation.required("email", details.email)
    Validation.email("email", details.email)
    if (Validation.hasErrors) html.registrationform(details)
    else html.registrationcomplete(details)
  }
}