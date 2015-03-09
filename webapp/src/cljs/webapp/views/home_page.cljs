(ns webapp.views.home-page
  (:require
   [webapp.views.nav-bar :refer [nav-bar]]
   [webapp.views.sections]))

(defn home-page []
  [:div.container
   (nav-bar "")
   (webapp.views.sections/contact-element)
   (webapp.views.sections/about-element)
   (webapp.views.sections/personalproject-element)])
